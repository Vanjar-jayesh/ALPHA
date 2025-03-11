

package BaseQuse;

public class MirrorABST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }

    }
    public static void preOrder(Node root){
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

        public static Node Mirror(Node root){
            if (root == null) {
                return null;
            }


            Node ls = Mirror(root.left);
            Node rl = Mirror(root.right);

            root.left = rl;
            root.right = ls;

            return root;

        }

       
    public static void main(String[] args) {

            /**
             *      8
             *     / \
             *    5   10
             *   / \    \
             *  3   6    11
             * 
             */
            Node root = new Node(8);
            root.left = new Node(5);
            root.right = new Node(10);
            root.left.left =new Node(3);
            root.left.right = new Node(6);
            root.right.right = new Node(11);

              /**
             *      8
             *     / \
             *    10  5
             *   /    / \
             *  11   6   3
             *  
             * Mirror BST
             */
           
            preOrder(root);
            System.out.println();
            Mirror(root);
            System.out.println();

            preOrder(root);
        

    }
}
