import java.util.Scanner;

public class sort1 {


    public static void insertionSort(int[] numbers) {

        for (int current = 1; current < numbers.length; current++) {

            int value = numbers[current];
            int position = current - 1;

           
            while (position >= 0 && numbers[position] > value) {
                numbers[position + 1] = numbers[position];
                position--;
            }

            
            numbers[position + 1] = value;
        }
    }

   
    public static void displayArray(int[] numbers) {
        for (int element : numbers) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements:");
        for (int index = 0; index < size; index++) {
            numbers[index] = input.nextInt();
        }

        System.out.println("Original Array:");
        displayArray(numbers);

        insertionSort(numbers);

        System.out.println("Sorted Array:");
        displayArray(numbers);

        input.close();
    }
}