package String;
public class String3 {
    public static void main(String[] args) {
        String var1 = "malayalam";
        System.out.println("Original String: " + var1);

        String var2 = "";
        for (int var3 = var1.length() - 1; var3 >= 0; var3--) {
            var2 += var1.charAt(var3);
        }

        System.out.println("Reversed String: " + var2);

        if (var1.equals(var2)) {
            System.out.println(var1 + " is a Palindrome");
        } else {
            System.out.println(var1 + " is not a Palindrome");
        }
    }
}