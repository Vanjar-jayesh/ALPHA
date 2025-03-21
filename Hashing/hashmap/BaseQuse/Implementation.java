package hashmap.BaseQuse;

import java.util.*;

public class Implementation {
    static class Hashmap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;// n
        private int N;
        private LinkedList<Node> buckets[];// N

        @SuppressWarnings("unchecked")
        public Hashmap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashfunction(K key) {

            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                //
                di++;
            }

            return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldbuck[] = buckets;
            buckets = new LinkedList[N * 2];
            N = 2 * N;

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            // nodes -> add in bucket
            for (int i = 0; i < oldbuck.length; i++) {
                LinkedList<Node> ll = oldbuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                   // put(node.key, node.value);
                   put(node.key, node.value);

                }
            }
        }

        public void put(K key, V value) { // 0(lamda)

            int bi = hashfunction(key); // 0 to 3

            int di = SearchInLL(key, bi);// valid; -1

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lamda = (double) n / N;

            if (lamda > 2.0) {
                rehash();
            }

        }

        public boolean containsKey(K key) {
            
            int bi = hashfunction(key); // 0 to 3

            int di = SearchInLL(key, bi);// valid; -1

            if (di != -1) {
                return true;
            } else {
                return false;
            }
        }

        public V remove(K key) {
            
            int bi = hashfunction(key); // 0 to 3

            int di = SearchInLL(key, bi);// valid; -1

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        public V get(K key) {
           
            int bi = hashfunction(key); // 0 to 3

            int di = SearchInLL(key, bi);// valid; -1

            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keyset() {
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(Node node: ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n == 0;

        }

    }

    public static void main(String[] args) {
        Hashmap<String,Integer> hm = new Hashmap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("INdonesia", 6);
        hm.put("Nepal", 5);

       // System.out.println(hm);
        ArrayList<String> keys = hm.keyset();
        for (String k : keys) {
            System.out.println(k);
        }

        System.out.println();
        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
    }
}
