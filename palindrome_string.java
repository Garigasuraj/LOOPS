import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String x = Sc.next();
       //String x = "madam";
       int put = x.length();
       String sum = "";
       // using for loop
       for(int i=put-1; i>=0; i--){
           sum += x.charAt(i);
           //System.out.println(sum);
       }
       //System.out.print(sum);
       if(x.compareTo(sum)==0){
           System.out.println("Yes");
       }else{
           System.out.println("No");
       }
    }
}
