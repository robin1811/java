import java.util.Scanner;
class test2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int sn = scn.nextInt();
        int sb = scn.nextInt();
        int db = scn.nextInt();
        
        int dec = process
        

    }
}


        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==n){ continue;}                                                                         //question1

                System.out.print(j+" ");
            }
            int c=(n-i)*2;
            for(int k=1;k<c;k++){
                System.out.print("  ");
            }
            for(int l=i;l>=1;l--){

                System.out.print(l+" ");
            }

            System.out.println();
        }
