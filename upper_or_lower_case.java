import java.io.*;
import java.util.*;

class Solution {
    // using constructor with methodoverloading
    // string = collection of char
    // use char
    Solution(char a){
        if(a>= 'A' && a<= 'Z'){
            System.out.println("Char is Uppercase");
        }else if(a>= 'a' && a<= 'z'){
            System.out.println("Char is Lowercase");
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        // taking char input
        char x = Sc.next().charAt(0);
        //String y = Sc.next();
        
        //calling the function
        Solution obj = new Solution(x);
        
       
    }
}
