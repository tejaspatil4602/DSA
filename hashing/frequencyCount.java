import java.util.Scanner;

public class frequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements (values between 0-12):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Precompute frequency
        int[] hash = new int[13];  // assuming values are in range 0-12
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // Query frequency
        System.out.print("Enter the number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.print("Enter a number to check its frequency: ");
            int number = sc.nextInt();

            if (number >= 0 && number < hash.length) {
                System.out.println("The frequency of " + number + " is: " + hash[number]);
            } else {
                System.out.println("Invalid number! Please enter a number between 0 and 12.");
            }
        }

        sc.close();
    }
}
