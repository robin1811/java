class lec30{
    // public static int[] MergeSort(int arr,int low, int high){
    //     if(low==high){
    //         int [] base = new int[1];
    //         base[0] = arr[low];
    //         return base;
    //     }
    //     int mid = (low+high)/2;
    //     int[] left = MergeSort(arr,low,mid);
    //     int[] right = MergeSort(arr,mid+1,high);
    //     int [] ans = Merge2SortedArray(left,right);
    //     return ans;
    // }
    public static void SortZeros(int[] arr){
        int i=0; int j=0;
        while(j<arr.length){
            if(arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }j++;
        }
    }
    public static void Sort012(int[] arr){
        int i = 0; int j = 0;
    }
    public static void main(String[] args){
            // int[] arr ={1,4,3,2,9,6,8,22,10,6};
            // int[] ans = MergeSort(arr,0,arr.length-1);
            int[] arr = {0,1,1,1,0,0,1,0,1};
            SortZeros(arr);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            } 
    }
}