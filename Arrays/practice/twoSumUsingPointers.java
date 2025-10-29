public class twoSumUsingPointers {
    public static void main(String[] args) {
         //if sorted array is there 
    int[] arr = {2,34,56,77,78,299};
    int n = arr.length;
    int target = 58;
    int left = 0;
    int right = n-1;
    while(left < right){
    int sum = arr[left] + arr[right];
    if(sum == target){
        System.out.println("true");
        break;
    }else if (sum < target){
        left++;
        
    }else{
        right--;
    }
    
    }
 
    }
   

}