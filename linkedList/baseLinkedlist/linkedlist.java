package baseLinkedlist;

import java.util.NoSuchElementException;

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

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i = idx -1 ; temp -> prev
        newnode.next = temp.next;
        temp.next = newnode;
    }

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
        size--;
        return val;
    }

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

    public int itrSearch(int key) {
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
    public int helper(Node head, int key) {
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

        return idx + 1;
    }

    public int recSeach(int key) {
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

    public void DeleteNthfromENd(int n) {
        // Calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next;
            return;
        }

        // sz-n
        int i = 1;
        int iTOfind = sz - n;
        Node prve = head;
        while (i < iTOfind) {
            prve = prve.next;
            i++;
        }

        prve.next = prve.next.next;
        return;
    }

    // slow-fast Approach
    public Node findMid(Node head) { // helper
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
        }
        return slow;// slow is my midNOde
    }

    public boolean chechPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step1 - find mid
        Node midNode = findMid(head);

        // setp 2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head;
        // step3 - check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }

    // detecta loop cycle in a ll

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null ) {
             slow = slow.next;//+1
             fast = fast.next.next;//+2
            if (slow == fast) {
                return true;//cycle exists
            }

        }

        return false; // cycle doesn`t exist
    }


    public static void removeycle(){
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean exists = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                exists = true;
                break;
            }
        }

        if (exists == false) {
            return;
        }
        //find meeting point
            slow = head;
            Node prev = null;
            while (slow != fast) {
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }
        // remove cycle -> last.next = null
        prev.next = null;
    }


    // merge Sort on a linked list

    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
        }
        return slow;// slow is my midNOde
    }

    private Node merge(Node head1,Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;

            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
        
    }
    public Node mergesort(Node head){
        if (head==null || head.next == null) {
            return head;
        }
        // find min
        Node mid = getMid(head);
        // lest & right Ms
        Node rightHead = mid.next;
        mid.next = null;
       Node newLeft =  mergesort(head);
       Node newRight =  mergesort(rightHead);


        // merge

        return merge(newLeft,newRight);
    }
    // Zig - Zag linked list 
    public void zigzag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        // reverse @nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL , NextR;
        // alt Merge - ZigZag
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            NextR = right.next;
            right.next = nextL;

            left = nextL;
            right = NextR;
        }
    }
     public void swapNode(int x , int y){
        if (x == y) {
            return;
        }

        Node prevX = null,currX = head;

        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;

        }

        Node prevY = null, currY= head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null) {
            return;
        }
        if (prevX != null) {
            prevX.next = currY;
        }else{
            head = currY;
        }

        if (prevY != null) {
            prevY.next = currX;
        }else{
            head = currX;
        }

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next  = temp;

    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();

        // ll.addFirst(2);

        // ll.addFirst(1);

        // ll.addlast(3);

        // ll.addlast(4);
        // ll.add(2, 9);

        // ll.printlist();
        // // System.out.println(ll.recSeach(3));
        // // System.out.println(ll.recSeach(10));

        // // System.out.println(ll.size);
        // // ll.reverse();
        // ll.DeleteNthfromENd(3);
        // ll.printlist();

        // ll.addlast(1);
        // ll.addlast(2);
        // ll.addlast(2);
        // ll.addlast(1);

        // ll.printlist(); // 1 2 2 1
        // System.out.println(ll.chechPalindrome());

        // head = new Node(3);
        // Node temp  = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(0);
        // head.next.next.next = new Node(-4);
        //  head.next.next.next.next = temp;

        // System.out.println(isCycle());
        //removeycle();
        //System.out.println(isCycle());

        // merge sort 
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);

        // 1 2 3 4 5

        // ll.printlist();
        // ll.head = ll.mergesort(ll.head);
        // ll.printlist();

        ll.printlist();
        ll.zigzag();
        ll.printlist();
          ll.addlast(7);
        ll.addlast(6);
        ll.addlast(5);
        ll.addlast(4);
        ll.addlast(3);
        ll.addlast(2);
        ll.addlast(1);
        
        System.out.println("linked list befor");
        ll.printlist();

        ll.swapNode(4, 3);
    

        System.out.println("linked list after");
        ll.printlist();
    }
}
