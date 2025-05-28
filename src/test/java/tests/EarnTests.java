package tests;

import org.testng.annotations.Test;
import pages.EarnPage;

public class EarnTests extends BaseTest {

    EarnPage earnPage = new EarnPage(driver);

    @Test(description = "Earn page elements are displayed")
    public void earnPage() {
        earnPage.earnNavigationButton.click();

        earnPage.EarnPageElementsDisplayed();
        earnPage.navigationButtonsVisible();
    }


}
