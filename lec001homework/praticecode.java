import java.util.*;
class Digits
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rem = 0; 
        while(n>0)
        {
            int a = n%10;
            rem = rem * 10 + a; 
            n=n/10;
        }
        System.out.println(rem);
        while(rem>0)
        {
            int b = rem%10;
            rem=rem/10;
            System.out.println(b);

        }
    }     
}