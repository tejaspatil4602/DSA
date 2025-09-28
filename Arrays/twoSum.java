// Brute force solution

public class twoSum {
    public static  int[] twoSum(int[] nums, int target){
        int k = target;
        for(int i =0 ; i < nums.length -1 ; i++){
            for(int j = i+1; j < nums.length; j++){
                if((nums[i] + nums[j]) == k){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {23,2,34,55,34,54,33,55};
        int[] res =  twoSum(nums,67);

        if(res.length > 0){
            System.out.println("Required indices are  " + res[0] + "  " +  res[1]);

        }
        else {
            System.out.println("no pair found");
        }
    }
}
