import java.util.*;
class array{
    static Scanner scn = new Scanner(System.in);   //Static scanner helps to make taking input as a global input, otherwise if we take it in the main and even use scn in function to it will give a "illegal use of expression" error.
                                                   //static is always inside class and outside a function.
    public static void array(int[] arr){           //code for taking input in ARRAY.
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
    }   
    public static void display(int[] arr){ 
        for(int i=0; i<arr.length;i++){            //Displaying the array
            System.out.print(arr[i]+" ");
        }
    }
    public static void MinMAx(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min); 
        
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
        array(arr);
        MinMAx(arr);

    }
}
