




package baseQuse;

import java.util.ArrayList;

public class Quse01 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        for(int i = al.size()-1; i>=0; i--){
            System.out.print(al.get(i)+" ");
        }

      
    }
}
