import java.util.HashMap;

public class twoSumH {
    public static int[] twoSum(int arr[] , int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            int needed = target - num;
            if (map.containsKey(needed)){
                return new int[]{i ,map.get(needed) };
            }
            map.put(num,i);
        }
        return new int[]{};
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int[] res = twoSum(arr,12);
        if(res.length > 0){
            System.out.println("indices are " + res[0] +"  "+ res[1]);

        }else {
            System.out.println("not found!!!");
        }
    }





}
