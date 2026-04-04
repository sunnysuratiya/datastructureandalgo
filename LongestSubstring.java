import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If duplicate found inside window
            if (map.containsKey(currentChar) && map.get(currentChar) >= left) {
                left = map.get(currentChar) + 1;
            }

            map.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int result = lengthOfLongestSubstring(s);
        System.out.println("Longest substring length: " + result);

        sc.close();
    }
}