public class bubbleSort {
    static void bubbleSort(int[]arr , int n ){
        for (int i = n - 1; i>=0; i--){
            int didSwap = 0;
            for(int j = 0; j <= i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }

            }
            if(didSwap == 0){
                break;
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
        bubbleSort(arr, n);
    }
}
