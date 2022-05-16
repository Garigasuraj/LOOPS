import java.io.*;
import java.util.*;

class Solution {
    Solution(int n){
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        
        Solution obj = new Solution(a);
    }
}
