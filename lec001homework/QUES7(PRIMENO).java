import java.util.*;
class PrimeNo
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean flag = false;
        for(int i=2; i*i<n; i++)
        {
            if (n % i== 0)
            {
                flag = true;
                break;
            }
        }

        if (flag == true)
        {
            System.out.println("Not Prime");
        } 
        else
        {
            System.out.println("Prime");
        }
    }

}
