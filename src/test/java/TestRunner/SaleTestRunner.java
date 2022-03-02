package TestRunner;

import Pages.Sale;
import Setup.Setup;
import org.testng.annotations.Test;

public class SaleTestRunner extends Setup {
    @Test
    public void addCardWithoutSelectColor() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Sale sale = new Sale(driver);
        sale.addCardWithoutSelectColor();
    }
}
