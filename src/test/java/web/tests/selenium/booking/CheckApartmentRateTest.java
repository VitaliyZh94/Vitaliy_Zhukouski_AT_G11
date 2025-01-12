package web.tests.selenium.booking;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import web.pages.selenium.booking.ApartmentPage;
import web.pages.selenium.booking.main_page.SearchApartmentsComponent;
import web.pages.selenium.booking.main_page.SortApartmentsComponent;
import web.settings.BookingSettings;
import web.utils.JS;


public class CheckApartmentRateTest extends BookingBaseTest {

    private static final Logger LOGGER = LogManager.getLogger(CheckApartmentRateTest.class);

    SearchApartmentsComponent searchApartments = new SearchApartmentsComponent();
    BookingSettings bookingSettings = new BookingSettings();
    SortApartmentsComponent sortApartments = new SortApartmentsComponent();
    ApartmentPage apartment = new ApartmentPage();

    @Test
    public void checkApartmentRateMoreThanNine() {
        searchApartments.clickOnLocationField();
        searchApartments.enterLocation("Прага");
        searchApartments.clickDatesTable();
        searchApartments.setArrivalDate(bookingSettings.getArrivalDate());
        searchApartments.setDepartureDate(bookingSettings.getDepartureDate());
        searchApartments.submitResettlementTable();
        sortApartments.clickSortDropDown();
        sortApartments.clickDescendingApartments();
        JS js = new JS(driver);
        js.openURLInCurrentTab(sortApartments.getFIRST_DESCENDING_APARTMENT());
        sortApartments.clickFirstDescendingApartment();

        Assert.assertEquals("Rate must be more than 9. Rate = " + apartment.getApartmentRate(),
                true,
                apartment.getApartmentRate() > 9);

        LOGGER.debug("Assert passed: Expected = {}. Actual = {}", true, apartment.getApartmentRate() > 9);
    }
}
