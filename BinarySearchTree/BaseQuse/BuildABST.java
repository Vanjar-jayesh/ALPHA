package BaseQuse;

public class BuildABST {

    static class Node {
            int data;
        
            Node left;
            Node right;

            Node(int data){
                this.data =data;
            }
        
    }

    public static Node inert(Node root,int val){
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
           root.left = inert(root.left, val);
        }
        else{
            root.right = inert(root.right, val);
        }

        return root;
    }
    public static void Inorder(Node root){
      if (root == null) {
        return;
      }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    public static boolean search(Node root,int key){
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (root.data > key) {
           return  search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {
        int values[] ={5,1,3,4,2,7,6,9,10,8};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = inert(root, values[i]);
        }

        Inorder(root);
        System.out.println();

        if (search(root, 11)) {
            System.out.println("found");
        }else{
            System.out.println("No found");
        }
    }
}
