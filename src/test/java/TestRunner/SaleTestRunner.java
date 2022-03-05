package TestRunner;

import Pages.Sale;
import Setup.Setup;
import org.testng.annotations.Test;

public class SaleTestRunner extends Setup {
    @Test(priority = 0, groups = "Purchase", description = "Try adding product without choosing color")
    public void noColorSelection() throws InterruptedException {
        driver.get("https://envothemes.com/envo-ecommerce");
        Sale sale = new Sale(driver);
        sale.noColorSelection();
    }
    @Test(priority = 1, groups = "Purchase", description = "Add color from the drop-down")
    public void addMultipleColor() throws InterruptedException {
        driver.get("https://envothemes.com/envo-ecommerce");
        Sale sale = new Sale(driver);
        sale.addMultipleColor();
    }
    @Test(priority = 2, groups = "Purchase", description = "Add multiple product to card")
    public void addMultipleProduct() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Sale sale = new Sale(driver);
        sale.addMultipleProduct();
    }
    @Test(priority = 3, groups = "Purchase", description = "Try adding less than one product")
    public void productQuantity() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Sale sale = new Sale(driver);
        sale.productQuantity();
    }
    @Test(priority = 4, groups = "Purchase", description = "The process of placing orders")
    public void checkout() throws InterruptedException {
        driver.get("https://envothemes.com/envo-ecommerce");
        Sale sale = new Sale(driver);
        sale.checkout();
    }
}
