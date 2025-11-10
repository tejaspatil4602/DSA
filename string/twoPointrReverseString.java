public class twoPointrReverseString {

    public static String revFun(String s){
        s += " ";
        int left =0;
        int right = s.length() -1;
        String temp = "";
        String ans = "";
        while (left <= right){
            char ch = s.charAt(left);
            if(ch != ' '){
                temp += ch;
            }
            else if(ch == ' ') {
                if(!ans.equals("")){
                    ans = temp + " " + ans;

                }
                else{
                    ans =temp;
                }
                temp ="";

            }
            left++;
        }
        return ans;
    }

    public static void main(String[] args) {
    String result = revFun("my name is tejas");
        System.out.println(result);
    }
}
