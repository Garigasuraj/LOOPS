import java.io.*;
import java.util.*;

class Solution {
    Solution (int n){
        for(int i=0; i<=n; i++){
            if(i%7==0){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        
        Solution obj = new Solution(a);
    }
}
