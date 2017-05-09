import org.junit.Assert;
import org.junit.Test;

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

}
