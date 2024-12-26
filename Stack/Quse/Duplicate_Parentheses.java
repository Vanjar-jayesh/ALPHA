package Quse;

import java.util.Stack;

public class Duplicate_Parentheses {

    public static boolean isduplicate(String str){
        Stack<Character> s = new Stack<>();
       
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            // if (ch=='(' || ch =='{' || ch=='[' || ch=='+' || ch=='/' || ch=='*' || ch=='-') {
            //         s.push(ch);
            // }else{

            //     while ((s.peek()=='(' && ch==')')
            //     || (s.peek()=='{' && ch=='}')
            //     ||(s.peek()=='[' && ch==']')) {
            //         s.pop();
            //         count++;
            //     }
            
            // }


            // closing
            if (ch==')') {
                int count = 0;
                while (s.peek() != '(' ) {
                    s.pop();
                    count++;
                }
                if (count<1) {
                    return true;// duplicate
                }else{
                    s.pop();//duplicate
                }
            }
            else{
                //opening
                s.push(ch);
            }

        }

        return false;

       
    }
    public static void main(String[] args) {
        String str = "((A+B))";

        System.out.println(isduplicate(str));
    }
}
