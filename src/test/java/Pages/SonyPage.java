package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SonyPage {
    WebDriver driver;
    @FindBy(xpath = "//span[@class='price']")private WebElement priceInTheSonyPage;
    public SonyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public String priceInSonyPage(){
        return priceInTheSonyPage.getText();
    }
}
