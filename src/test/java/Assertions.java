import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
    @Test
    public void assertTest(){
        Assert.assertTrue(true);
        Assert.assertEquals("welcome","Welcome");
        Assert.assertEquals("Hello","Hello");
        System.out.println("Successful");
    }
}
