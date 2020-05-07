import java.util.*;
class day3{
    public static void Prime(){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        boolean flag = false;
        for(int j=n1;j<=n2;j++){
            for(int i=2;i*i<=j;i++){
                if(j%i==0){
                    flag = true;
                    break;
                }
            }
            if(flag==false){System.out.println(j);}
            flag = false;
    }}
    public static void fibo(){
        int n = 5;
        int a = 0;
        int b = 1;
        for(int i=0; i<=n;i++){
            System.out.println(a);
            int c = a+b;
            a=b;
            b=c;
        }
    }
    public static void countdigit(){
        int n = 65784383;
        int i =0;
        while(n>0){
            n = n/10;
            i++;
        }
        System.out.println(i);
    }
        public static void fill(int[][] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=count;
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
         int[][] arr = new int[4][5];
         fill(arr);
        // int n = 12345;
        // int rev = 0;
        // while(n>0){
        //     int a = n%10;
        //     rev = a+ rev*10;
        //     n = n/10; 
        // }
        // n = rev;
        // rev = 0;
        // while(n>0){
        //     int a = n%10;
        //     rev = a+ rev*10;
        //     n = n/10; 
        // }
        // System.out.println(rev);  
    }
}
        // int n = 123456;
        // int ans =0; int pow =1; int dn =n; int length = 0;
        // while(dn!=0){
        //     dn=dn/10;
        //     length++;
        // }
        // dn = n;
        // while(r>0){
        //     int rem=n%10;
        //     n=n/10;
        //     ans=ans+rem*pow;
        //     pow=pow*10;
        //     r--;
        // while(length>=0)
        // length
        // n/100000(length);
        // 100000(length)/10;


        // int n = 12345;
        // int rev = 0;
        // while(n>0){
        //     int a = n%10;
        //     rev = a+ rev*10;
        //     n = n/10; 
        // }
        // System.out.println(rev);