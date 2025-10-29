import java.util.ArrayList;
import java.util.Arrays;

public class zeroOneTwo {
    public static void sortArray (ArrayList<Integer> arr, int n){
        int countZero = 0;
        int countOne =0;
        int countTwo =0;
        for(int i = 0; i < n; i++){
            if (arr.get(i) == 0) {
                countZero++;
                
            }else if(arr.get(i) == 1){
                countOne++;

            }else{
                countTwo++;
            }
              // replacing 2's
        }
            for (int i = 0; i < countZero; i++) arr.set(i, 0); // replacing 0's

            for (int i = countZero; i < countZero + countOne; i++) arr.set(i, 1); // replacing 1's

            for (int i = countZero + countOne; i < n; i++) arr.set(i, 2);

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0,0,2,2,2,0,1,1,2,0,2,0,1,2,0));
        int n = arr.size();
        sortArray(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

    }
}