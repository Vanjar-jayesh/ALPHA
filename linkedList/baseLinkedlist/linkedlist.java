package baseLinkedlist;

public class linkedlist {

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

    // methods 1 

    public void addFirst(int data) {

        // step1 = create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 = newnode next = head
        newNode.next = head;// link
        // step3 head = newnode
        head = newNode;
    }
 // method 2 ;
    public void addlast(int data){
        // step1 = create a new node;
        Node newnode = new Node(data);
        size++;

        if (head ==null) {
            head = tail = newnode;
            return;
        }

        // step2 = tail.next = newnode
        tail.next = newnode;

        // step3 = tail = newnode
        tail = newnode;
    }

    public void printlist(){
        // if (head == null) {
        //     System.out.println("ll is empty");
        //     return;
        // }
        Node temp = head;

        while (temp!= null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx,int data){
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i =0;

        while (i< idx-1) {
            temp = temp.next;
            i++;
        }
        // i = idx -1 ; temp -> prev
        newnode.next = temp.next;
        temp.next = newnode;
    }

    
    public int removefirst(){
        if (size==0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if (size==0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }

        // prev : i = size -2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key){
        Node temp = head; 
        int i = 0;
 
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }

            temp = temp.next;
            i++;

        }

         // key not found
         return -1;
    }

    // searc(recursive)
    public int helper(Node head,int key){
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx+1;
    }
    public int recSeach(int key){
            return helper(head, key);
    }

    public void reverse() {
        Node prev = null;

        Node curr = tail = head;

        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.printlist();
        ll.addFirst(2);
        ll.printlist();
        ll.addFirst(1);
        ll.printlist();
        ll.addlast(3);
        ll.printlist();
        ll.addlast(4);
        ll.add(2, 9);
        ll.printlist();

        System.out.println(ll.size);

    }
}
