// Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

package variablesdatatype;
import java.util.*;

public class Quse3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pencil,pen,erase;

        pencil = sc.nextFloat();
        pen = sc.nextFloat();
        erase = sc.nextFloat();

        float bill = pencil + pen+erase;

        System.out.println("total bill: "+bill);

        float gst = bill + (0.18f*bill);

        System.out.println("GST:"+gst);

    }
}
