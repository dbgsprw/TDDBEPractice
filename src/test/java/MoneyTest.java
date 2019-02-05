import org.testng.annotations.Test;
import org.testng.Assert;

public class MoneyTest {
    @Test()
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        Assert.assertEquals(10, five.amount);
    }
}