package Collections.haspMap;

import java.util.HashSet;

public class Intersection {
    public static int intersection(int[] arr1, int[] arr2 ){
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i =0 ; i< arr1.length; i++){
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++){
            if(set.contains(arr2[i])){
                System.out.println(arr2[i]);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {23,43,23,55,32,5};
        int[] arr2 = { 23,34,55};
        int res = intersection(arr1,arr2);
        System.out.println("number of element are" + res);
    }
}
