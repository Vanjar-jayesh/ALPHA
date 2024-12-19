package baseLinkedlist;

public class DoubleLL {
    public class Node {
        
        int data;
        Node next;
        Node prve;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prve = null;
        }
        
    }
    public static Node head;
    public static Node tail;
    public static int size;
    // add
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prve = newNode;
        head = newNode;
    }

    //addlast
    public void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prve = newNode;
        tail = newNode;
    }
    // print
    public void print(){
        Node temp = head;
      //  System.out.println("null");
        while (temp != null) {
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println();
    }
    // remove - removelast
    public int removeLast() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // prev : i = size -2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    // remove - fast
    public int removefirst() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prve = null;
        size--;
        return val;
    }

    // reverse a Dll
    public void reverse() {
        Node prev = null;

        Node curr = tail = head;

        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prve= next;// print dll revese modul
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addlast(4);
        dll.addlast(6);

       dll.print();
     //   System.out.println(size);
       // dll.removeLast();
      //  dll.print();
       // System.out.println(size);
       dll.reverse();
       dll.print();
    }
}
