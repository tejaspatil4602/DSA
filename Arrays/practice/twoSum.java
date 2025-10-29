public class twoSum {
    public static boolean solution(int[] arr, int n , int target ){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n;i++){
            int num = arr[i];
            int needMore = target - num;
            if(map.containsKey(needMore)){
                return true;
            }
                map.put(arr[i], i);

        }
        return false;

    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = {34,53,23,654,56};
        int target = 90;
        boolean ans = solution(arr,n,target);
        System.out.println(ans);
   
    }
}