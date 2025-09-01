package Arrays;

import java.util.ArrayList;

public class MovingZeroTOLast {
    public static int[] Move(int n ,int[] arr){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i= 0; i<n; i++) {
            if (arr[i] != 0)
                temp.add(i);
        }
            int size = temp.size();
        for(int i =0 ; i<size; i++){
            arr[i] = temp.get(i);
        }
        for(int i = size; i< n; i++){
            arr[i] =0;
        }
        return arr;

    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans = Move(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");

    }
}
