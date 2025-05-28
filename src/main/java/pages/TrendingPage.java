package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class TrendingPage extends BasePage{

    @FindBy(id = "toolbarTitle")
    WebElement toolbarTitle;

    @FindBy(id = "volume_none")
    WebElement volume_none;

    @FindBy(id = "price_change_none")
    WebElement price_change_none;

    public TrendingPage(AppiumDriver driver) {
        super(driver);
    }


    public void trendingPageElementsDisplayed()  {
        Assert.assertTrue(toolbarTitle.isDisplayed(), "Toolbar History Icon");
        Assert.assertTrue(volume_none.isDisplayed(), "Volume  displayed");
        Assert.assertTrue(price_change_none.isDisplayed(), "Price change");
    }


}
