package BaseQuse;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {

    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // sorting
        int acticities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            acticities[i][0] = i;
            acticities[i][1] = start[i];
            acticities[i][2] = end[i];
        }
        // Lambda function -> shortform
        Arrays.sort(acticities, Comparator.comparingDouble(o -> o[2]));
        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        // 1st Acticity
        maxAct = 1;
        ans.add(acticities[0][0]);
        int lastEnd = acticities[0][2];
        for (int i = 1; i < end.length; i++) {
            if (acticities[i][1] >= lastEnd) {
                // Acticity select
                maxAct++;
                ans.add(acticities[i][0]);
                lastEnd = acticities[i][2];
            }
        }

        System.out.println("Max acticities = " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
