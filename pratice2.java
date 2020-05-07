import java.util.*;
class pratice2{
    public static void SpiralPrint(int[][] arr)
    {
     int rmin=0,rmax = arr.length-1;
     int cmin=0,cmax = arr[0].length-1;
     int count=0;
     while(count < arr.length * arr[0].length)
    {  //left wall  
        for(int i=rmin; i<=rmax; i++){
            System.out.print(arr[i][cmin]+" "); count++;
        }
        cmin++;
        //bottom wall
        for(int i=cmin; i<=cmax; i++){
            System.out.print(arr[rmax][i]+" "); count++;
        }
        rmax--;
        //right wall
        for(int i=rmax; i>=rmin; i--){
            System.out.print(arr[i][cmax]+" "); count++;
        }
        cmax--;
        //top wall
        for(int i=cmax; i>=cmin; i--){
            System.out.print(arr[rmin][i]+" "); count++;
        }
        rmin++;

        
    }
 }
 public static void main(String[] args){
    int[][] arr1 = {{1,2,3,4,5},
                    {6,7,8,9,10},
                    {11,12,13,14,15},
                    {16,17,18,19,20},
                    {21,22,23,24,25}};
    SpiralPrint(arr1);
 }
}