package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class Sale {
    WebDriver driver;
    @FindBy(id = "menu-item-75")
    WebElement tabSale;
    @FindBy(xpath = "//h2[contains(text(),'Polo T-shirt')]")
    WebElement header;
    @FindBy(xpath = "//button[contains(text(),'Add to cart')]")
    WebElement btnAddToCard;
    @FindBy(xpath = "//div[@class='woocommerce-notices-wrapper']")
    WebElement alertMessage;
    @FindBy(id = "pa_color")
    WebElement chooseColor;
    @FindBy(xpath = "//a[contains(text(),'View cart')]")
    List<WebElement> btnViewCard;
    @FindBy(className = "wc-proceed-to-checkout")
    WebElement btnCheckout;
    @FindBy(xpath = "//h2[contains(text(),'Single Shirt')]")
    WebElement anotherHeader;
    @FindBy(name = "quantity")
    WebElement quantity;

    public Sale(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void noColorSelection() throws InterruptedException {
        tabSale.click();
        header.click();
        btnAddToCard.click();
        Thread.sleep(2000);
        String text = alertMessage.getText();
        Assert.assertEquals(text, "Please choose product options by visiting Polo T-shirt.");
    }
    public void addMultipleColor() throws InterruptedException {
        tabSale.click();
        header.click();
        Select select = new Select(chooseColor);
        Thread.sleep(2000);
        select.selectByValue("white");
        btnAddToCard.click();
    }
    public void addMultipleProduct() {
        tabSale.click();
        anotherHeader.click();
        quantity.clear();
        quantity.sendKeys("5");
        btnAddToCard.click();
    }
    public void productQuantity() {
        tabSale.click();
        anotherHeader.click();
        quantity.clear();
        quantity.sendKeys("0");
        btnAddToCard.click();
    }
    public void checkout() throws InterruptedException {
        tabSale.click();
        header.click();
        chooseColor.sendKeys(Keys.chord("Red", Keys.ENTER));
        btnAddToCard.click();
        Thread.sleep(3000);
        btnViewCard.get(3).click();
        btnCheckout.click();
    }
}
