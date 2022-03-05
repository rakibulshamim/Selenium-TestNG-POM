package TestRunner;

import Pages.Shop;
import Setup.Setup;
import org.testng.annotations.Test;

public class ShopTestRunner extends Setup {
    @Test(priority = 0, groups = "Search", description = "Filter products by a range of prices")
    public void filterByPrice(){
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.filterByPrice();
    }
    @Test(priority = 1, groups = "Search", description = "Filter products by Color")
    public void filterByColor() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.filterByColor();
    }
    @Test(priority = 2, groups = "Search", description = "Sorting products by price: low to high")
    public void sortByPrice(){
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.sortByPrice();
    }
    @Test(priority = 3, groups = "Search", description = "Search by drop-down")
    public void searchByDropdown() throws InterruptedException {
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.searchByDropdown();
    }
    @Test(priority = 4, groups = "Search", description = "Search by product name")
    public void searchByName() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.searchByName();
    }
    @Test(priority = 5, groups = "Search", description = "Blank search")
    public void blankSearchBox() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.blankSearch();
    }
}