import java.util.*;
class lec12{
    // question 1
    public static void PrintDecreasing(int n){
        if(n==0){return;}
        System.out.println(n);
        PrintDecreasing(n-1);
    }
    //question 2
    public static void PrintIncreasing(int n){
        if(n==0){return;}
        PrintIncreasing(n-1);
        System.out.println(n);
    }
    //question 3
    public static void Fn1(int n){
        if(n==1){
            System.out.println(n);      //increasing-decreasing
            return;
        }
        System.out.println(n);
        Fn1(n-1);
        System.out.println(n);
    }
    //question 4
    public static int factorial(int n){
        if(n==1){return 1;}
        int ans = 0;
        ans = factorial(n-1)*n;
        return ans;
    }
    //question 5
    public static int PowOfANum(int n,int x){
        if (x==1){return n;} 
        int ans = PowOfANum(n,x-1);
        int myans = ans*n;
        return myans; 
    }
    // question 6
    public static int Toh(String s,String d,String h,int n){
        if(n==0){return 0;}
        
        int ans = Toh(s,h,d,n-1);
        System.out.println("move "+n+ " from " +s+" to " +d);
        ans = ans+1;
        ans = ans+Toh(h,d,s,n-1);
        return ans;
    }

    static int  count = 0;
    public static int TowerOfHanoi(String s,String d,String h,int n){
        if(n==0){return 1;}
        TowerOfHanoi(s,h,d,n-1);
        System.out.println("move "+n+" th from "+s+" to " +d);
        count = count+1;
        TowerOfHanoi(h,d,s,n-1);
        return count;
    } 

    //question 7
    public static void ArrayPrint(int []arr,int n){
        // if(n==-1){return;}
        // ArrayPrint(arr, n-1);
        // System.out.println(arr[n]);

        if(n==arr.length-1){ System.out.println(arr[n]); return;}
        System.out.println(arr[n]);
        ArrayPrint(arr,n+1);
    }
    public static void ArrayPrintRev(int []arr, int n){
        // if(n==arr.length){return;}
        // ArrayPrintRev(arr,n+1);
        // System.out.println(arr[n]);
        if(n==-1){return;}
        if(n==arr.length){n=n-1;}
        System.out.println(arr[n]);
        ArrayPrintRev(arr,n-1);
    } 
    public static int LargestInArray(int []arr,int n){
        if(n==arr.length-1){int largest1 = arr[n]; return largest1;}
        int largest = LargestInArray(arr,n+1);
        if(arr[n]>largest){ largest = arr[n]; }
        return largest;
    }

    public static void main(String[] args){
        // PrintDecreasing(5);                                      question 1
        // PrintIncreasing(5);                                      question 2
        // Fn1(5);                                                  question 3
        // System.out.println(factorial(5));                           //question 4
        // int n =PowOfANum(3,4);                                   question 5
        // System.out.println(n); 

        int ans = Toh("SOURCE","DESTINATION","HELPER",3);                  //question 6;
        System.out.println(ans);  
        // int ans = TowerOfHanoi("source","destination","helper",5);    
        // System.out.println(count);     
        // int [] arr = {2,5,7,9};
        // ArrayPrintRev(arr,4); 
        // int [] arr = {2,5,7,9,4,-1};
        // System.out.println(LargestInArray(arr,0));
    }
}

public static void main(tring[] args)
{
    System.out.println("HELLO");
}
public static void main(String[] args){
    
}












