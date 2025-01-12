package web.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import web.pages.selenium.booking.main_page.FiltersApartmentsComponent;
import web.pages.selenium.booking.main_page.SearchApartmentsComponent;
import web.pages.selenium.booking.main_page.SortApartmentsComponent;
import web.settings.BookingSettings;

public class FifthStarIconExistSteps {

    SearchApartmentsComponent searchApartments = new SearchApartmentsComponent();
    BookingSettings bookingSettings = new BookingSettings();
    BookingBaseSteps bookingBaseSteps = new BookingBaseSteps();
    FiltersApartmentsComponent filtersApartments = new FiltersApartmentsComponent();
    SortApartmentsComponent sortApartments = new SortApartmentsComponent();

    @Given("I open a site")
    public void openSite() {
        bookingBaseSteps.openSite();
    }

    @When("I enter Paris in search field")
    public void enterLocationField() {
        searchApartments.clickOnLocationField();
        searchApartments.enterLocation(BookingSettings.PARIS);

        BookingBaseSteps.LOGGER.debug("When: I enter Paris in search field - passed");
    }

    @When("I set dates to arrive and departure")
    public void setDates() {
        searchApartments.clickDatesTable();
        searchApartments.setArrivalDate(bookingSettings.getArrivalDate());
        searchApartments.setDepartureDate(bookingSettings.getDepartureDate());

        BookingBaseSteps.LOGGER.debug("When: I set dates to arrive and departure - passed");
    }

    @When("I set resettlement")
    public void setResettlement() {
        searchApartments.clickResettlementTable();
        searchApartments.clickPlusAdultsButton();
        searchApartments.clickPlusAdultsButton();
        searchApartments.clickPlusApartmentsButton();
        searchApartments.clickPlusApartmentsButton();
        searchApartments.submitResettlementTable();

        BookingBaseSteps.LOGGER.debug("When: I set resettlement - passed");
    }

    @When("I filter apartments")
    public void filterApartments() {
        filtersApartments.setFiveStars();

        BookingBaseSteps.LOGGER.debug("When: I filter apartments - passed");
    }

    @When("I open founded apartment")
    public void openFoundedApartment() {
        sortApartments.clickSortDropDown();
        sortApartments.clickDescendingApartments();

        BookingBaseSteps.LOGGER.debug("When: I open founded apartment - passed");
    }

    @Then("I see fifth star icon")
    public void checkFifthStarIconExist() {
        Assert.assertEquals("Apartment don't exist icon \"Five stars\"",
                true,
                sortApartments.fifthStarExist());

        BookingBaseSteps.LOGGER.debug("Then: I see fifth star icon - passed");
        bookingBaseSteps.quit();
    }
}
