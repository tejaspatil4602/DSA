// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// PS : The name of the public class has to be Main for the code to work

public class LargeOddNumber {

    public static String largeOddNumber(String s){
        int n = s.length()-1 ;
        int index = -1;
        int i;
        for(i =n; i>=0;i--){
            if((s.charAt(i) - '0' )%2 ==1){
                index = i;
                break;
            }
        }
        if(index == -1){
            return " ";
        }
        i = 0;
        while(i<=index && s.charAt(i) == '0'){
            i++;
        }
        return s.substring(i,index+1);

    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String result = largeOddNumber("78770016");
        System.out.println(result);
    }
}