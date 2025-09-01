public class SortArryOrNot {
    public static boolean issorted(int[] arr, int n ){
        for(int i =1; i < n; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
            return true;

    }

    public static void main(String[] args) {
        int[] arr = {12,34,212,434,11,23};
        int n = arr.length;
        System.out.println(issorted(arr,n));
    }
}
