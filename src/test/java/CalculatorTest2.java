import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTest2 {
    Calculator calc;

    @BeforeClass
    public void beforeClassSetup() {
        System.out.println("Before Class Setup");
        calc = new Calculator();
    }

    @AfterClass
    public void afterClassSetup() {
        System.out.println("After Class Setup");
        calc = null;
    }

    @BeforeTest
    public void beforeTestSetup() {
        System.out.println("Before Test Setup");
    }

    @AfterTest
    public void afterTestSetup() {
        System.out.println("After Test Setup");
    }

    @BeforeMethod
    public void beforeMethodSetup() {
        System.out.println("Before Method Setup");
    }

    @AfterMethod
    public void afterMethodSetup() {
        System.out.println("After Method Setup");
    }

    @Test(priority = 2)
    public void testAdd(){
        Assert.assertEquals(calc.add(2,3), 5);
        Assert.assertEquals(calc.add(0,1), 1);
    }

    @Test(priority = 3)
    public void testSubtract(){
        Assert.assertEquals(calc.subtract(2,3), -1);
        Assert.assertEquals(calc.subtract(3,2), 1);
    }

    @Test(priority = 1)
    public void testMultiply() {
        Assert.assertEquals(calc.multiply(2,3), 6);
        Assert.assertEquals(calc.multiply(1,4), 4);
    }

    @Test(priority = 4)
    public void testDivide() {
        Assert.assertEquals(calc.divide(6,3), 2);
        Assert.assertEquals(calc.divide(4,0), 0);
        Assert.assertEquals(calc.divide(10,5), 2);
    }
}
