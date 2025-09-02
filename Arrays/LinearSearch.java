package Arrays;

public class LinearSearch{
    static int index(int[] arr , int k){
        for(int i= 0; i< arr.length; i++){
            if(arr[i] == k)
                return i;


        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {34, 54, 23, 54, 23};
        int k = 23;

        int result = index(arr, k);  // store the returned index

        if (result != -1) {
            System.out.println("Element " + k + " found at index: " + result);
        } else {
            System.out.println("Element " + k + " not found in the array.");
        }
    }
}
