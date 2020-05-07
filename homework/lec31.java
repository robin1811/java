class lec31{
    public static int Partition(int[] arr){
        int i=0;
        int j=0;
        while(j<arr.length){
            if(arr[j]<=5){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++; j++;
            }
            else{
                j++;
            } 
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }System.out.println();
        return arr[i-1];     
    }
    public static void QuickSort(int[] arr,0,z){
        int i = 0; int j=0;
        while(j<arr.length){
            if(arr[j]<=5){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++; j++;
            }
            else{
                j++;
            } 
        }int a = arr[i-1];
        QuickSort(arr,0,i-2);
        QuickSort(arr,i,z);
    }

    public static void main(String[] args){
        int[] arr = {3,8,10,5,4,2,6,7,3,5};
        System.out.println(Sort1(arr));
        int z = arr.length-1;
        QuickSort(arr,0,z);
    }
}