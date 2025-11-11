public class RotationProblem {
    public static boolean Fun(String og, String goal){
        if(og.length() != goal.length()){
            return false;
        }
        String check = og  + goal;
        if(check.contains(goal)){
            return true;
        }else return false;
    }
    public static void main(String[] args) {
        boolean result = Fun("tejas" , "jaste");
        System.out.println(result);
    }
}
