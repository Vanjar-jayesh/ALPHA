package baseLinkedlist;

import java.util.LinkedList;

public class QuseLLJCF {

    public static void main(String[] args) {
        // Create 
        LinkedList<Integer> ll = new LinkedList<>();
        // add
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);

        System.out.println(ll);
        // remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(  ll.indexOf(3));

        System.out.println(ll);
    }
}