package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.testng.Assert;

public class Sale {
    WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Shop')]")
    WebElement navLinkSale;
    @FindBy(xpath = "//h2[contains(text(),'Polo T-shirt')]")
    WebElement productTitle;
    @FindBy(xpath = "//button[contains(text(),'Add to cart')]")
    WebElement btnAddToCard;
    @FindBy(xpath = "//div[@class='woocommerce-notices-wrapper']")
    WebElement errorMessage;

    public Sale(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addCardWithoutSelectColor() {
        navLinkSale.click();
        productTitle.click();
        btnAddToCard.click();
        String text = errorMessage.getText();
        Assert.assertEquals(text, "Please choose product options by visiting Polo T-shirt.");
    }
}
