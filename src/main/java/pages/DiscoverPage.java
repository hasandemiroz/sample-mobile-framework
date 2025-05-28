package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class DiscoverPage extends BasePage{

    @FindBy(id = "toolbarTitle")
    WebElement toolbarTitle;

    @FindBy(xpath = "//android.widget.EditText")
    WebElement searchBar;

    public DiscoverPage(AppiumDriver driver) {
        super(driver);
    }


    public void discoverPageElementsDisplayed()  {
        Assert.assertTrue(toolbarTitle.isDisplayed(), "Toolbar History Icon");
        Assert.assertTrue(searchBar.isDisplayed(), "Search Bar");
    }


}
