// with a auxiliary space

public class reverseAString {
    //fun to print

    static void printFun(int[] ans , int n){
        for(int i = 0; i < n; i++){
            System.out.println(ans[i] + " ");
        }
    }

    //function to reverse a array
    static void funReverse(int[] arr ,int n){
        int[] ans = new int[n];
        for(int i = n - 1; i >= 0; i--){
            ans[n-i-1] = arr[i];
        }
        printFun(ans , n);

    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {3,2,5,6,7};
        funReverse(arr , 5);
    }
}
