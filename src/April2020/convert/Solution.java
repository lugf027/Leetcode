package April2020.convert;

/**
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 *
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 *
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 */
public class Solution {
    /*
    执行用时 :3 ms, 在所有 Java 提交中击败了99.57%的用户
    内存消耗 :39.8 MB, 在所有 Java 提交中击败了9.59%的用户
     */
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;

        StringBuilder result = new StringBuilder();
        int step = numRows + numRows - 2;

        for (int i = 0; i < s.length(); i += step)
            result.append(s.charAt(i));

        for (int i = 1; i < numRows - 1; i++) {
            for (int j = i; j < s.length(); j += step) {
                result.append(s.charAt(j));
                if (j + numRows * 2 - (i + 1) * 2 < s.length()) {
                    result.append(s.charAt(j + numRows * 2 - (i + 1) * 2));
                }
            }
        }

        for (int i = numRows - 1; i < s.length(); i += step)
            result.append(s.charAt(i));

        return result.toString();

    }
}
