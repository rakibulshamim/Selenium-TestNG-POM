package TestRunner;

import Pages.Sale;
import Setup.Setup;
import org.testng.annotations.Test;

public class SaleTestRunner extends Setup {
    @Test(priority = 0, enabled = true)
    public void addCardWithoutSelectColor() throws InterruptedException {
        driver.get("https://envothemes.com/envo-ecommerce");
        Sale sale = new Sale(driver);
        sale.addCardWithoutSelectColor();
    }
    @Test(priority = 1, enabled = true)
    public void proceedToCheckout() throws InterruptedException {
        driver.get("https://envothemes.com/envo-ecommerce");
        Sale sale = new Sale(driver);
        sale.checkout();
    }
}
