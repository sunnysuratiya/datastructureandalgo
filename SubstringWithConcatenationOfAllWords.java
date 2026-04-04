import java.util.*;

public class SubstringWithConcatenationOfAllWords {

    public static List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();

        if (s == null || words == null || words.length == 0) {
            return result;
        }

        int wordLen = words[0].length();
        int totalWords = words.length;
        int totalLen = wordLen * totalWords;

        HashMap<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i <= s.length() - totalLen; i++) {

            HashMap<String, Integer> tempMap = new HashMap<>();
            int j = 0;

            while (j < totalWords) {

                int start = i + j * wordLen;
                String currentWord = s.substring(start, start + wordLen);

                if (!wordMap.containsKey(currentWord)) {
                    break;
                }

                tempMap.put(currentWord, tempMap.getOrDefault(currentWord, 0) + 1);

                if (tempMap.get(currentWord) > wordMap.get(currentWord)) {
                    break;
                }

                j++;
            }

            if (j == totalWords) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};

        System.out.println(findSubstring(s, words));
    }
}