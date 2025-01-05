package selenium.tests.booking;

import org.junit.Assert;
import org.junit.Test;
import selenium.pages.booking.FiltersApartments;
import selenium.pages.booking.SearchApartments;
import selenium.pages.booking.SortApartments;
import selenium.settings.BookingSettings;


public class FiveStarsHotelTest extends BookingBaseTest {

    SearchApartments searchApartments = new SearchApartments();
    FiltersApartments filtersApartments = new FiltersApartments();
    SortApartments sortApartments = new SortApartments();
    BookingSettings bookingSettings = new BookingSettings();

    //@Test
    public void enterLocationField() {
        searchApartments.clickOnLocationField();
        searchApartments.enterLocation("Париж");

        LOGGER.debug("");
    }

    //@Test
    public void setDates() {
        enterLocationField();
        searchApartments.clickDatesTable();
        searchApartments.setArrivalDate(bookingSettings.getArrivalDate());
        searchApartments.setDepartureDate(bookingSettings.getDepartureDate());

        LOGGER.debug("");
    }

    //@Test
    public void setResettlement() {
        setDates();
        searchApartments.clickResettlementTable();
        searchApartments.clickPlusAdultsButton();
        searchApartments.clickPlusAdultsButton();
        searchApartments.clickPlusApartmentsButton();
        searchApartments.clickPlusApartmentsButton();
        searchApartments.submitResettlementTable();

        LOGGER.debug("");
    }

    //@Test
    public void filterApartments() {
        setResettlement();
        filtersApartments.setFiveStars();

        LOGGER.debug("");
    }

    //@Test
    public void sortApartments() {
        filterApartments();
        sortApartments.clickSortDropDown();
        sortApartments.clickDescendingApartments();

        LOGGER.debug("");
    }

    @Test
    public void checkFiveStarsApartment() {
        sortApartments();
        Assert.assertEquals("Must be 5 stars apartments",
                true,
                sortApartments.fifthStarExist());

        LOGGER.debug("");
    }
}
