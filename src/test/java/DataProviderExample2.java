import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample2 {
    @Test(dataProvider = "LoginDataProvider",dataProviderClass = DataProviderExampleCustom.class)
    public void loginTest(String email,String pwd){
        System.out.println(email+" "+pwd);
    }


}
