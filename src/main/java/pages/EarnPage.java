package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class EarnPage extends BasePage{


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View")
    WebElement earnHubTab;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View")
    WebElement launchPoolTab;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View")
    WebElement myEarningsTab;

    @FindBy(id = "sectionHeaderNative")
    WebElement sectionHeaderNative;

    @FindBy(className = "android.view.View")
    WebElement earnings;

    public EarnPage(AppiumDriver driver) {
        super(driver);
    }


    public void EarnPageElementsDisplayed()  {
        Assert.assertTrue(earnHubTab.isDisplayed(), "EarnHub Tab");
        Assert.assertTrue(launchPoolTab.isDisplayed(), "Launch Pool Tab");
        Assert.assertTrue(myEarningsTab.isDisplayed(), "My Earnings Tab");

        Assert.assertTrue(sectionHeaderNative.isDisplayed(), "Section header native");
        Assert.assertTrue(earnings.isDisplayed(), "earnings");
    }


}
