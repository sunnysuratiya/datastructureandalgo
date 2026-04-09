public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];

        // Count letters in magazine
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        // Check ransomNote
        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) {
                return false;
            }
            count[c - 'a']--;
        }

        return true;
    }

    // Main method for testing
    public static void main(String[] args) {

        String ransomNote1 = "aa";
        String magazine1 = "aab";

        String ransomNote2 = "aa";
        String magazine2 = "ab";

        System.out.println(canConstruct(ransomNote1, magazine1)); // true
        System.out.println(canConstruct(ransomNote2, magazine2)); // false
    }
}