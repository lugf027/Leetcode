package April2020.lengthOfLongestSubstring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void lengthOfLongestSubstring() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        Assert.assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
        Assert.assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
        Assert.assertEquals(1, solution.lengthOfLongestSubstring(" ")); // wrong
        Assert.assertEquals(3, solution.lengthOfLongestSubstring("dvdf")); // wrong
    }

    @Test
    public void lengthOfLongestSubstring_1() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.lengthOfLongestSubstring_1("abcabcbb"));
        Assert.assertEquals(1, solution.lengthOfLongestSubstring_1("bbbbb"));
        Assert.assertEquals(3, solution.lengthOfLongestSubstring_1("pwwkew"));
        Assert.assertEquals(1, solution.lengthOfLongestSubstring_1(" ")); // wrong
        Assert.assertEquals(0, solution.lengthOfLongestSubstring_1("")); // wrong
        Assert.assertEquals(3, solution.lengthOfLongestSubstring_1("dvdf")); // wrong
        Assert.assertEquals(2, solution.lengthOfLongestSubstring_1("cdd")); // wrong
    }
}