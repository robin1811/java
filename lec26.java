import java.util.*;
class lec26{
    //question 1
    public static int lcs(String s1, String s2){
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for(int i=dp.length-2;i>=0;i--){
             for(int j=dp[0].length-2;j>=0;j--){
                 if(s1.charAt(i)==s2.charAt(j)){
                     dp[i][j]=dp[i+1][j+1];
                 }
                 else{
                     dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]); 
                 }
             }
        }
        return dp[0][0];
    }
    //question 2
    public static int cpss(String str){
        int count = 0;
        boolean [][] dp = new boolean[str.length()][str.length()];
        for(int gap =0;gap<dp.length;gap++){
            int sp = 0;
            int ep = gap;
            while(ep<dp.length){
                if(gap==0){dp[sp][ep]=true;}
                else if(gap==1){
                    if(str.charAt(sp)==str.charAt(ep)){dp[sp][ep]=true;}
                    else{dp[sp][ep]=false;}
                }
                else{
                    if(str.charAt(sp)==str.charAt(ep)){
                        // if(dp[sp+1][ep-1]==true){{dp[sp][ep]=true;}}
                        // else{dp[sp][ep]=false;}
                        dp[sp][ep] = dp[sp+1][ep-1];}
                    else{
                        dp[sp][ep]=false;}
                    }
                
                if(dp[sp][ep]==true){count=count+1;}

                sp++;
                ep++;
            }
        
        }
        return count;
    }
    //question 3
        public static int cpss1(String str){
        int ans = 0;
        boolean [][] dp = new boolean[str.length()][str.length()];
        for(int gap =0;gap<dp.length;gap++){
            int sp = 0;
            int ep = gap;
            while(ep<dp.length){
                if(gap==0){dp[sp][ep]=true;}
                else if(gap==1){
                    if(str.charAt(sp)==str.charAt(ep)){dp[sp][ep]=true;}
                    else{dp[sp][ep]=false;}
                }
                else{
                    if(str.charAt(sp)==str.charAt(ep)){
                        // if(dp[sp+1][ep-1]==true){{dp[sp][ep]=true;}}
                        // else{dp[sp][ep]=false;}
                        dp[sp][ep] = dp[sp+1][ep-1];}
                    else{
                        dp[sp][ep]=false;}
                    }
                
                if(dp[sp][ep]==true){ans = gap+1;}

                sp++;
                ep++;
            }
        
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        // String s1 = scn.nextLine();
        // String s2 = scn.nextLine();
        // System.out.println(lcs(s1,s2));  
        String str = scn.nextLine();
        System.out.println(cpss1(str)); 
    }
}