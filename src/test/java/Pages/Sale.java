package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sale {
    WebDriver driver;
    @FindBy(xpath = "//a[contains(text(),'Shop')]")
    WebElement navLinkSale;
    @FindBy(xpath = "//h2[contains(text(),'Polo T-shirt')]")
    WebElement productTitle;

    public Sale(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addCardWithoutColor(){

    }
}
