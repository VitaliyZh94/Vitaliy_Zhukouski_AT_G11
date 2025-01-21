package web.steps.booking;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import web.driver.DriverSelenium;
import web.pages.selenium.booking.LogInPage;
import web.pages.selenium.booking.main_page.HeaderComponent;


public class AllHeaderElementsExistSteps {

    //todo


    WebDriver driver = DriverSelenium.getDriver();
    BookingBaseSteps bookingBaseSteps = new BookingBaseSteps();
    HeaderComponent header = new HeaderComponent();
    LogInPage logInPage = new LogInPage();

    String mainTab = driver.getWindowHandle();

    @Given("I open web-site")
    public void openSite() {
        bookingBaseSteps.openSite();
    }

    @When("Login as registered user")
    public void loginAsRegisteredUser() {
        header.clickLogInButton();
        logInPage.logInUsingGoogle();

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainTab)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        //String chooseAccountTab = driver.getWindowHandle();



        BookingBaseSteps.LOGGER.debug("");
    }


}
