import java.util.Arrays;
import java.util.Collections;

public class reverseCollection {
    static void printArray(Integer arr[], int n) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    //Reverse array using library function
    static void reverseArray(Integer arr[]) {
        //fetching array as list object
        //reversing the fetched object
        Collections.reverse(Arrays.asList(arr));
    }
    public static void main(String[] args) {
        int n = 5;
        Integer arr[] = {5,4,3,2,1};
        reverseArray(arr);
        printArray(arr, n);
    }

    public static class PalindromeOrNot {

    }
}
