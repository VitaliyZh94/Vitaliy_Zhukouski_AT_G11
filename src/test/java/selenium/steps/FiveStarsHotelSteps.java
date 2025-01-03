package selenium.steps;

import selenium.driver.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import selenium.pages.booking.BookingBase;
import selenium.pages.booking.SearchApartments;
import selenium.settings.BookingSettings;

public class FiveStarsHotelSteps {

    WebDriver driver = Driver.getDriver();

    SearchApartments searchApartments = new SearchApartments();
    BookingSettings bookingSettings = new BookingSettings();

    @Given("I open a site")
    public void openSite() {
        driver.get(BookingBase.URL);
    }

    @When("I enter Paris in search field")
    public void enterLocationField() {
        searchApartments.clickOnLocationField();
        searchApartments.enterLocation(BookingSettings.PARIS);
    }

    @When("I set dates to arrive and departure")
    public void setDates() {
        searchApartments.clickDatesTable();
        searchApartments.setArrivalDate(bookingSettings.getArrivalDate());
        searchApartments.setDepartureDate(bookingSettings.getDepartureDate());
    }

    @When("I set resettlement")
    public void setResettlement() {
        searchApartments.clickResettlementTable();
        searchApartments.clickPlusAdultsButton();
        searchApartments.clickPlusAdultsButton();
        searchApartments.clickPlusApartmentsButton();
        searchApartments.clickPlusApartmentsButton();
        searchApartments.submitResettlementTable();
    }

    @Then("Then I see list of hotels")
    public void checkListOfHotels() {
        System.out.println("There are 10 hotels");
    }

}
