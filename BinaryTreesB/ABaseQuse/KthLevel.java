package ABaseQuse;

public class KthLevel {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static void Kleve(Node root,int level,int K){
        if (root == null) {
            return;
        }

        if (level == K) {
            System.out.print(root.data +" ");
            return;
        }

        Kleve(root.left, level+1, K);
        Kleve(root.right, level+1, K);
    }
    public static void main(String[] args) {
          /*
         *          1
         *         / \
         *        2   3
         *       / \ / \
         *      4  5 6  7
         */

         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);

         int K =3;
         Kleve(root,1, K);
    }
}
