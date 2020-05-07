import java.util.*;
class javaclass1{

    public static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        int nstar = n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<  =nstar;j++){
                System.out.print("*\t");
            }nstar--;
            System.out.println();
        }
    }

    public static void main(String[] args){
        pattern2(5);
        //         Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // for(int i=1;i*i<=n;i++){
        //     System.out.println(i*i);
    }
}

//         int n = 26;
//         for( int i=2; i<=n; i++){
//             System.out.println("i = "+i+" -> "+n%i);
//         }
//     }
// }
// question 1: -- LcmGcd --
// public static void main(String[] args){
//         int n1 = 24;
//         int n2 = 36;

//         int div = n1;
//         int dvd = n2;

//         while(dvd % div != 0){
//             int rem = dvd % div;
//             dvd = div;
//             div = rem; 
//         }
//         int gcd = div;
//         System.out.println(gcd);
//         int lcm = (n1*n2)/gcd;
//         System.out.println(lcm);
//     }

//question 2 --PrimeFactorization--
// Scanner scn = new Scanner(System.in);

//         int n = scn.nextInt();
//         int div = 2;
//         while(div*div<=n){

//             while(n%div == 0){
//                 System.out.print(div+" ");
//                 n = n/div;
//             }
//             div = div+1;
//         }
//         if(n!=1){
//             System.out.println(n);
//         }
//     }