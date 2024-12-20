package Quse;

import baseLinkedlist.linkedlist;

public class linkedlist01 {
    static class Node {
        int data;
        Node next;

        Node(int da) {
            data = da;
            next = null;
        }

    }

    public Node getInterseCtionNode(Node head1,Node head2){
        while (head2 != null) {
            Node temp = head1;
            while (temp != null) {
                if (temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        linkedlist01 ll = new linkedlist01();
        Node head1,head2;
        head1 = new Node(10);
        head2 = new Node(3);

        Node nweNode = new Node(6);
        head2.next = nweNode;

        nweNode = new Node(9);
        head2.next.next = nweNode;

        nweNode = new Node(15);
        head1.next = nweNode;
        head2.next.next.next = nweNode;

        nweNode = new Node(30);
        head1.next.next = nweNode;

        head1.next.next.next = null;

        Node intersectionPoint = ll.getInterseCtionNode(head1, head2);

        if (intersectionPoint == null) {
            System.out.println("no intersection Point ");
        }else{
            System.out.println("intersection Point:" + intersectionPoint);
        }
    }
}
