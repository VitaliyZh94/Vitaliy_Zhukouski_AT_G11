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
    }

    //@Test
    public void setDates() {
        enterLocationField();
        searchApartments.clickDatesTable();
        searchApartments.setArrivalDate(bookingSettings.getArrivalDate());
        searchApartments.setDepartureDate(bookingSettings.getDepartureDate());
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
    }

    //@Test
    public void filterApartments() {
        setResettlement();
        filtersApartments.setFiveStars();
    }

    //@Test
    public void sortApartments() {
        filterApartments();
        sortApartments.clickSortDropDown();
        sortApartments.clickDescendingApartments();
    }

    @Test
    public void checkFiveStarsApartment() {
        sortApartments();
        Assert.assertEquals("Must be 5 stars apartments",
                true,
                sortApartments.fifthStarExist());
    }
}
