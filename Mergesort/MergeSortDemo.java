import java.util.Scanner;

public class MergeSortDemo {

    // Function to merge two sorted parts
    static void merge(int arr[], int left, int mid, int right) {

        int size1 = mid - left + 1;
        int size2 = right - mid;

        int leftArr[] = new int[size1];
        int rightArr[] = new int[size2];

        // Copy elements into temporary arrays
        for (int i = 0; i < size1; i++) {
            leftArr[i] = arr[left + i];
        }

        for (int j = 0; j < size2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // Compare and merge
        while (i < size1 && j < size2) {

            if (leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements from left array
        while (i < size1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy remaining elements from right array
        while (j < size2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    // Function to divide the array
    static void mergeSort(int arr[], int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n - 1);

        System.out.println("Sorted array is:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}