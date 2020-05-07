import java.util.*;
class home1{
    public static void BubbleSort(int []arr){
        int n = arr.length;
        for(int i=0; i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void SelectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min = arr[0];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp; 
                    min = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void SelectionSort1(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp; 
                }

            }
        }        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void InsertionSort(int[] arr){
        int fs = arr[0]; 
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }

            }
        }for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void Merge2SortedArray1(int[] arr1, int[] arr2){
        int i=0; int j=0; int k=0;
        int [] ans = new int[arr1.length + arr2.length];

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                i++;k++;
            }else {
                ans[k]=arr2[j];
                j++; k++;

            }
            if(i==arr1.length){
                ans[k] = arr2[j];
                j++;k++;
            }
            if(j==arr2.length){
                ans[k]=arr1[i];
                i++; k++;
            }
        }
        for(int l=0;l<ans.length;l++){
            System.out.print(ans[l]+" ");
        }
    }
        public static void Merge2SortedArray(int[] arr1, int[] arr2){
        int i=0; int j=0; int k=0;
        int [] ans = new int[arr1.length + arr2.length];

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                i++;k++;
            }else {
                ans[k]=arr2[j];
                j++; k++;

            }
        }
            while(j<arr2.length){
                ans[k] = arr2[j];
                j++;k++;
            }
            while(i<arr1.length){
                ans[k]=arr1[i];
                i++; k++;
            }
        for(int l=0;l<ans.length;l++){
            System.out.print(ans[l]+" ");
        }
    }
    
    public static void MergeSort(int[] arr1,int low,int high){

    }
    public static void main(String[] args){
        int[] arr = {10,5,12,8,4,7,3};
        int[] arr1 = {2,4,6,8,20};
        int[] arr2 = {1,3,5,79,81};
        // BubbleSort(arr);
        // SelectionSort(arr);
        // SelectionSort1(arr);
        // InsertionSort(arr);
        Merge2SortedArray(arr1,arr2);
    }
}