import java.util.*;
class 31a{
    static class node{
        int data;
        ArrayList<node> child;
        node(int d){
            data = d;
            child = new ArrayList<>();
        }
    }
    static node root = null;
    public static void construct(int[] data){
        ArrayList<node> cpList = new ArrayList<>();
        for(int i=0;i<data.length;i++){
            if(data[i] == -1){
                cpList.remove(cpList.size()-1);
            }else{
                node nn = new node(data[i]);
                if(root == null){
                    root=nn;
                }else{
                    node cp = cpList.get(cpList.size()-1);
                    cp.child.add(nn);
                }
                cpList.add(nn);
            }
        }
    }

    public static void display(node root){
        System.out.print(root.data +"")
    }
    public static
    public static void main(String[] args){

    }
}