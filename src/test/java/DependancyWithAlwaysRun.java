import org.testng.Assert;
import org.testng.annotations.Test;

public class DependancyWithAlwaysRun {
    @Test
    public void startCar(){
        Assert.assertFalse(true);
        System.out.println("Car started");

    }
    @Test(dependsOnMethods = {"startCar"})
    public void driveCar(){
        System.out.println("Car driven");
    }
    @Test(dependsOnMethods = {"driveCar"})
    public  void stopCar(){
        System.out.println("Car stopped");
    }
    @Test(dependsOnMethods = {"stopCar","driveCar"},alwaysRun = true)
    public  void parkCar(){
        System.out.println("Car parked");
    }
}
