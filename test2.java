1						1
1	2				2	1
1	2	3		3	2	1
1	2	3	4	3	2	1
import java.util.Scanner;
class test2{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==n){ continue;}                                                                         //question1

                System.out.print(j+" ");
            }
            int c=(n-i)*2;
            for(int k=1;k<c;k++){
                System.out.print("  ");
            }
            for(int l=i;l>=1;l--){

                System.out.print(l+" ");
            }

            System.out.println();
        }


    }
}
// import java.util.*;
   
//    class test2{
   
       public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
           int k = scn.nextInt();
           int n = scn.nextInt();
           if(k>0){k=-k;}
           else{ int c = -k; k=2*c-k+1;}                                                             //question2
   
           int nod = 0;
           int temp = n;
           while(temp != 0){
               temp /= 10;
               nod++;
           }
   
           k = k % nod;
           if(k < 0)
               k += nod;
   
           int div = 1;
           int mult = 1;
           for(int i = 1; i <= nod; i++){
               if(i <= k)
                   div *= 10;
               else 
                   mult *= 10;
           }
   
           int quo = n / div;
           int rem = n % div;
   
           int r = rem * mult + quo;
           System.out.println(r);
       }
   }

import java.util.*;
class lec009{
public static void SECONDSpiralPrint(int[][] arr)
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

 

 public static void FIRSTSpiralPrint(int[][] arr)
    {
     int rmin=0,rmax = arr.length-1;
     int cmin=0,cmax = arr[0].length-1;
     int count=0;
     while(count < arr.length * arr[0].length)
    {   //top wall
        for(int i=cmax; i>=cmin; i--){
            System.out.print(arr[rmin][i]+" "); count++;
        }
        rmin++;
        //right wall
        for(int i=rmax; i>=rmin; i--){
            System.out.print(arr[i][cmax]+" "); count++;
        }
        cmax--;
                //bottom wall
        for(int i=cmin; i<=cmax; i++){
            System.out.print(arr[rmax][i]+" "); count++;
        }
        rmax--;
        //left wall  
        for(int i=rmin; i<=rmax; i++){
            System.out.print(arr[i][cmin]+" "); count++;
        }
        cmin++;
    }
 }
public static void main(String[] args){
    int[][] arr1 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
    // FIRSTSpiralPrint(arr1);
    SECONDSpiralPrint(arr1);
}
}