package selenium.steps.booking;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import selenium.driver.Driver;
import selenium.pages.booking.BookingBase;
import selenium.pages.booking.SearchApartments;
import selenium.settings.BookingSettings;

public class FiveStarsHotelSteps {

    private static final Logger LOGGER = LogManager.getLogger(FiveStarsHotelSteps.class);

    WebDriver driver = Driver.getDriver();
    SearchApartments searchApartments = new SearchApartments();
    BookingSettings bookingSettings = new BookingSettings();

    @Given("I open a site")
    public void openSite() {
        driver.get(BookingBase.URL);
        LOGGER.debug("");
    }

    @When("I enter Paris in search field")
    public void enterLocationField() {
        searchApartments.clickOnLocationField();
        searchApartments.enterLocation(BookingSettings.PARIS);

        LOGGER.debug("");
    }

    @When("I set dates to arrive and departure")
    public void setDates() {
        searchApartments.clickDatesTable();
        searchApartments.setArrivalDate(bookingSettings.getArrivalDate());
        searchApartments.setDepartureDate(bookingSettings.getDepartureDate());

        LOGGER.debug("");
    }

    @When("I set resettlement")
    public void setResettlement() {
        searchApartments.clickResettlementTable();
        searchApartments.clickPlusAdultsButton();
        searchApartments.clickPlusAdultsButton();
        searchApartments.clickPlusApartmentsButton();
        searchApartments.clickPlusApartmentsButton();
        searchApartments.submitResettlementTable();

        LOGGER.debug("");
    }

    @Then("Then I see list of hotels")
    public void checkListOfHotels() {
        System.out.println("There are 10 hotels");
        LOGGER.debug("");
    }

}
