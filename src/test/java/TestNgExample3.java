import org.testng.annotations.*;

public class TestNgExample3 {
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class TestNgExample3");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test TestNgExample3");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test
    public void testMethod1() {
        System.out.println("Test Method 1");
    }

    @Test
    public void testMethod2() {
        System.out.println("Test Method 2");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }
    @AfterTest
    public void AfterTest() {
        System.out.println("After Test TestNgExample3");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class TestNgExample3");

    }
}
