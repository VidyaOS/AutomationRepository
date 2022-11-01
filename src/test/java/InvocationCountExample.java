import org.openqa.selenium.json.JsonOutput;
import org.testng.annotations.Test;

public class InvocationCountExample {
    @Test
    public void invocationMethod(){
        System.out.println("This is my test case 1");
    }
    @Test(invocationCount = 5,invocationTimeOut = 2 )
    public void invocationMethod2(){
        System.out.println("This is my test case 2");
    }
}
