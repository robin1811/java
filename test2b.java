import java.util.*;
class test2b{

     static String s = "";
     static int count = 0;
     static String [] arr = new int[20];
     static int i = 0;
     public static int mazePath(int sr,int sc,int er,int ec,String path){
        if(sr==er && sc == ec){
            s = path;
            count = count +1;
            return path;
        
        if(s < 0){  arr[i] = s;   i = i+1;}
        s = 0;
        
        String ans = "";
        if(sc+1<=ec)
            ans += mazePath(sr, sc+1, er, ec, path+'L');
        if(sr+1<=er)                                                                                    
            ans += mazePath(sr+1, sc, er, ec, path+'D');
        return arr;
    }
    

public static void main(String[] args) {
        int[][] arr = { {0,0,0,0,0},
                        {0,1,0,1,0},
                        {0,1,0,1,0},
                        {0,1,0,1,0},
                        {0,0,0,0,0}};
        
        // floodFill(arr,0,0,"");
        mazePath(1,1,2,2,"");
    }

}
    //  static String s = "";
    //  static int count = 0;
    //  static String [] arr = new int[20];
    //  static int i = 0;
    //  public static int mazePath(int sr,int sc,int er,int ec,String path){
    //     if(sr==er && sc == ec){
    //            s = path;
    //            count = count +1;
    //         return path;
        
    //     if(s < 0){
    //         arr[i]=s;
    //         i++;}
    //     }
    //     s = 0;
        
    //     String ans = "";
    //     if(sc+1<=ec)
    //         ans += mazePath(sr, sc+1, er, ec, path+'L');
    //     if(sr+1<=er)                                                                                    
    //         ans += mazePath(sr+1, sc, er, ec, path+'D');
    //     return arr;
    // }
    
    //     String [] arr = new int(ans);
    //     for(int i = 0; i<ans; i++){
    //     arr[i] = path;
