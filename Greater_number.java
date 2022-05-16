import java.util.*;
class Solution{
    //public int larger;

    Solution(int n, int n1){
        if(n>=n1){
            System.out.println(n);
        }else if(n1>=n){
            System.out.println(n1);
        }

    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int n1 = Sc.nextInt();

        Solution obj = new Solution(n,n1);

    }
    
}
