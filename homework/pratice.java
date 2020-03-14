// import java.util.Scanner;
// class pratice{
//     static Scanner scn = new Scanner(System.in);
//     public static void largestOfThree(int a, int b, int c){
//         int n = scn.nextInt();
//         System.out.println("haan bhai n mil gay hai "+ n);
//         if(a>=b && a>=c){
//             System.out.println("A = "+ a + " is largest");}
//         else if(b>=a && b>=c){
//             System.out.println("B = "+ b + " is largest");}
//         else{
//             System.out.println("C = "+ c + " is largest");}
//     }
//     public static void IsPrime(int n){
//         boolean flag = false;
//         for(int i=2;i*i<n;i++){
//             if(n%i==0){
//                 flag=true;
//                 break;
//             }
//         }
//         if(flag){System.out.println("NOT PRIME");}
//     }
//     public static void IsPrime2(int n){
//         for(int i=1; i<=n;i++){
//             int no = scn.nextInt();
//         int count=0;
//         for(int div=2;div*div<no;div++){
//             if(no%div==0){
//                 count++;
//                 break;
//             }
//         }if(count==0){
//         System.out.println(no);}
//         }
//     }
//     public static void AllPrimeNo(int n1, int n2){
//         for(int i=n1;i<=n2;i++){
//         boolean flag = false;
//         for(int j=2;j<i;j++){
//         if(i%j==0){
//             flag = true;
//             break;
//         }
//         }
//         if(flag==false){System.out.println(i+" ");}}
//     }
//     public static void AllPrimeNo2(int n1, int n2){
//         for(int i=n1;i<=n2;i++){
//             int count=0;
//             for(int j=0;j<i;j++){}
//         }
//     }

//     public static void main(String[] args){
//         int a = scn.nextInt();
//         // int b = scn.nextInt();
//         // // int c = scn.nextInt();
//         // // largestOfThree(a,b,c);
//         IsPrime2(a);
//         // AllPrimeNo(a,b);
//     }
// }

class pratice{
    // public static void palindrome(String s,int a){
    //     for(int i=0;i<a;i++){
    //         for(int j=s.length()-1;j>a;j++){
    //             s.charAt(i) = s.charAt(j); 
    //             }
    //     }
    // }
    public static void Substring(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
    public static void palindrome2(String s2){
        int left = 0;
        int right = s.length()-1;
        boolean flag =true;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                flag=false;
                System.out.println(flag);
                break;
            }
            else{
                flag=true;
            }
            left++; right--;
        }
        if(flag){
            System.out.println("true");
        }
    }

    public static void PalindromicSubstring(){
          for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String s2= s.substring(i,j);
            }
            palindrome2(s2);
        }
    }

    }
    public static void main(String[] args){
        String s = "kidann";
        int a=s.length();
        Substring(s);
        palindrome2(s);
        // System.out.println(a);
        // System.out.println(s.substring(2,4));
        // System.out.println(s.substring(2,3));
        // System.out.println(s.substring(2,2));


    }
}
