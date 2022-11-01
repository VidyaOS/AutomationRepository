import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MavenTestExample {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\softtech\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com/");
        driver.manage().window().maximize();
        driver.getTitle();
        driver.close();
    }
    }