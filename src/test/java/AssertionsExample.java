import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionsExample {
    WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\softtech\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
    }
    @Test(priority = 1)
    public void logoTest(){
        WebElement logo =  driver.findElement(By.id("logo-icon"));
        Assert.assertTrue(logo.isDisplayed(), "Logo not displayed on the page");
    }
    @Test(priority = 2)
    public void homepageTitle(){
        String title = driver.getTitle();
        Assert.assertEquals("YouTube",title,"Title is not matched");
    }

    @AfterClass
    public void afterClass(){
        driver.close();
    }
}
