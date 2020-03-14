import java.util.*;
class PrimeNo
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        for(int j=n1; j<=n2; j++)
        {
        boolean flag = true;
        for(int i=2; i*i<j; i++)
        {
            if (j % i== 0)
            {
                flag = false;
                break;
            }
        }

        if (flag == true)
        {
            System.out.println(j);
        } 
        }
    }

}
