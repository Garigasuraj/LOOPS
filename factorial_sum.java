import java.io.*;
import java.util.*;

public class factorial_sum {
    static int fact_Sum(int n){
        int sum=0;
        while(n>0){
            int fact=1;
            int rem = n%10;
            if(n<10){
                for(int i=1; i<=n; i++){
                    fact*= i;
                }
            }
            else{
                for(int i=1; i<=rem; i++){
                    fact*=i;
                }
            }
            n = n/10;
            sum+= fact;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        int n = Sc.nextInt();
        
        System.out.println(fact_Sum(n));
    }
}
