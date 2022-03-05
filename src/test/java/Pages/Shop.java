package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class Shop {
    WebDriver driver;
    @FindBy(id = "menu-item-79")
    WebElement tabShop;
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
    @FindBy(xpath = "//p[@class='woocommerce-result-count']")
    WebElement searchResult;
    @FindBy(xpath = "//div[@class='ui-slider-range ui-corner-all ui-widget-header']")
    WebElement slider;
    @FindBy(xpath = "//button[contains(text(),'Filter')]")
    WebElement btnFilter;
    @FindBy(xpath = "//div[@class='price_slider_wrapper']")
    WebElement colorField;
    @FindBy(xpath = "//*[contains(text(), 'Red')]")
    WebElement color;
    @FindBy(xpath = "//*[contains(text(), 'White')]")
    WebElement anotherColor;
    @FindBy(xpath = "//button[contains(text(),'Apply')]")
    WebElement btnApply;

    public Shop(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void filterByPrice(){
        tabShop.click();
        Actions action = new Actions(driver);
        action.dragAndDropBy(slider, -100,200).perform();
        btnFilter.click();
        String text = searchResult.getText();
        Assert.assertEquals(text, "Showing all 5 results");
    }
    public void filterByColor(){
        tabShop.click();
        colorField.click();
        color.click();
        anotherColor.click();
        btnApply.click();
        String text = searchResult.getText();
        Assert.assertEquals(text, "Showing all 2 results");
    }
    public void sortByPrice(){
        tabShop.click();
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
    public void searchByName(){
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