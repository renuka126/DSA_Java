import java.util.Scanner;

public class MergeSortExample {

    // Function to divide the array
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {

            int mid = (left + right) / 2;

            // Sort left half
            mergeSort(arr, left, mid);

            // Sort right half
            mergeSort(arr, mid + 1, right);

            // Merge the two halves
            merge(arr, left, mid, right);
        }
    }

    // Function to merge two sorted halves
    public static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        // Merge the temporary arrays
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[]
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n - 1);

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}