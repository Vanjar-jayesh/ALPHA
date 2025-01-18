package PriorityQueue.BaseQuse;

import java.sql.Struct;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueuesJCF {

    static class Student implements Comparable<Student> {
        String name;
        int rank;
            
        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }
        
        @Override
        public int compareTo(Student S2){
                return this.rank - S2.rank;
        }
       
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("a", 4));// 0(logn)
        pq.add(new Student("b", 5));
        pq.add(new Student("c", 2));
        pq.add(new Student("d", 12));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank); // 0(1)
            pq.remove();// 0(logn)
        }
    }
}