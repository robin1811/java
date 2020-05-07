import java.util.*;
class bst{
    static class node{
        int data;
        node right;
        node left;

        node(int d){
            data = d;
            left = right = null;
        }
    }
    public static node construct(int[] values, int lo, int hi){
        if(lo>hi){
            return null;
        }else if(lo==hi){
            return new node(values[lo]);
        }
        int mid = (lo+hi/2);
        node root = new node(values[mid]);
        root.left = construct(values,lo,mid-1);
        root.right = construct(values,mid+1,hi);
        return root;
    }
    public static void main(String[] args){
        int[] values = {10,20,30,40,50,60,70,80,90};
        int lo = 0;
        int hi = values.length;
        construct(values,lo,hi);
    }
}