class Palindrome
 {
    public boolean isPalindrome(int x) {
        // Negative numbers are never palindromes
        if (x < 0) return false;
        // Numbers ending in 0 (except 0 itself) can't be palindromes
        if (x % 10 == 0 && x != 0) return false;

        int reverted = 0;
        while (x > reverted) {
            reverted = reverted * 10 + x % 10;
            x /= 10;
        }

        // For even digit count: x == reverted
        // For odd digit count: x == reverted / 10 (middle digit dropped)
        return x == reverted || x == reverted / 10;
    }
     public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(121)); // true
        System.out.println(p.isPalindrome(-121)); // false
        System.out.println(p.isPalindrome(10)); // false
    }
}