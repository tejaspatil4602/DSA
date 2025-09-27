package Collections.haspMap;

import java.util.HashMap;

public class Majority {
    public static void majority(int arr[]){
        HashMap<Integer , Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i = 0 ; i < n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);

            }else {
                map.put(arr[i], 1 );
            }
        }
        for (int key : map.keySet()){
            if (map.get(key) > n/3){
                System.out.println("element the is more than of n/3 is .... " + key);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2};
        majority(arr);
    }
}
