class lec29{

    public static void BubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
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
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length-1;j++){
                if(arr[i]>arr[j+1]){
                    int temp = arr[i];
                    arr[i] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void Merge2SortedArray(int[] arr1, int[] arr2){
        int[] ans = new int[arr1.length+arr2.length];
        int k = 0; int i = 0; int j = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]) {arr3[k]=arr2[j]; j++; k++;}
            else if(arr1[i]<arr2[j]) {arr3[k]=arr1[i]; i++; k++;}
        }
        for(int l=0;l<arr3.length;l++){
            System.out.print(arr3[i]+" ");
    }
    }
    public static void main(String[] args){
        int [] arr = {3,6,10};
        int [] arr1 = {1,2,4,5,7,9};
        // BubbleSort(arr);
        // SelectionSort(arr);
        Merge2SortedArray(arr,arr1);
    }
}
