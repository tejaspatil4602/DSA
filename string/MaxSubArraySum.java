public class MaxSubArraySum {

    public static long solFun(int[] arr){
        long maxi = Long.MIN_VALUE;
        int sum =0;

        for (int i =0 ; i< arr.length; i++){
            sum += arr[i];
            if(sum >maxi){
                maxi = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,-5,3,-4,1,5,3,-2,-3,5,3,-4,5};
        long result = solFun(arr);
        System.out.println(result);
    }
}
