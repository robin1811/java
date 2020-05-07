import java.util.*;
class lec009{
    static Scanner scn = new Scanner(System.in);
    
    public static void diagonal(int[r][c]arr, int r,int c){
        for(int k=0;k<r;k++){
            int i=k;
            int j=0;
            while(i>=0){
                System.out.print(arr[i][j]);
                i=i+1;
                j=j-1;

        }
    }
        for(int k=0;k<c;k++){
            int i=r-1;
            int j=k;
            while(j<=c-1){
                System.out.print(arr[i][j]);
                i=i+1;
                j=j-1;

        }
    }
    
    public static void input(int[][] arr){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            arr[i][j] = scn.nextInt(); 
        }
    }
 }
public static void main(String[] args){
    int i = scn.nextInt();
    int j = scn.nextInt();
    int[][] arr = new int[i][j];
    input(arr);
    diagonal(arr,i,j)
}
}