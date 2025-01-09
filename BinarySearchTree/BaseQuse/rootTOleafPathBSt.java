package BaseQuse;
import  java.util.*;
public class rootTOleafPathBSt {
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

    public static void printPath(ArrayList<Integer> path){
        for(int i =0; i<path.size(); i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }
    public static void PrintRoot2Leaf(Node root,ArrayList<Integer> path){
        if (root == null) {
            return;
        }
        
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        }
        PrintRoot2Leaf(root.left, path);
        PrintRoot2Leaf(root.right, path);

        path.remove(path.size()-1);

    }
        public static void main(String[] args) {
        int values[] = {8,5,3,6,10,11,14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = inert(root, values[i]);
        }

        Inorder(root);
        System.out.println();

        PrintRoot2Leaf(root, new ArrayList<>());
      
    }
}
