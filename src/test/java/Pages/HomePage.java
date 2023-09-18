package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.WatchEvent;

public class HomePage {
    private WebDriver driver;
    @FindBy(xpath = "//a[normalize-space()='Mobile']")
    private WebElement mobileButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void clickMobileBtn(){
        mobileButton.click();
    }
}
