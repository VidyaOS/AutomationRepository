import org.testng.annotations.Test;

public class ExpectedException {
    @Test(expectedExceptions = ArithmeticException.class)
    void testOne(){
        int a= 0;
        int b= 5;
        System.out.println(b/a);
    }
    @Test
    void testTwo(){ System.out.println("Test 2"); }
    @Test
    void testThree(){ System.out.println("Test 3"); }
    @Test
    void testFour(){ System.out.println("Test 4"); }
}
