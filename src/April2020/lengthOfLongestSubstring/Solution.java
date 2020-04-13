package April2020.lengthOfLongestSubstring;

import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring_1(String s) {
        HashMap<Character, Integer> chatIndex = new HashMap<Character, Integer>();
        int result = 0;
        int pos = 0;
        for (int i = 0; i < s.length(); i++) {
            if (chatIndex.containsKey(s.charAt(i)))
                pos = Math.max(chatIndex.get(s.charAt(i)), pos);
            result = Math.max(result, i - pos + 1);
            chatIndex.put(s.charAt(i), i + 1);
        }
        return result;
    }

    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < tmp; j++) {
                if (s.charAt(i) == s.charAt(i - j - 1)) {
                    flag = false;
                    i = i - j;
                    break;
                }
            }
            if (flag) {
                tmp++;
            } else {
                result = Math.max(result, tmp);
                tmp = 1;
            }
        }
        return Math.max(result, tmp);
    }
}
