package selenium.steps.booking;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import selenium.driver.Driver;
import selenium.pages.booking.BookingBase;
import selenium.pages.booking.Header;
import selenium.pages.booking.LogInPage;


public class AllHeaderElementsExistSteps {

    private static final Logger LOGGER = LogManager.getLogger(AllHeaderElementsExistSteps.class);

    WebDriver driver = Driver.getDriver();
    Header header = new Header();
    LogInPage logInPage = new LogInPage();

    @Given("I open a site")
    public void openSite() {
        driver.get(BookingBase.URL);

        LOGGER.debug("");
    }

    @When("Login as registered user")
    public void loginAsRegisteredUser() {
        header.clickLogInButton();
        logInPage.enterEmail();

        LOGGER.debug("");
    }

    //todo
}
