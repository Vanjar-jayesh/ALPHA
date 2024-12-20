package Quse;

public class Solution {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

   public void addlast(int data) {
        // step1 = create a new node;
        Node newnode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newnode;
            return;
        }

        // step2 = tail.next = newnode
        tail.next = newnode;

        // step3 = tail = newnode
        tail = newnode;
    }
    public void printlist() {
        // if (head == null) {
        // System.out.println("ll is empty");
        // return;
        // }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    static void skipMdeleteN(Node head, int m, int n) {

        Node curr = head, t;
        int count;

        while (curr != null) {
            for (count = 1; count < m && curr != null; count++) {
                curr = curr.next;
            }

            if (curr == null) {
                return;
            }
            t = curr.next;

            for(count = 1; count<=n && t != null; count++){
                Node temp = t;
                t = t.next;
            }

            curr.next = t;
            curr = t;
        }
    }

    public static void main(String[] args) {
        Solution ll = new Solution();
        Node head = null;
        int M=2, N=3;

        ll.addlast(10);
        ll.addlast(9);
        ll.addlast(8);
        ll.addlast(7);
       ll.addlast(6);
       ll.addlast(5);
       ll.addlast(4);
       ll.addlast(3);
       ll.addlast(2);
       ll.addlast(1);
        System.out.printf("M = %d, N = %d \n" +"Linked list we have is :\n", M, N);
        ll.printlist();

       // skipMdeleteN(head, M, N);
        ll.skipMdeleteN(head, M, N);
        System.out.printf("\nLinked list on deletion is :\n");
        ll.printlist();

    }
}
