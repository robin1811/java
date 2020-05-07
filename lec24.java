import java.util.*;
class lec24{
    public static int bsb(int n){
        int[] space = new int[n+1];
        int[] building = new int[n+1]; 
        space[1] = building[1] = 1;
        for(int i=2;i<=n;i++){
            space[i] = space[i-1]+building[i-1];
            building[i] = space[i-1];
        }
        int count = space[n] + building[n];
        return count*count;
    }
    public static int MaxSumSubseq(int []arr){
        int n = arr.length;
        int[] include = new int[n];
        int [] exclude = new int[n];
        include[0] = arr[0];
        exclude[0] = 0;
        for(int i=1;i<n;i++){
            include[i] = exclude[i-1] + arr[i];
            exclude[i] = Math.max(include[i-1],exclude[i-1]);
        }
        int ans = Math.max(include[n-1],exclude[n-1]);
        return ans;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println(MaxSumSubseq(arr));

    }
}