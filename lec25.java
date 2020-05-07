import java.util.*;
class lec25{
    //question 1:
    public static int MaxISubSequence(int []arr){
        int[] dp = new int[arr.length];
        dp[0] = 1;

        for(int i=1;i<dp.length;i++){
            int max = 0;
            for(int j=i-1;j>=0;j--){
                if(arr[i]>arr[j]){
                    max = Math.max(max,dp[j]);
                }
            }
            dp[i] = max+1;
        }
        int ans = 0;
        for(int i=1;i<dp.length;i++){
            if(dp[i]>ans){
                ans=dp[i];
            }
        }
        return ans;
    }
    //question 2:
    public static int MaxISubSequence1(int[] arr){
        int[] dp = new int[arr.length];
        dp[0] = arr[0];

        for(int i=1;i<dp.length;i++){
            int max = 0;
            for(int j=i-1;j>=0;j--){
                if(arr[i]>=arr[j]){
                    max = Math.max(max,dp[j]);
                }
            }
            dp[i] = max+arr[i];
        }
        int ans = 0;
        for(int i=1;i<dp.length;i++){
            if(dp[i]>ans){
                ans=dp[i];
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {2,7,9,5,11,-2,3,17,4};
        System.out.println(MaxISubSequence(arr));
        System.out.println(MaxISubSequence1(arr));

    }
}