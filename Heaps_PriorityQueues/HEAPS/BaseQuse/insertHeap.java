package HEAPS.BaseQuse;

import java.util.ArrayList;

public class insertHeap {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {// 0(long)
            // add at last idx

            arr.add(data);
            int x = arr.size() - 1;// x is a child index
            int par = (x - 1) / 2;// par index

            while (arr.get(x) < arr.get(par)) {// 0(long) Mxa >
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);


                x = par;
                par = (x-1)/2;
            }

        }

        public int peek() {
            return arr.get(0);

        }

        private void heapify(int idx) {

            int left = 2 * idx + 1;
            int rigth = 2 * idx + 2;
            int minIdx = idx;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {//max <
                minIdx = left;
            }

            if (rigth < arr.size() && arr.get(minIdx) > arr.get(rigth)) {//max <
                minIdx = rigth;
            }

            if (minIdx != idx) {
                // swap
                int temp = arr.get(idx);
                arr.set(idx, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove() {
            int data = arr.get(0);
            // step1 - swap first & last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // step2 - delete first & last
            arr.remove(arr.size() - 1);

            // step3 - heapify
            heapify(0);


        
            return data;

        }

        public boolean isEmpty(){
            return arr.size() == 0;
            
        }
    }

    public static void main(String[] args) {

        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) { // heap sort - 0(long)
            System.out.println(h.peek());
            h.remove();
        }
    }
}
