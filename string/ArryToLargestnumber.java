import java.util.Arrays;

public class ArryToLargestnumber {
    public static String lNumberFun(int[] nums){
        String[] str = new String[nums.length];
        for(int i= 0; i< nums.length; i++){
            str[i] = String.valueOf(nums[i]);
        }

        // compare
        Arrays.sort(str,(a,b) -> (b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();
        if(str[0].equals("0")) return "0";
        for(String s : str){
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0};
        String result = lNumberFun(nums);
        System.out.println(result);
    }
}
