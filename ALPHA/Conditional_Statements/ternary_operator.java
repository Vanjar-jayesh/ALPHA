public class ternary_operator {
    public static void main(String[] args) {
        int number = 4;

        String type = (number%2==0) ?"even" : "odd";
        System.out.println(type); 

        int marks = 33; 

       String type1 = ( marks>=33)?"pass" : "fail";
       System.out.println(type1);
    }
}
