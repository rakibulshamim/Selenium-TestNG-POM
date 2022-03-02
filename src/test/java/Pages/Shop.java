package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class Shop {
    WebDriver driver;
    @FindBy(xpath = "//a[contains(text(),'Shop')]")
    WebElement navLinkShop;
    @FindBy(xpath = "//h2[contains(text(),'Oldies')]")
    WebElement productTitle;
    @FindBy(xpath = "//select[@id='color']")
    WebElement btnColor;
    @FindBy(xpath = "//button[contains(text(),'Add to cart')]")
    WebElement btnAddToCard;
    @FindBy(xpath = "//a[contains(text(),'View cart')]")
    List<WebElement> btnViewCard;
    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
    WebElement btnCheckout;
    @FindBy(name = "orderBy")
    WebElement dropDown;
    @FindBy(xpath = "//h2[contains(text(),'Black trousers')]")
    WebElement productName;
    @FindBy(xpath = "//h1[contains(text(),'Black trousers')]")
    WebElement newProductName;
    @FindBy(name = "product_cat")
    WebElement searchDropdown;
    @FindBy(xpath = "//i[1]")
    List<WebElement> iconSearch;
    @FindBy(name = "s")
    WebElement searchBox;
    @FindBy(xpath = "//p[contains(text(),'Showing all 2 results')]")
    WebElement searchResult;
    @FindBy(xpath = "//p[contains(text(),'Showing all 12 results')]")
    WebElement blankSearchResult;

    public Shop(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void checkout() throws InterruptedException {
        navLinkShop.click();
        productTitle.click();
        btnColor.sendKeys(Keys.chord("Black", Keys.ENTER));
        btnAddToCard.click();
        Thread.sleep(3000);
        btnViewCard.get(3).click();
        btnCheckout.click();
    }
    public void sortByPrice() {
        navLinkShop.click();
        Select select =new Select(dropDown);
        select.selectByIndex(4);
        productName.click();
        String text = newProductName.getText();
        Assert.assertEquals(text, "Black trousers");
    }
    public void searchByDropdown() throws InterruptedException {
        Select select =new Select(searchDropdown);
        select.selectByIndex(2);
        Thread.sleep(2000);
        iconSearch.get(2).click();
    }
    public void searchByProductName(){
        searchBox.sendKeys(Keys.chord("shirt", Keys.ENTER));
        String text = searchResult.getText();
        Assert.assertEquals(text, "Showing all 2 results");
    }
    public void blankSearch(){
        searchBox.sendKeys( Keys.ENTER);
        String text = blankSearchResult.getText();
        Assert.assertEquals(text, "Showing all 12 results");
    }
}