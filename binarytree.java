import java.util.*;
class binarytree{
    static class node{
        int data;
        node left;
        node right;

        node(int d){
            data=d;
            left=right=null;
        }
    }
    static node root= null;
    public static void construct(){
        int[] data = {10,20,30,80,120,130,-1,-1,-1,-1,40,90,100,110,-1,-1,-1,-1,-1,50,60,-1,70};
        ArrayList<node> stack = new ArrayList<>();
        for(int i=0;i<data.length;i++){
            if(data[i]==-1){
                stack.remove(stack.size()-1);
            }
            else{
                node nn =new node(data[i]);
                if(root==null){
                    root = nn;
                    
                }
                else{
                    node cp = stack.get(stack.size()-1);
                    // System.out.print(cp.data+" ");
                    if(cp.left==null){  
                        cp.left=nn;
                    }
                    else{
                        cp.right=nn;
                    }
                }
                stack.add(nn);
            }
        }

    }
    public static void display(node root){
        if(root == null){
            return;
        }

        
        if(root.left!=null){
            System.out.print(root.left.data);
        }
        System.out.print(" <- "+ root.data + " -> ");
        if(root.right!=null){
            System.out.print(root.right.data);
        }
        System.out.println();
        if(root.left!=null){
            display(root.left);
        }
        if(root.right!=null){
            display(root.right);
        }
    }

    public static int size(node root){
        if(root==null){
            return 0;
        }
        int mySize = 1;
        if(root.left!=null){
            mySize+= size(root.left);
        }
        if(root.right!=null){
            mySize+= size(root.right);
        }
        return mySize;
    }
    public static int max(node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int myMax = root.data;
        if(root.left!=null){
            int lm=max(root.left);
            if(myMax<lm){
                myMax = lm;
            }
        }
        if(root.right!=null){
            int rm = max(root.right);
            if(rm>myMax){
                myMax=rm;
            }
        }
        return myMax;
    }
    public static void preorder(node root){
        if(root == null){return;}
        System.out.print(root.data+" ");
        if(root.left!=null){
            preorder(root.left);
        }
        if(root.right!=null){
            preorder(root.right);
        }
    }

    public static void inorder(node root){
        if(root == null){return;}
        if(root.left!=null){
            inorder(root.left);
        }
        System.out.print(root.data+" ");
        if(root.right!=null){
            inorder(root.right);
        }
    }
     public static void postorder(node root){
        if(root == null){return;}
        if(root.left!=null){
            postorder(root.left);
        }
        if(root.right!=null){
            postorder(root.right);
        }
        System.out.print(root.data+" ");
    }
    public static node preInConstruct(int[] pre, int[] in, int ps, int pe, int is, int ie){
        if(ps == pe){
            node baseNode = new node(pre[ps]);
            return baseNode;
        }
        if(ps>pe){
            return null;
        }
        node croot = new node(pre[ps]);
        int i = is;
        int count = 0;
        while(pre[ps]!=in[i]){
            count++;
            i++;
        }
        croot.left = preInConstruct(pre,in,ps+1,ps+count,is,i-1);
        croot.right = preInConstruct(pre,in,ps+count+1,pe,i+1,ie);
        return croot;
    }
    public static int height( node root){
        if( root == null ){
            return 0;
        }
        int myHeight = 0;
        if( root.left != null ){
            myHeight = height( root.left );
        }
        if( root.right != null ){
            int rh = height( root.right );
            if( myHeight < rh ){
                myHeight = rh;
            }
        }
        return myHeight+1;
    }
    public static int diameter(node root){
        if(root == null){
            return 0;
        }
        int ld = diameter(root.left);
        int rd = diameter(root.right);

        int lh = height(root.left);
        int rh = height(root.right);

        int myDia = Math.max( lh + rh + 1, Math.max(ld, rd));
        return myDia; 
    }
    public static void 
    public static void main(String[] args){
        construct();
        System.out.println(diameter(root));
        // display(root);
        // System.out.println(size(root));
        // System.out.println(max(root));
        // preorder(root);
        // System.out.println();
        // inorder(root);
        // System.out.println();
        // postorder(root);
        // int [] pre = {10,20,30,40,50,60,70,80};
        // int [] in = {20,40,30,50,10,60,80,70};

        // node root1 = preInConstruct(pre,in,0,pre.length-1,0,in.length-1);
        // display(root1);

    }
}

