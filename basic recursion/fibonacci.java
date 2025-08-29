public class fibonacci {
    static int funFibo(int n){
        if(n <= 1) {
            return n;
        }
            int last = funFibo(n-1);
            int slast = funFibo(n-2);
            return last + slast;

    }
    public static void main(String[] args) {
        int n =10;
        System.out.println(funFibo(n));
    }
}
