import java.util.Arrays;

public class UC16 {

    // ✅ Bubble Sort Method
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparison
            for (int j = 0; j < n - 1 - i; j++) {

                // Swap if out of order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        // Sample passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting: " + Arrays.toString(capacities));

        bubbleSort(capacities);

        System.out.println("After Sorting: " + Arrays.toString(capacities));
    }
}