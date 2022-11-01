import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class DataProviderExamplewithxlsx {
    WebDriver driver;
    @DataProvider(name="Data123")
    public Object[][] excelData()throws IOException {
        Object[][] arrObj= getExcelData("C:\\Users\\Akshay\\Documents\\Data123.xlsx","SheetData");
        return arrObj;
    }

    public String[][] getExcelData(String filename, String sheetname) throws IOException {
        String[][] data = null;
        FileInputStream fileInputStream = new FileInputStream(filename);
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet=workbook.getSheet(sheetname);
        XSSFRow row=sheet.getRow(0);
        int noOfRows=sheet.getPhysicalNumberOfRows();
        int noOfCols=row.getLastCellNum();
        Cell cell;
        data=new String[noOfRows-1][noOfCols];
        for (int i=1;i<noOfRows;i++) {
            for (int j = 0; j < noOfCols; j++) {
                row = sheet.getRow(i);
                cell = row.getCell(j);
                data[i - 1][j] = cell.getStringCellValue();
            }
        }
        return data;

    }

    @Parameters({"browser"})
    @BeforeMethod
    public void beforeMethod(String browser) {
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equals("edge")) {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\Akshay\\Downloads\\edgedriver_win64\\msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            System.out.println("please insert correct browser name");
        }
    }
    @Test(dataProvider = "Data123")
    public void method11(String keywotd1,String keywotd2) throws InterruptedException {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement txtBox=driver.findElement(By.id("email"));
        txtBox.sendKeys(keywotd1);
        WebElement txtBox2=driver.findElement(By.id("pass"));
        txtBox2.sendKeys(keywotd2);
        txtBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
    }

}