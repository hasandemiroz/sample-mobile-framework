package tests;

import org.testng.annotations.Test;
import pages.SwapPage;

public class SwapTests extends BaseTest {

    SwapPage swapPage = new SwapPage(driver);

    @Test(description = "Swap page elements are displayed")
    public void swapPageTests() {
        swapPage.swapNavigationButton.click();

        swapPage.swapPageElementsDisplayed();
        swapPage.navigationButtonsVisible();
    }


}
