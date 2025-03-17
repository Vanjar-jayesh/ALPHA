

package BaseQuse;

import java.util.*;

public class interleaveave_2_Halves {

    public static void interLeave(Queue<Integer> q){

        Queue<Integer> f1 = new LinkedList<>();
        int size = q.size();

        for(int i=0; i<size/2; i++){
            f1.add(q.remove());
        }

        while (!f1.isEmpty()) {
            q.add(f1.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interLeave(q);

        //print Q
        while (!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        }
        System.out.println();

    }
}
