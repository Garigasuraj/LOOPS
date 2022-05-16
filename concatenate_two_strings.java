import java.io.*;
import java.util.*;

class Solution {
  // using setter and getter
  // with calling a method with object creation
    public String a;
    public String b;
    
    public void seta(String str1){
        a=str1;
    }
    public void setb(String str2){
        b=str2;
    }
    public String total(){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String a = Sc.next();
        String b = Sc.next();
        //System.out.println(a+b);
        // calling the function
        Solution obj = new Solution();
        obj.seta(a);
        obj.setb(b);
        
        System.out.println(obj.total());
        
    }
}
