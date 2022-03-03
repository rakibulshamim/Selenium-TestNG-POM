package TestRunner;

import Pages.Shop;
import Setup.Setup;
import org.testng.annotations.Test;

public class ShopTestRunner extends Setup {
    @Test(priority = 0, enabled = false)
    public void filterByPrice(){
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.filterByPrice();
    }
    @Test(priority = 1, enabled = true)
    public void filterByColor(){
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.filterByColor();
    }
    @Test(priority = 2, enabled = false)
    public void sortOrderByPrice(){
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.sortByPrice();
    }
    @Test(priority = 3, enabled = false)
    public void searchDropdown() throws InterruptedException {
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.searchByDropdown();
    }
    @Test(priority = 4, enabled = false)
    public void searchByProduct() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.searchByProductName();
    }
    @Test(priority = 5, enabled = false)
    public void blankSearchBox() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.blankSearch();
    }
}
