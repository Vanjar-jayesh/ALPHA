import java.util.ArrayList;

public class Quse02 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);// 12345
            list2.add(i * 2);// 246810
            list3.add(i * 3);// 361215


            
        }

        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);

        // list2.remove(3);
        // list2.remove(2);

        System.out.println(mainlist);
        // nested loops

        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> currlist = mainlist.get(i);
            for (int j = 0; j < currlist.size(); j++) {
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }
    }
}
