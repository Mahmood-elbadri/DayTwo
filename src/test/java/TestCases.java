import Pages.HomePage;
import Pages.MobilePage;
import Pages.SonyPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestCases {
    HomePage home;
    WebDriver driver;
    String url = "";
    MobilePage mobile;
    String mobilePagePrice = "";
    String sonyPagePrice = "";
    SonyPage sony;

    @BeforeTest
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        home = new HomePage(driver);
        mobile = new MobilePage(driver);
        sony = new SonyPage(driver);
        url = "http://live.techpanda.org/index.php/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get(url);
    }

    @Test(priority = 0)
    public void test1() {
        home.clickMobileBtn();
        mobilePagePrice = mobile.priceInMobilePage();
        mobile.clickSonyMobile();
        sonyPagePrice = sony.priceInSonyPage();
        Assert.assertEquals(mobilePagePrice,sonyPagePrice);
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
