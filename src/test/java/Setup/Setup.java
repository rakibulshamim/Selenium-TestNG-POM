package Setup;

import Utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;
import java.time.Duration;

public class Setup {
    public WebDriver driver;
    @BeforeTest(groups = {"Search","Purchase"})
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--headed");
        driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @AfterMethod(groups = {"Search","Purchase"}) //AfterMethod annotation - This method executes after every test execution
    public void screenShot(ITestResult result) throws IOException {
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
                Utils util = new Utils(driver);
                util.takeScreenShot();
            }
            catch (Exception exception) {
                System.out.println(exception.toString());
            }
        }
    }
    @AfterTest(groups = {"Search","Purchase"})
    public void logout(){
        driver.close();
    }
}
