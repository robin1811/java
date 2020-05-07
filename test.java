import java.util.*;
class lec009{
static Scanner scn = new Scanner(System.in);

public static void FIRSTSpiralPrint(int[][] arr)
    {
     int rmin=0,rmax = arr.length-1;
     int cmin=0,cmax = arr[0].length-1;
     int count=0;
     while(count < arr.length * arr[0].length)
    {   //top wall
        for(int i=cmin; i<=cmax; i++){
            System.out.print(arr[rmin][i]+" "); count++;
        }
        rmin++;
        //right wall
        for(int i=rmin; i<=rmax; i++){
            System.out.print(arr[i][cmax]+" "); count++;
        }
        cmax--;
                //bottom wall
        for(int i=cmax; i>=cmin; i--){
            System.out.print(arr[rmax][i]+" "); count++;
        }
        rmax--;
        //left wall  
        for(int i=rmax; i>=rmin; i--){
            System.out.print(arr[i][cmin]+" "); count++;
        }
        cmin++;
        count++;
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
    int r = scn.nextInt();
    int c = scn.nextInt();
    int[][] arr = new int[r][c];
    input(arr);
    FIRSTSpiralPrint(arr);

}
}