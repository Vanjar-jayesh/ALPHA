package DEQue;

import java.util.Deque;
import java.util.LinkedList;

public class Quse01 {
    public static void main(String[] args) {
        Deque<Integer> dq = new  LinkedList<>();

        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addLast(4);
        dq.addLast(5);

        System.out.println(dq);
        dq.removeLast();

        System.out.println(dq);

        System.out.println("first el ="+dq.getFirst());
        System.out.println("Last el = "+dq.getLast());
    }
}
