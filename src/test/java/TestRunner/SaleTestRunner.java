package TestRunner;

import Pages.Sale;
import Setup.Setup;
import org.testng.annotations.Test;

public class SaleTestRunner extends Setup {
    @Test(priority = 0, enabled = false)
    public void addCardWithoutSelectColor() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Sale sale = new Sale(driver);
        sale.addCardWithoutSelectColor();
    }
    @Test
    public void proceedToCheckout() throws InterruptedException {
        driver.get("https://envothemes.com/envo-ecommerce");
        Sale sale = new Sale(driver);
        sale.checkout();
    }
}
