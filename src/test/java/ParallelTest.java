import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {
    WebDriver driver;
    @Test
    public void firefoxTest()
    {
        //Initialize the firefox driver
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\softtech\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.redbus.in/");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
        driver.quit();
    }

  /*  @Test
    public void chromeTest()
    {
        //Initialize the chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\softtech\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.demoqa.com");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
        driver.quit();
    }
}*/

}
