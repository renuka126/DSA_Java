public class Bubblesort4 {
    public static void main(String[] args) {
        double[] prices = {45.6, 12.3, 89.1, 3.4, 67.8, 23.0};

        int n = prices.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (prices[j] > prices[j + 1]) {
                    double temp = prices[j];
                    prices[j] = prices[j + 1];
                    prices[j + 1] = temp;
                    swapped = true;
                }
            }

            // print array state after this pass
            System.out.print("After pass " + (i + 1) + ": ");
            for (double p : prices) {
                System.out.print(p + " ");
            }
            System.out.println();

            if (!swapped) {
                System.out.println("Array already sorted, stopping early.");
                break;
            }
        }

        System.out.print("Final sorted array: ");
        for (double p : prices) {
            System.out.print(p + " ");
        }
    }
}