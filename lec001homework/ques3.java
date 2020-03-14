class BasicVariables
{

public static void main(String[] args)
{
    int x=3;
    int y=3;
    int sum=x+y;
    System.out.println("Sum of "+ x + " and " + y + " is " + sum);
   
   //POWER FUNCTION SYNTAX:

    int exp = (int)Math.pow(2, 3);
    System.out.println(exp);

    System.out.println((int)Math.pow(x, y));

    // ALL THIS IS JUST HIT AND TRIAL:

    //System.out.print(Integer.parseInt(String.valueOf(Math.pow(x,y))));
    int z=Integer.parseInt(args[0]);  //CODE TO TAKE INPUT ON CONSOLE IN args
    System.out.print(z);
    //System.out.print(Integer.parseInt(Math.pow(x,y)));
}

}