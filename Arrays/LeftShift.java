// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LeftShift {
    static void rotArray(int[] arr){
        int temp;
        temp = arr[0];
        for(int i = 0; i< arr.length-1; i++ ){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        rotArray(arr);
        for(int x : arr){
            System.out.println(x);
        }

    }

}