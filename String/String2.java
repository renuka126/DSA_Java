package String;

public class String2 {
    public static void main(String[] args) {

        String text = "Java is a powerful programming language";

        // 1. Length
        System.out.println("Original String: " + text);
        System.out.println("Length: " + text.length());

        // 2. Count vowels
        int vowels = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                vowels++;
            }
        }

        System.out.println("Number of vowels: " + vowels);

        // 3. Count consonants
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if (ch >= 'a' && ch <= 'z' &&
                !(ch == 'a' || ch == 'e' || ch == 'i' ||
                  ch == 'o' || ch == 'u')) {
                consonants++;
            }
        }

        System.out.println("Number of consonants: " + consonants);

        // 4. Count spaces
        int spaces = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaces++;
            }
        }

        System.out.println("Number of spaces: " + spaces);

        // 5. Reverse the string
        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        System.out.println("Reversed String: " + reverse);

        // 6. Check palindrome
        String word = "madam";
        String rev = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            rev = rev + word.charAt(i);
        }

        if (word.equals(rev)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }

        // 7. Count a particular character
        char target = 'a';
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.toLowerCase(text.charAt(i)) == target) {
                count++;
            }
        }

        System.out.println("Number of '" + target + "': " + count);
    }
}