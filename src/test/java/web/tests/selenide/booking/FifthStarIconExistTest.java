package web.tests.selenide.booking;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import web.pages.selenide.booking.main_page.FiltersApartmentsComponent;
import web.pages.selenide.booking.main_page.SearchApartmentsComponent;
import web.pages.selenide.booking.main_page.SortApartmentsComponent;
import web.settings.BookingSettings;


public class FifthStarIconExistTest extends BookingBaseTest {

    private static final Logger LOGGER = LogManager.getLogger(FifthStarIconExistTest.class);

    SearchApartmentsComponent searchApartments = new SearchApartmentsComponent();
    FiltersApartmentsComponent filtersApartments = new FiltersApartmentsComponent();
    SortApartmentsComponent sortApartments = new SortApartmentsComponent();
    BookingSettings bookingSettings = new BookingSettings();

    @Test
    public void checkFifthStarIconExist() {
        searchApartments.clickOnLocationField();
        searchApartments.enterLocation("Париж");
        searchApartments.clickDatesTable();
        searchApartments.setArrivalDate(bookingSettings.getArrivalDate());
        searchApartments.setDepartureDate(bookingSettings.getDepartureDate());
        searchApartments.clickResettlementTable();
        searchApartments.clickPlusAdultsButton(2);
        searchApartments.clickPlusApartmentsButton(2);
        searchApartments.submitResettlementTable();
        filtersApartments.setFiveStars();
        sortApartments.clickSortDropDown();
        sortApartments.clickDescendingApartments();

        Assert.assertEquals("Apartment don't exist icon \"Five stars\"",
                true,
                sortApartments.fifthStarExist());

        LOGGER.debug("Assert passed: Expected = {}. Actual = {}", true, sortApartments.fifthStarExist());
    }
}
