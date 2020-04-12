package April2020.twoSum;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void twoSum() {
        int[] tests = {2, 7, 11, 15};
        int target = 9;
        Solution solution = new Solution();

        int[] resultExpect = {0, 1};
        Assert.assertArrayEquals(resultExpect, solution.twoSum(tests, target));
    }
}