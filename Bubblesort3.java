public class Bubblesort3 {
    public static void main(String[] args) {
        String[] fruits = {"Banana", "Apple", "Mango", "Orange", "Grapes"};
        int n = fruits.length;
        int swap_count = 0;

        for(int i= 0; i<n-1; i++){
            for(int j = 0; j<n-i-1; j++){
                if(fruits[j].compareTo(fruits[j+1])>0){
                    String temp = fruits[j];
                    fruits[j] = fruits[j+1];
                    fruits[j+1] = temp;
                    swap_count++;

                }
            }
        }
        System.out.println("Sorted array:");
        for(String fruit: fruits){
            System.out.println(" " + fruit);

        }

        System.out.println("Total number of swaps: " + swap_count);
    }
}
