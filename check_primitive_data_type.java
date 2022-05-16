import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int x = Sc.nextInt();
        // using for loop
        for(int i=0; i<=x; i++){
            // taing because it is biggest number
            long n = Sc.nextLong();
            System.out.println(n+" can be fitted in:");
            if(n>=-128 && n<=127){
                System.out.println("*byte");
            }else if(n>=-32768 && n<=32767){
                System.out.println("*short");
            }else if(n>=-2147483648 && n<=2147483647){
                System.out.println("*int");
            }else if(n>=-9223372036854775808l && n<=9223372036854775807l){
                System.out.println("*long");
            }else{
                System.out.println(n+"can't be fitted anywhere.");
            }
        }
    }
}
