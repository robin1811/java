import java.util.*;
class lec12a{
    public static void ArraySearch(int []arr, int idx){
        if(arr[idx]==2){System.out.println(idx); return;}
        ArraySearch(arr,idx+1);
    }
    public static int ArrayFirstOccurance(int []arr, int idx, int data){
        if(idx==arr.length){return -1;}                                     //return type
        int ans = ArrayFirstOccurance(arr,idx+1,data);
        if(arr[idx]==data){return idx;}
        return ans;
    } 
    public static void ArrayFirstOccurance1(int []arr, int idx, int data){

        if(idx==arr.length){return;}
        if(arr[idx]==data){System.out.println(idx); return;}
        ArrayFirstOccurance1(arr,idx+1,data);

    }
    public static int ArrayFirstOccurance2(int [] arr, int idx, int data){
        if(idx==arr.length){return -1;}
        if(arr[idx]==data){ return idx;}
        ans = ArrayFirstOccurance1(arr,idx+1,data);
    }
    
    public static int ArrayLastOccurance(int[] arr, int idx, int data){
        if(idx==arr.length){return -1;}
        int ans = ArrayLastOccurance(arr,idx+1,data);        
        if(arr[idx]==data && ans==-1){return idx;}
        return ans;
    }   
    static int ans = 0;
    public static void ArrayLastOccurance1(int []arr, int idx, int data){

        if(idx==arr.length){return;}
        if(arr[idx]==data){ ans = idx;}
        ArrayLastOccurance1(arr,idx+1,data);

    }
    static int count = 0;
    public static void ArrayAllIndex(int[] arr,int idx, int data){
        if(idx==arr.length){return;}
        if(arr[idx]==data){count = count+1;}
        ArrayAllIndex(arr,idx+1,data);
        int [] ans = new int[count];
        if(arr[idx]==data){
            ans[count] = arr[idx];
            count = count - 1;  
        }}
    public static void fibo(int a, int b,int n){
        if(n<=0){return;}
        int c = a+b;
        System.out.print(c+" ");
        fibo(b,a+b,n-1);

    }

    public static void main(String[] args){
        int []arr = {3,13,12,5,6,2,8,2,9};                                 //question 1
        // ArraySearch(arr,0);
        // System.out.print(0+" "+1+" ");                                      QUESTION 2  
        // fibo(0,1,10);
        // int ans = ArrayFirstOccurance(arr,0,2);
        // System.out.println(ans);
        // ArrayFirstOccurance1(arr,0,2);
        ArrayFirstOccurance2(arr,0,2);
        // int ans1 = ArrayLastOccurance(arr,0,2);
        // System.out.println(ans1);
        // ArrayLastOccurance1(arr,0,2);
    //     ArrayAllIndex(arr,0,3);
    // }
    }
}

