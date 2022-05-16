import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // using Mat.pow() fucntion
        Scanner Sc = new Scanner(System.in);
        int x = Sc.nextInt();
        for(int i=0; i<x; i++){
            int sum=0;
            int a = Sc.nextInt();
            int b = Sc.nextInt();
            int n = Sc.nextInt(); // number of terms
            // using nested loop
            for(int j=0; j<n; j++){
                if(j==0){
                    sum+= a+((int)Math.pow(2,j)*b);
                }else{
                    sum+= ((int)Math.pow(2,j)*b);
                }
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
