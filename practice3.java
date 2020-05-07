class practice3{
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }
    }
    public static void reverse(int[] arr,int i,int j){
        
            while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }   
    public static void rotate(int[] arr,int r){

        reverse(arr,arr.length-r,arr.length-1);
        reverse(arr,0,arr.length-r-1);
        reverse(arr,0,arr.length-1);
    }
    public static void main(String[] args){
        
        int[] arr={1,2,3,4,5};
        int r=2;
        rotate(arr,r);
        display(arr);
    } 
}

while(i<j){
    
}