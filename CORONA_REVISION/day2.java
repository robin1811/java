import java.util.*;
class day2{
    //question 1:
    public static int Toh(String s,String d,String h,int n){
        if(n==0){return 0;}
        
        int ans = Toh(s,h,d,n-1);
        System.out.println("move "+n+ " from " +s+" to " +d);
        ans = ans+1;
        ans = ans+Toh(h,d,s,n-1);
        return ans;
    }
    //question 2:
    public static int Fibonacci(int n){
        if(n==1){return 1;}
        if(n==0){return 0;}
        int a=Fibonacci(n-1);
        int b=Fibonacci(n-2);
        int c=a+b;
        return c;
    }
    public static int FibonacciM(int n,int[] dp){
        if(n==1){return 1;}
        if(n==0){return 0;}
        if(dp[n]!=0){return dp[n];}
        int a=FibonacciM(n-1,dp);
        int b=FibonacciM(n-2,dp);
        int c=a+b;
        dp[n] = c;
        return c;
    }
    public static int FibonacciT(int n){
        int[] dp = new int[n+1];
        dp[0] = 0; dp[1] = 1;
        for(int i=2;i<dp.length;i++){
            int a=dp[i-1];
            int b=dp[i-2];
            dp[i] = a+b;
        }
        return dp[n];
    }
    public static void main(String[] args){
        // int ans = Toh("SOURCE","DESTINATION","HELPER",3);
        // System.out.println(ans);                                             question 1
        // int n = 44;
        // int[] dp = new int[n+1];
        // System.out.println(FibonacciT(n));
        // System.out.println(FibonacciM(n,dp));
        // System.out.println(Fibonacci(n));
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int div = 2;
        while(div * div <= n){
            if(n % div == 0){
                System.out.println("Not Prime");
                return;
            }
            div++;
        }

        System.out.println("Prime");
    

    }
}