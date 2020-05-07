class video1{
    public static void fn(int n){
        System.out.println(n);
        fn1(n-1);
    }
        public static void fn1(int n){
        System.out.println(n);
        fn2(n-1);
    }
    public static void fn2(int n){
        System.out.println(n);
        fn3(n-1);
    }
    public static void fn3(int n){
        System.out.println(n);
    }
    public static void main(String[] args){
        int n = 4; 
        fn(n);
    }
}