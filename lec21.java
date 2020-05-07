import java.util.*;
class lec21{
    static int f = 0;
    public static int StairCase(int n){
        if(n==0) {return 1;}
        if(n<0){return 0;} 
        int c1 = StairCase(n-1);
        int c2 = StairCase(n-2);
        int c3 = StairCase(n-3);
        f = c1+c2+c3;
        return f;
    }
    public static int StairCase1(int n, int[] qb)
    {
        if(n==0) {return 1;}
        if(n<0){return 0;} 
        if(qb[n]!=0){return qb[n];}
        int c1 = StairCase1(n-1,qb);
        int c2 = StairCase1(n-2,qb);
        int c3 = StairCase1(n-3,qb);
        f = c1+c2+c3;
        return f;
    }
    public static int StairCase2(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i=1;i<dp.length;i++){
            dp[i] += dp[i-1];
            if(i-2>=0){ dp[i] += dp[i-2];}
        if(i-3>=0){ dp[i] += dp[i-3];}
        }
        return dp[n];
        }
    // VARIABLE JUMP STAIRCASE QUESTION
    public static int VariableSC(int arr,int n){
        if(n==arr.length-1){return 1;}
        if(){return 0;}

        int ans = 0;
        for(int jump = 1, jump <=arr[src]; jump++){
            ans += VariableSC()
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // int[] qb = new int[n+1];
        // System.out.println(StairCase1(n,qb));
        System.out.println(StairCase2(n));
    }
}