package practiceQuse;

import java.util.ArrayList;

public class Quse04 {
    // public static void beautifulArray(int n){

    //     ArrayList<Integer> ans = new ArrayList<>();

    //     for(int i =2; i<=n; i++){
    //         ArrayList<Integer> temp = new ArrayList<>();
    //         for(Integer e : ans){
    //             if (2*e<=n)temp.add(e*2); 
    //         }

    //         for(Integer e : ans){
    //             if (2*e-1<=n)temp.add(e*2-1); 
    //         }

    //         ans = temp;
    //     }

    //     System.out.println(ans);
    // }

    // public ArrayList<Integer> beauArray(int n){

    //     ArrayList<Integer> res = new ArrayList<>();

    //     divideconque(1,1,res,n);

    //     return res;
    // }

    // private void divideconque(int start,int increment,ArrayList<Integer> res,int n){
    //     if (start+increment>n) {
    //         res.add(start);
    //         return;
    //     }

    //     divideconque(start,2* increment, res, n);
    //     divideconque(start + increment, 2*increment, res, n);
    // }

    public static int[] beautifulArray(int n){
        int [] res = new int[n];
        if (n==1) {
            return new int[]{1};
        }else if (n==2) {
            return new int[]{1,2};
        }else{
            int [] odds = beautifulArray((n+1)/2);
            int [] even = beautifulArray(n/2);
            for(int i =0; i<odds.length; i++){
                res[i] = odds[i] * 2-1;
            }
            for(int j =0; j<even.length; j++){
                res[odds.length+j] = even[j] * 2;
            }
        }
        
        return res;
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(beautifulArray(n));
        
    }
}
