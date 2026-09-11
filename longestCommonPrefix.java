public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        // Test case 1
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Input: [\"flower\", \"flow\", \"flight\"]");
        System.out.println("Output: \"" + longestCommonPrefix(strs1) + "\"");

        // Test case 2
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Input: [\"dog\", \"racecar\", \"car\"]");
        System.out.println("Output: \"" + longestCommonPrefix(strs2) + "\"");

        // Test case 3 - edge case
        String[] strs3 = {"single"};
        System.out.println("Input: [\"single\"]");
        System.out.println("Output: \"" + longestCommonPrefix(strs3) + "\"");
    }
}