package Collections.haspMap;

import java.util.HashSet;

public class Union {
    public static int union(int[] arr1 , int[] arr2){
        int l1 = arr1.length;
        int l2 = arr2.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0 ; i < l1; i++){
            set.add(arr1[i]);
        }
        for (int j = 0 ; j < l2; j++){
            set.add(arr2[j]);
        }
        System.out.println(set);
        return set.size();

    }
    public static void main(String[] args) {
        int[] arr1 = {2,32,34,53,432,55};
        int[] arr2 = {23,64,12};

        int res = union(arr1,arr2);
        System.out.println("Number of unique elements are..." +res);
    }
}
