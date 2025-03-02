



import java.util.ArrayList;

public class Quse01 {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainla = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        mainla.add(list);

        

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainla.add(list2);

        // System.out.println(mainla);

        for (int i = 0; i < mainla.size(); i++) {
            ArrayList<Integer> currList = mainla.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }

        System.out.println(mainla);
    }
}
