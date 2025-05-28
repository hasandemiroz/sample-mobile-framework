package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;


public class HomePage extends BasePage{
    HomePage homePage = new HomePage(driver);


    @FindBy(id = "topBarHistoryIcon")
    WebElement topBarHistoryIcon;

    @FindBy(id = "topBarQrIcon")
    WebElement topBarQrIcon;

    @FindBy(id = "topBarWalletName")
    WebElement topBarWalletName;

    @FindBy(id = "topBarSearchIcon")
    WebElement topBarSearchIcon;

    @FindBy(id = "mainBalance")
    WebElement mainBalance;

    @FindBy(id = "mainBalanceChange24h")
    WebElement mainBalanceChange24h;

    @FindBy(id = "HomeSendButton")
    WebElement sendButton;

    @FindBy(id = "HomeReceiveButton")
    WebElement receiveButton;

    @FindBy(id = "HomeBuyButton")
    WebElement buyButton;

    @FindBy(id = "HomeSellButton")
    WebElement sellButton;

    @FindBy(className = "android.widget.Button")
    WebElement buyCryptoButton;

    @FindBy(id = "assetsLayoutSettingsIcon")
    WebElement assetsLayoutSettingsIcon;

    @FindBy(id = "toolbarTitle")
    WebElement toolBarTitle;




    public HomePage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    public void homePageElementsVisible()  {
        By topBarHistoryIconLocator = By.id("topBarHistoryIcon");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(topBarHistoryIconLocator));

        Assert.assertTrue(topBarHistoryIcon.isDisplayed(), "Top Bar History Icon");
        Assert.assertTrue(topBarQrIcon.isDisplayed(), "Top Bar Qr Icon");
        Assert.assertTrue(topBarWalletName.isDisplayed(), "Top Bar Wallet Name");
        Assert.assertTrue(topBarSearchIcon.isDisplayed(), "Top Bar Search Icon");
        Assert.assertTrue(mainBalance.isDisplayed(), "Main Balance");
        Assert.assertTrue(mainBalanceChange24h.isDisplayed(), "Main Balance Change 24h");
        Assert.assertTrue(sendButton.isDisplayed(), "Send Button");
        Assert.assertTrue(receiveButton.isDisplayed(), "Receive Button");
        Assert.assertTrue(buyButton.isDisplayed(), "Buy Button");
        Assert.assertTrue(sellButton.isDisplayed(), "Sell Button");
        Assert.assertTrue(buyCryptoButton.isDisplayed(), "Sell Button");
        Assert.assertTrue(assetsLayoutSettingsIcon.isDisplayed(), "assetsLayoutSettingsIcon");
    }

    public void navigateToPage(String buttonName) {

        switch (buttonName){
            case "Send":
                homePage.sendButton.click();
                break;
            case "Receive":
                homePage.receiveButton.click();
                break;
            case "Buy":
                homePage.buyButton.click();
                break;
            case "Sell":
                homePage.sellButton.click();
                break;
            default:
                System.out.println("Please, choose the correct button.");
        }

    }

    public void sendPageElementsVisible(String barTitle)  {


        Assert.assertEquals(toolBarTitle.getText(),barTitle);


    }


}
