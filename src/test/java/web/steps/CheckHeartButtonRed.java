package web.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.pages.selenium.booking.main_page.SearchApartmentsComponent;

import java.time.LocalDate;

public class CheckHeartButtonRed {

    BookingBaseSteps bookingBaseSteps = new BookingBaseSteps();
    SearchApartmentsComponent searchApartments = new SearchApartmentsComponent();

    @Given("I open a site")
    public void openSite() {
        bookingBaseSteps.openSite();
    }

    @When("Find booking in Madrid, one month from now, two adults for five days")
    public void findApartment() {
        searchApartments.clickOnLocationField();
        searchApartments.enterLocation("Мадрид");
        searchApartments.clickDatesTable();
        searchApartments.setArrivalDate(LocalDate.now());
        searchApartments.setDepartureDate(LocalDate.now().plusDays(5));
        searchApartments.clickResettlementTable();
        searchApartments.clickPlusAdultsButton();
        searchApartments.clickPlusAdultsButton();
        searchApartments.submitResettlementTable();
    }

    @When("The first and the last hotel in the list add to favorites")
    public void test() {}

    @Then("Verify, that heart button become red")
    public void test2(){}
}
