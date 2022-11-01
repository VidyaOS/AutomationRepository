import org.testng.annotations.Test;

public class TestCaseExample1 {
    @Test
    void openBrowser(){
        System.out.println("Opening Browser");
    }
    @Test(priority = 2)
    void login(){
        System.out.println("This is login test");
    }
    @Test(priority = 3)
    void closeBrowser(){
        System.out.println("Closing Browser");
    }

}
