import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    @Test
    public void testCase() {

        SoftAssert softAssert = new SoftAssert();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\softtech\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com/");

        WebElement userName = driver.findElement(By.id("email"));
        WebElement pswd = driver.findElement(By.id("pass"));

        softAssert.assertTrue(userName.isDisplayed(),"UserName should be display");
        softAssert.assertTrue(pswd.isDisplayed(),"Password should be display");

        softAssert.assertAll();

    }

}