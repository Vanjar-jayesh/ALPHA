package BaseQuse;

public class LonhestWordwithallprefixes {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }

    }

    public static Node root = new Node();

    public static void intsert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';

            if (curr.children[idx] == null) {

                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    
    public static boolean search(String key) {
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';

            if (curr.children[idx] == null) {

                return false;
            }
            curr = curr.children[idx];
        }

        return curr.eow == true;
    }
    
    public static String ans="";

    public static void LonhestWord(Node root, StringBuilder temp){

        if (root==null) {
            return;
        }

        for(int i=0; i<26; i++){
            if ((root.children[i] != null) && (root.children[i].eow == true)) {
               char ch = (char)(i+'a');
                temp.append(ch);
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }

                LonhestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public static void main(String[] args) {
        String words[] = {"a","banana","app","aapl","ap","apply","apple"};


        for(int i=0; i<words.length; i++){
            intsert(words[i]);
        }

        LonhestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
