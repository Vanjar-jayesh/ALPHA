package BaseQuse;

public class DiameterOfaTree {
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

    public static int Height(Node root){
        if (root == null) {
            return 0;
        }

        int lh = Height(root.left);
        int rh = Height(root.right);
       return  Math.max(lh, rh)+1;
    }

    public static int Diameter2(Node root){
        if (root == null) {
            return 0;

        }

        int ldiam = Diameter2(root.left);
        int lh = Height(root.left);
        int rdiam = Diameter2(root.right);
        int rh = Height(root.right);


        int selfdiam = lh + rh +1;

       return  Math.max(selfdiam, Math.max(ldiam, rdiam));
    }

    public static Info Diameter(Node root){
        
        if (root == null) {
            return new Info(0, 0);
        }
        Info lInfo = Diameter(root.left);
        Info rInfo = Diameter(root.right);

        int diam = Math.max(Math.max(lInfo.diam, rInfo.diam),lInfo.ht+rInfo.ht+1);

        int ht = Math.max(lInfo.ht, rInfo.ht) +1;

        return new Info(diam, ht);
        
    }

    static class Info {
    
        int diam;
        int ht;

        public Info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
        
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

         System.out.println(Diameter(root).diam);
        
    }
}
