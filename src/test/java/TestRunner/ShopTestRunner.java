package TestRunner;

import Pages.Shop;
import Setup.Setup;
import org.testng.annotations.Test;

public class ShopTestRunner extends Setup {
    @Test(priority = 0, enabled = false)
    public void proceedToCheckout() throws InterruptedException {
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.checkout();
    }
    @Test(priority = 1, enabled = false)
    public void sortOrderByPrice() throws InterruptedException {
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.sortByPrice();
    }

    @Test(priority = 1, enabled = false)
    public void searchDropdown() throws InterruptedException {
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.searchByDropdown();
    }

    @Test(priority = 1)
    public void searchByProduct() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.searchByProductName();
    }
    @Test(priority = 2)
    public void blankSearchBox() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.blankSearch();
    }
}
