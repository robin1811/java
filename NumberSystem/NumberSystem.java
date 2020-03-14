import java.util.*;
class NumberSystem{
    public static int add(int a, int b){
        int c = a + b;
        int d = a - b;
        return c,d;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        System.out.println(add(a,b));
    }
}