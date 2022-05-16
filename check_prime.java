import java.io.*;
import java.util.*;

class Solution {
    Solution(int n){
        int sum=0;
        for(int i=2; i<n; i++){
            for(int j=2; j<n; j++){
                if(n%j==0){
                    sum++;
                }
            }
        }
        if(sum==0){
            System.out.println("Prime");
        }else{
            System.out.println("Not a Prime");
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        
        Solution obj = new Solution(a);
        }
    }
