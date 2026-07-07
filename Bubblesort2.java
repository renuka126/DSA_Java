package Array;

public class Bubblesort2 {
    public static void main(String[] args) {
        int[] my_array = {63, 65, 25, 12, 22, 11, 90, 5};

        int n = my_array.length;
        int swap_count = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (my_array[j] > my_array[j + 1]) {
                    int temp = my_array[j];
                    my_array[j] = my_array[j + 1];
                    my_array[j + 1] = temp;
                    swap_count++;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int num : my_array) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("Total number of swaps: " + swap_count);
    }
}