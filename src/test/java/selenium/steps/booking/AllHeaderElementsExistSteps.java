package selenium.steps.booking;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import selenium.driver.Driver;
import selenium.pages.booking.BookingBase;
import selenium.pages.booking.Header;
import selenium.pages.booking.LogInPage;

public class AllHeaderElementsExistSteps {

    WebDriver driver = Driver.getDriver();
    Header header = new Header();
    LogInPage logInPage = new LogInPage();

    @Given("I open a site")
    public void openSite() {
        driver.get(BookingBase.URL);
    }

    @When("Login as registered user")
    public void loginAsRegisteredUser() {
        header.clickLogInButton();
        logInPage.enterEmail();
    }

    //todo
}
