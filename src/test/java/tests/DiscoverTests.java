package tests;

import org.testng.annotations.Test;
import pages.DiscoverPage;

public class DiscoverTests extends BaseTest {

    DiscoverPage discoverPage = new DiscoverPage(driver);

    @Test(description = "Discover page elements are displayed")
    public void discoverPage() {
        discoverPage.discoverNavigationButton.click();

        discoverPage.discoverPageElementsDisplayed();
        discoverPage.navigationButtonsVisible();
    }


}
