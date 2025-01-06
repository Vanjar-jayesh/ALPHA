package ABaseQuse;

public class MinDistancebetweenNode {
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

       // Approach 02
       public static Node lca2(Node root,int n1,int n2){
        // if (root == null) {
        //     return null;
        // }   
        
        if (root == null || root.data == n1 || root.data == n2) {
                return root;
            }
            Node leftLca = lca2(root.left, n1, n2);
            Node rightLca = lca2(root.right, n1, n2);

            // leftLCa = val rightLca = null
            if (rightLca == null) {
                return leftLca;
            }

            if (leftLca == null) {
                return rightLca;
            }

            return root;
    }

    public static int lacdist(Node root,int n){
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int leftdist = lacdist(root.left, n);
        int rightdist = lacdist(root.right, n);

        if (leftdist == -1 && rightdist == -1) {
            return -1;
        }else if (leftdist == -1) {
                return rightdist+1;
        }else{
            return leftdist+1;
        }

    }
    public static int MinDist(Node root,int n1,int n2){
        Node lca = lca2(root, n1, n2);

        int dist1 = lacdist(lca,n1);
        int dist2 = lacdist(lca,n1);

        return dist1 + dist2;
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

         int n1 = 4, n2 = 6;

         System.out.println(MinDist(root, n1, n2));
    }
}
