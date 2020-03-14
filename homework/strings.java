import java.util.*;
class strings{

    public static void Ques1(String str){
        for(int i=0;i<str.length();i++){                    //Question 1 - to print Character of a string 
            System.out.println(str.charAt(i));
        }
    }
    public static void Ques2(String str){
        for(int i=0;i<str.length();i++){                   // Question 2 - print substring of a string
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
            System.out.println();
        }
    }
    public static boolean Ques3(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){return false;}          //Question 3 - check string is palindrome or not
            i++; j--;
        }
        return true;
    }
    public static void Ques4(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String str2 = (str.substring(i,j));
                boolean flag = Ques3(str2);
                if(flag){System.out.println(str2);}
            }
        }
    }
public static void main(String[] args){
    String str = "abccbc";
    // Ques1(str);
    // Ques2(str);
    // boolean n = Ques3(str);
    // System.out.println(n);
    Ques4(str);
}     
}


