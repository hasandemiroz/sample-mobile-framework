package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class SwapPage extends BasePage{

    @FindBy(id = "toolbarTitle")
    WebElement toolbarTitle;

    @FindBy(id = "FromNetworkSelector")
    WebElement fromNetworkSelector;

    @FindBy(id = "ToNetworkSelector")
    WebElement toNetworkSelector;

    public SwapPage(AppiumDriver driver) {
        super(driver);
    }


    public void swapPageElementsDisplayed()  {
        Assert.assertTrue(toolbarTitle.isDisplayed(), "Toolbar title");
        Assert.assertTrue(fromNetworkSelector.isDisplayed(), "From network selector");
        Assert.assertTrue(toNetworkSelector.isDisplayed(), "To network selector");
    }


}
