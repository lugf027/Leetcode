package April2020.convert;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void convert() {
        Solution solution = new Solution();
        Assert.assertEquals("LDREOEIIECIHNTSG", solution.convert("LEETCODEISHIRING", 4));
        Assert.assertEquals("LCIRETOESIIGEDHN", solution.convert("LEETCODEISHIRING", 3));


        Assert.assertEquals("0481357926", solution.convert("0123456789", 3));
        Assert.assertEquals("ABCDEFG", solution.convert("ABCDEFG", 1));
        Assert.assertEquals("0246813579", solution.convert("0123456789", 2));



    }
}