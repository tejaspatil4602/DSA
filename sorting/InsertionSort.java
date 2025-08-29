public class InsertionSort {
    static void insertionSort(int[]arr , int n ){
        for (int i = 0; i<= n-1; i++){
        int j = i;
        while(j > 0 && arr[j-1] > arr[j] ){
            //swap
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
         }

        }
        System.out.println("After the sorting");
        for (int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args) {
        int[] arr = {475,33,75,89,802,75,683,0,8,75,6};
        int n = arr.length;
        System.out.println("before the sorting");
        for (int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
        insertionSort(arr, n);
    }
}
