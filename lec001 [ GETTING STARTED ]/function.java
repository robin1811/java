import java.util.*;
class function{
    public static int fact(int x){
        int fact = 1;
        for(int i=1; i<=x; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static int DigitFrequency(int n, int r){
        int a = 0; 
        int count = 0;
        while(n!=0){
            a = n%10;
            n = n/10;
            if(a==r){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int a = DigitFrequency(994543234,4);
        System.out.print(a);
    }
}