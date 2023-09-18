package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePage {
    WebDriver driver;
    @FindBy(xpath = "//span[contains(text(),'$100.00')]")
    private WebElement priceInTheMobilePage;
    @FindBy(id = "product-collection-image-1")
    private WebElement sonyMobile;


    public MobilePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String priceInMobilePage() {
        return priceInTheMobilePage.getText();

    }
    public void clickSonyMobile(){
        sonyMobile.click();
    }
}
