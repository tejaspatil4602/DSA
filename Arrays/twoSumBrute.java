package Arrays;

public class twoSumBrute {
    public boolean isValid(int[] arr, int target){
        for (int i = 0 ; i < arr.length - 1 ; i++){
            for (int j = i+1; j< arr.length;j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("valid sum found at" +  i + "  " + j);
                    return true;
                }
            }
        }
    return false;
    }
    public static void main(String[] args) {
        twoSumBrute obj = new twoSumBrute();
    int[] arr = {10,4,3,5,6,7,34,22,4};
    int target = 16;
    boolean result = obj.isValid(arr,target);
    }
}
