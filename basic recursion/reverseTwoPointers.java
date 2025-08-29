public class reverseTwoPointers {
    static void printFun(int[] arr , int n){
        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
    }

    //function to reverse a array using two pointers
    static void funReverse(int[] arr ,int n){
        int pt1 = 0;
        int pt2 = n-1;
        while (pt1 < pt2){
            int temp = arr[pt1];
            arr[pt1] = arr[pt2];
            arr[pt2] = temp;
            pt2--;
            pt1++;
         }
        printFun(arr , n);

    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {3,2,5,6,7};
        funReverse(arr , 5);
    }
}
