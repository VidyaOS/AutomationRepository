import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Annotations {
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class Annotations");
    }
    @AfterClass
    public void afterClass() { System.out.println("After Class Annotations"); }
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test Annotations");
    }
    @AfterTest
    public void AfterTest() {
        System.out.println("After Test Annotations");
    }
}
