import java.nio.Buffer;

public class RemoveOuterParantheses {
    public static String removeOutrParatheses(String s){
        StringBuilder result = new StringBuilder();
        int depth =0;
        for (char c : s.toCharArray()){
            if(c == '('){
                if(depth > 0){
                    result.append(c);
                }
                depth++;
            }else {
                depth--;
                if(depth > 0){
                    result.append(c);
                }
            }
        }
        return result.toString();
    }


    public static void main(String[] args) {
        String ans = removeOutrParatheses("((()))()()(())");
        System.out.println(ans);

    }
}
