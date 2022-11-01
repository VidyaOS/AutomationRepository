import org.testng.annotations.Test;

public class TestCaseExample2 {
    @Test(priority = 1)
    void openBrowser(){
        System.out.println("Opening Browser");
    }
    @Test(priority = 3)
    void searchCustomer(){
        System.out.println("This is search customer test");
    }
    @Test(priority = 2)
    void addCustomer(){
        System.out.println("This is add customer test");
    }
    @Test(priority = 4)
    void closeBrowser(){
        System.out.println("Closing Browser");
    }
}
