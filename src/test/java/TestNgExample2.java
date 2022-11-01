import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNgExample2 {
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
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
        System.out.println("After Test");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");

    }
}