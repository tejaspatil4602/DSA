public class p1 {
    public static void main(String[] args) {
        int arr[] = {23, 34 ,54, 232, 43};
        int max = 0;
        for (int i = 0 ; i < arr.length; i++){

            if(arr[i] > max){
                max = arr[i];

            }

        }
        System.out.println(max);
    }
}
