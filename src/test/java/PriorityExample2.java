import org.testng.annotations.Test;

public class PriorityExample2 {
    @Test(priority = 4)
    void testOne(){ System.out.println("Test 1"); }
    @Test(priority = 1)
    void testTwo(){ System.out.println("Test 2"); }
    @Test(priority = 3)
    void testThree(){ System.out.println("Test 3"); }
    @Test
    void testFour(){ System.out.println("Test 4"); }
    @Test(priority = -100)
    void testFive(){ System.out.println("Test 5"); }
    @Test(priority = -6)
    void testSix(){ System.out.println("Test 6"); }
}
