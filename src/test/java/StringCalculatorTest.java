import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StringCalculatorTest {
    private StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void addEmptyStringShouldReturnZero(){
        Assert.assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void addOneNumberShouldReturnTheSameNumberAsInteger(){
        Assert.assertEquals(1, stringCalculator.add("1"));
        Assert.assertEquals(2, stringCalculator.add("2"));
    }

    @Test
    public void addTwoNumbersShouldReturnTheSum(){
        Assert.assertEquals(8, stringCalculator.add("5,3"));
    }

    @Test
    public void addErrorNumbersShouldBeHandledAsZero() {
        Assert.assertEquals(3, stringCalculator.add(",3"));
    }

    @Test
    public void addTenNumbersShouldReturnTheCorrectSum() {
        Assert.assertEquals(51, stringCalculator.add("2,4,6,8,10,10,10,1"));
    }

    @Test
    public void allowLineReturnAsSeparator() {
        Assert.assertEquals(10, stringCalculator.add("5\n5"));
    }

    @Test
    public void allowCustomDelimiter() {
        Assert.assertEquals(10, stringCalculator.add("//;6;4"));
    }

    @Test
    public void allowEverything() {
        Assert.assertEquals(12, stringCalculator.add("as2>1!2;5'2"));
    }

    @Test
    public void negativeNumbersShouldThrowException() {
        try {
            stringCalculator.add("-1, 3");
            fail("Expected a RuntimeException to be thrown");
        } catch (RuntimeException ex) {
            assertEquals(ex.getMessage(), "Negatives not allowed : -1");
        }

    }
}
