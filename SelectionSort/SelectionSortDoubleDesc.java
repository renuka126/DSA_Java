

public class SelectionSortDoubleDesc {
    public static void main(String[] args) {
        double[] arr = {3.5, 1.2, 9.8, 4.4, 2.1};
        int comparisons = 0, swaps = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                comparisons++;
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                double temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
                swaps++;
            }
        }

        System.out.println("Sorted (desc): " + java.util.Arrays.toString(arr));
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Swaps: " + swaps);
    }
}