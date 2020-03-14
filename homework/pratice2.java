import java.util.Scanner;
class pratice{
    
    static Scanner scn = new Scanner(System.in);
    public static void IsPrime2(int n){
        for(int i=1; i<=n;i++){
            int no = scn.nextInt();
        int count=0;
        for(int div=2;div*div<no;div++){
            if(no%div==0){
                count++;
                break;
            }
        }if(count==0){
        System.out.println("prime");
        }
        else{System.out.println("NOT PRIME");}
        }
    }
    public static void IsPrime3(int n){
        int count=0;
        for(int div=2;div*div<n;div++){
            if(n%div==0){
                count++;
                break;
            }
        }if(count==0){
        System.out.println("prime");
        }
        else{System.out.println("NOT PRIME");}
        }

public static void main(String[] args){
    int a = scn.nextInt();
    IsPrime3(a);
}
}