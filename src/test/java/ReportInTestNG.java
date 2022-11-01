import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ReportInTestNG {
    WebDriver driver;
    ExtentReports extentReports = new ExtentReports();
    ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("report.html");
    ExtentTest test;

    @BeforeTest
    public void beforeTest() {
        extentReports.attachReporter(extentSparkReporter);
    }

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
        test = extentReports.createTest("Launch the browser");
        WebElement logo =  driver.findElement(By.id("logo-icon"));
        Assert.assertTrue(logo.isDisplayed(), "Logo not displayed on the page");
        test.pass("Passing the test");
    }
    @Test(priority = 2)
    public void homepageTitle(){ String title = driver.getTitle();
        Assert.assertEquals("YouTube",title,"Title is not matched");
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }
    public void AfterTest() {
        System.out.println("After Test TestNgExample3");

        }
    @AfterTest
    public void reportClosing(){
    extentReports.flush();
    }
    }
