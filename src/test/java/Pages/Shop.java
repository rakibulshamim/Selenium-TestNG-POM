package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class Shop {
    WebDriver driver;
    @FindBy(xpath = "//a[contains(text(),'Shop')]")
    WebElement navLinkShop;
    @FindBy(name = "orderby")
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
    @FindBy(className = "woocommerce-result-count")
    WebElement searchResult;
    @FindBy(xpath = "//div[@class='ui-slider-range ui-corner-all ui-widget-header']")
    WebElement slider;
    @FindBy(xpath = "//button[contains(text(),'Filter')]")
    WebElement btnFilter;
    @FindBy(className = "select2-selection select2-selection--multiple")
    WebElement colorField;
    @FindBy(xpath = "//*[contains(text(), 'Red')]")
    WebElement fieldColor;
    @FindBy(xpath = "//button[contains(text(),'Apply')]")
    WebElement btnApply;

    public Shop(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void filterByPrice(){
        navLinkShop.click();
        Actions action = new Actions(driver);
        action.dragAndDropBy(slider, -100,200).perform();
        btnFilter.click();
        String text = searchResult.getText();
        Assert.assertEquals(text, "Showing all 5 results");
    }
    public void filterByColor() {
        navLinkShop.click();
        colorField.click();
        fieldColor.click();
        btnApply.click();
        String text = searchResult.getText();
        Assert.assertEquals(text, "Showing all 2 results");
    }
    public void sortByPrice(){
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
        String text = searchResult.getText();
        Assert.assertEquals(text, "Showing all 12 results");
    }
}