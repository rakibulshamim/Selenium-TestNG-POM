package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.testng.Assert;

import java.util.List;

public class Sale {
    WebDriver driver;
    @FindBy(xpath = "//a[contains(text(),'Sale')]")
    WebElement navLinkSale;
    @FindBy(xpath = "//h2[contains(text(),'Polo T-shirt')]")
    WebElement productTitle;
    @FindBy(xpath = "//button[contains(text(),'Add to cart')]")
    WebElement btnAddToCard;
    @FindBy(xpath = "//div[@class='woocommerce-notices-wrapper']")
    WebElement alertMessage;
    @FindBy(id = "pa_color")
    WebElement btnColor;
    @FindBy(xpath = "//a[contains(text(),'View cart')]")
    List<WebElement> btnViewCard;
    @FindBy(className = "wc-proceed-to-checkout")
    WebElement btnCheckout;

    public Sale(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addCardWithoutSelectColor() throws InterruptedException {
        navLinkSale.click();
        productTitle.click();
        btnAddToCard.click();
        Thread.sleep(1000);
        String text = alertMessage.getText();
        Assert.assertEquals(text, "Please choose product options by visiting Polo T-shirt.");
    }
    public void checkout() throws InterruptedException {
        navLinkSale.click();
        productTitle.click();
        btnColor.sendKeys(Keys.chord("Red", Keys.ENTER));
        btnAddToCard.click();
        Thread.sleep(3000);
        btnViewCard.get(3).click();
        btnCheckout.click();
    }
}
