public class bubblesort5 {
    public static void main(String[] args){
        char[] letter = {'e' , 'a', 'd', 'g', 'b', 'c', 'f'};

        int n = letter.length;
        int passcount = 0;

        for(int i = 0; i < n - 1; i++){
            boolean swapped = false;
            passcount ++;

            for(int j = 0; j < n-1; j++){
                if(letter[j] > letter[j+1]){
                    char temp = letter[j];
                    letter[j] = letter[j+1];
                    letter[j+1] = temp;
                    swapped = true;


                }
            }
            
        }
        System.out.println("Sorted array: ");
        for(char l: letter){
            System.out.println(" " + l);

        }

        System.out.println("Total number of passes: " + passcount);


    }
}
