import java.util.*;

class UnionUsingMap {
    static ArrayList<Integer> FindUnion(int[] arr1, int[] arr2, int n, int m) {
        HashMap<Integer, Boolean> freq = new HashMap<>();
        ArrayList<Integer> Union = new ArrayList<>();

        // Add elements of arr1
        for (int i = 0; i < n; i++) {
            freq.put(arr1[i], true);
        }

        // Add elements of arr2
        for (int i = 0; i < m; i++) {
            freq.put(arr2[i], true);
        }

        // Collect all keys into Union
        for (int value : freq.keySet()) {
            Union.add(value);
        }

        return Union;
    }

    public static void main(String[] args) {
        int n = 10, m = 7;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};

        ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);

        System.out.println("Union of arr1 and arr2 is:");
        for (int val : Union) {
            System.out.print(val + " ");
        }
    }
}
