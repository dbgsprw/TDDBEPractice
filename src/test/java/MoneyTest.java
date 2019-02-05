import org.testng.annotations.Test;
import org.testng.Assert;

public class MoneyTest {
    @Test()
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Assert.assertEquals(new Dollar(10), five.times(2));
        Assert.assertEquals(new Dollar(15), five.times(3));
    }

    @Test()
    public void testEquality() {
        Assert.assertTrue(new Dollar(5).equals(new Dollar(5)));
        Assert.assertFalse(new Dollar(5).equals(new Dollar(6)));
        Assert.assertTrue(new Franc(5).equals(new Franc(5)));
        Assert.assertFalse(new Franc(5).equals(new Franc(6)));
        Assert.assertFalse(new Franc(5).equals(new Dollar(5)));
    }
}