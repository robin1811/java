import java.util.*;
class lec19{
    
    public static int fiboM(int n,int[] dp){
        if(n==1 || n==0){
            return n;
    }
    if(dp[n] != 0){return dp[n]; }
    int nm1 = fiboM(n-1,dp);
    int nm2 = fiboM(n-2,dp);
    dp[n] = nm1+nm2;
    return nm1+nm2;
    }

    public static void StairPath(int n, String path,int n1){
        if(n==n1){
            System.out.println(path);
            return;
        }
        if(n+1<=n1)
        StairPath(n+1,path+"1",n1);
        if(n+2<=n1)
        StairPath(n+2,path+"2",n1);
        if(n+3<=n1)
        StairPath(n+3,path+"3",n1);
    }

    public static void main(String[] args){
        // int n = 7;
        // int[] dp = new int[n+1];
        // System.out.println(fiboM(n,dp));
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        StairPath(0,"",n);
    }
}