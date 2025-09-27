package Arrays;

public class practice {
//    Check if a number is Palindrome or Not
    static boolean parlidrone(int n){
        int res =0;
        int og = n;
        while (n > 0){
            int id = n % 10;
            res = (res * 10 ) + id;
            n = n/ 10;
        }

        if(og == res){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 234432;
       if(parlidrone(n)){
           System.out.println("true");
       }else {
           System.out.println(false);
       }
    }
}
