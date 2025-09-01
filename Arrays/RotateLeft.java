// // Online Java Compiler
// Rotate array by K elements

// Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.

// Examples:

// Example 1:
// Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
// Output: 6 7 1 2 3 4 5
// Explanation: array is rotated to right by 2 position .

// Example 2:
// Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left 
// Output: 9 10 11 3 7 8
// Explanation: Array is rotated to right by 3 position.
// // Use this editor to write, compile and run your Java code online
// using extra arrays rotate left

class RotateLeft {
    public static void rotateLeft(int[] arr , int n, int k){
        if(n==0)
            return;
        k = k%n;
        if(k>n)
            return;
        int[] temp = new int[k];
        for(int i = 0; i < k; i++){
            temp[i] = arr[i];
        }
        for(int i = 0; i < n- k; i++){
            arr[i] = arr[i +k];
        }
        for(int i = n-k; i < n; i++){
            arr[i] = temp[i - n+k];
        }
    }
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1,2,3,4,5,6,7};
        int k = 4;
        rotateLeft(arr, n, k);
        System.out.println("After Rotating the elements to left ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}