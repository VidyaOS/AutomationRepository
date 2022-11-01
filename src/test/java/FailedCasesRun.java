import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedCasesRun {
    @Test
    void test1()
    {
        Assert.assertTrue(true);
    }
    @Test
    void test2()
    {
        Assert.assertTrue(true);
    }
    @Test
    void test3()
    {
        Assert.assertTrue(true);
    }
    @Test
    void test4()
    {
        Assert.assertTrue(false);
    }
}
