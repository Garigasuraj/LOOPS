import java.io.*;
import java.util.*;

class Solution {
    Solution(int n){
        int sum;
        for(int i=2; i<n; i++){
            sum=0;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    sum++;
                }
            }
            if(sum==0){
            System.out.println(i+" ");
        }
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        
        Solution obj = new Solution(a);
        }
    }
