import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {
    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    public void beforeClass(String browser,String app)
    {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\softtech\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\softtech\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.get(app);
    }
    @Test(priority = 1)
    public void logoTest(){
       WebElement logo =  driver.findElement(By.id("logo-icon"));
        Assert.assertTrue(logo.isDisplayed(), "Logo not displayed on the page");
    }
    @Test(priority = 2)
    public void homepageTitle(){ String title = driver.getTitle();
     Assert.assertEquals("YouTube",title,"Title is not matched");
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
