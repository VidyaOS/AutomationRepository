import org.testng.annotations.Test;

public class DependingOnGroupsExample {
    @Test(groups = {"sanity"})
    void test1(){ System.out.println("Test 1"); }
    @Test(groups = {"sanity"})
    void test2(){ System.out.println("Test 2"); }
    @Test(groups = {"regression"})
    void test3(){ System.out.println("Test 3"); }
    @Test(groups = {"regression"})
    void test4(){ System.out.println("Test 4"); }
    @Test(groups = {"sanity","regression"})
    void test5(){ System.out.println("Test 5"); }
    @Test(groups = {"sanity"})
    void test6(){ System.out.println("Test 6"); }
}
