package DEQue;

import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
    static class Stack {

        Deque<Integer> dq = new LinkedList<>();

        public void push(int datd) {
            dq.addLast(datd);
        }

        public int pop() {
            return dq.removeLast();
        }

        public int peek() {
            return dq.getLast();
        }

    }

    static class Queue {
        
        Deque<Integer> dq = new LinkedList<>();

        public void add(int datd){
            dq.addLast(datd);
        }

        public int remove(){
            return dq.removeFirst();
        }

        public int peek(){
            return dq.getFirst();
        }
        
    }
    public static void main(String[] args) {
        // Stack s = new Stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // System.out.println("peek = " + s.peek());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());

        Queue q  = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("peek = "+q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

    }
}
