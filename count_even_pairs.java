mport java.io.*;
import java.util.*;

class Solution {
    //int sum;
    Solution(int n){
        int sum=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if((i+j)%2==0){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
    

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        
        Solution obj = new Solution(a);
    }
}
