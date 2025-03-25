
package BaseQuse;

public class printRangBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

    }

    public static Node inert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = inert(root.left, val);
        } else {
            root.right = inert(root.right, val);
        }

        return root;
    }

    public static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void printRang(Node root,int k1,int k2){
        if (root == null) {
            return;
        }

        if (root.data >= k1 && root.data <= k2) {
            printRang(root.left, k1, k2);
            System.out.print(root.data+" ");
            printRang(root.right, k1, k2);
        }

        else if (root.data <= k1) {
            printRang(root.left, k1, k2);
        }else{
            printRang(root.right, k1, k2);
        }
    }

    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = inert(root, values[i]);
        }

        Inorder(root);
        System.out.println();

        printRang(root, 5, 12);
        
    }
}
