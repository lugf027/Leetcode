package April2020.lengthOfLongestSubstring;
/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */

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
