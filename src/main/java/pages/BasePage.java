package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class BasePage {
    protected AppiumDriver driver;



    public BasePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);


    }


    @FindBy(id = "HomeNavigationButton")
    WebElement homeNavigationButton;

    @FindBy(id = "TrendingTokenNavigationButton")
    public WebElement trendingNavigationButton;

    @FindBy(id = "SwapNavigationButton")
    public WebElement swapNavigationButton;

    @FindBy(id = "EarnNavigationButton")
    public WebElement earnNavigationButton;

    @FindBy(id = "DiscoverNavigationButton")
    public WebElement discoverNavigationButton;



    public void navigationButtonsVisible()  {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(homeNavigationButton));

        Assert.assertTrue(homeNavigationButton.isDisplayed(), "Home Navigation Button");
        Assert.assertTrue(trendingNavigationButton.isDisplayed(), "Trending Navigation Button");
        Assert.assertTrue(swapNavigationButton.isDisplayed(), "Swap Navigation Button");
        Assert.assertTrue(earnNavigationButton.isDisplayed(), "Earn Navigation Button");
        Assert.assertTrue(discoverNavigationButton.isDisplayed(), "Discover Navigation Button");
    }

}
