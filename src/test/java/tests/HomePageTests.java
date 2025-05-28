package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import utils.DriverUtils;

public class HomePageTests extends BaseTest {

    HomePage homePage = new HomePage(DriverUtils.getDriver());;

    @Test(description = "Homepage elements are displayed")
    public void homePageTests() {
        homePage.homePageElementsVisible();
        homePage.navigationButtonsVisible();
    }

    @Test(description = "Navigates to Send page and asserts the page")
    public void sendPageTest() {
        homePage.navigateToPage("Send");
        homePage.sendPageElementsVisible("Send");
    }

    @Test(description = "Navigates to Receive page and asserts the page")
    public void receivePageTest() {
        homePage.navigateToPage("Receive");
        homePage.sendPageElementsVisible("Receive");
    }

    @Test(description = "Navigates to Buy page and asserts the page")
    public void buyPageTest() {
        homePage.navigateToPage("Buy");
        homePage.sendPageElementsVisible("Buy Crypto");
    }

    @Test(description = "Navigates to Sell page and asserts the page")
    public void sellPageTest() {
        homePage.navigateToPage("Sell");
        homePage.sendPageElementsVisible("Sell");
    }
}