package tests;

import org.testng.annotations.Test;
import pages.TrendingPage;


public class TrendingTest extends BaseTest {

    TrendingPage trendingPage = new TrendingPage(driver);

    @Test(description = "Trending page elements are displayed")
    public void trendingPageTests() {
        trendingPage.trendingNavigationButton.click();

        trendingPage.trendingPageElementsDisplayed();
        trendingPage.navigationButtonsVisible();
    }


}
