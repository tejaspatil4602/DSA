import java.util.Stack;

public class ReveseString {

    public String reverString(String s){
        s += " ";
        Stack<String> reverse = new Stack<>();
        String str = "";
        for(int i =0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                reverse.push(str);
                str="";
            }else {
                str += s.charAt(i);
            }
        }

        String ans = "";
        while(reverse.size() != 1){
            ans += reverse.peek() + " ";
            reverse.pop();

        }
        ans += reverse.peek();
        return ans;

    }

    public static void main(String[] args) {
        ReveseString obj = new ReveseString();
        String result = obj.reverString("my name is tejas");
        System.out.println(result);
    }
}
