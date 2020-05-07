import java.util.*;
class test2a{

    public static void encoding(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        int ch1 = ques.charAt(0)-'0';
        if(ch1==0){return;}

        char ch = (char)('a'+ ch1 - 1);
        encoding(ques.substring(1),ans+ch);
        if(ques.length()>1){
            int ch2 = ques.charAt(1)-'0';
            int num = ch1*10+ch2;
            if(num>=10 && num<=26){
                ch=(char)('a'+num-1);
                encoding(ques.substring(2), ans+ch);
            }
        }
    }
    
    class lec18{


    public static void floodFill(int[][] arr,int i,int j,String path){
        // base case
            if(i==arr.length-1 && j==arr[0].length-1){
                System.out.println(path);
                return;
            }
        // pre work
            arr[i][j] = 1;
        // up
        if(i-1>=0 && arr[i-1][j] != 1)
            floodFill(arr, i-1, j, path+'u');            
        // left
        if(j-1>=0 && arr[i][j-1] !=1)
            floodFill(arr, i, j-1, path+'l');
        // down
        if(i+1<arr.length && arr[i+1][j] != 1)
            floodFill(arr, i+1, j, path+'d');
        // right
        if(j+1 < arr[0].length && arr[i][j+1] != 1)
            floodFill(arr, i, j+1, path+'r');
        // post work
        arr[i][j] = 0;
    }


    public static void main(String[] args) {
        int[][] arr = { {0,0,0,0,0},
                        {0,1,0,1,0},
                        {0,1,0,1,0},
                        {0,1,0,1,0},
                        {0,0,0,0,0}};

        floodFill(arr,0,0,"");
    }


}

    // public static void main(String[] args){
    //     Scanner scn = new Scanner(System.in);
    //     String ques = scn.nextLine();
    //     encoding(ques,"");

    // }
}