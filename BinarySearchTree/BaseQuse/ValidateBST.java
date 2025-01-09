package BaseQuse;

import java.util.ArrayList;

public class ValidateBST {
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

    public static boolean isValiBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;

        }

        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }

        return isValiBST(root.left, min, root) && isValiBST(root.right, root, max);

    }

    public static void main(String[] args) {
        int values[] = { 1,1,1 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = inert(root, values[i]);
        }

        Inorder(root);
        System.out.println();

        if(isValiBST(root, null, null)){
            System.out.println("valid");
        }else{
            System.out.println("not valid");
        }

    }
}
