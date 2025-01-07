package selenium.tests.booking;

import junit.utils.JUnitLogger;
import org.junit.Assert;
import org.junit.Test;
import selenium.pages.booking.FiltersApartments;
import selenium.pages.booking.SearchApartments;
import selenium.pages.booking.SortApartments;
import selenium.settings.BookingSettings;


public class FifthStarIconExistTest extends BookingBaseTest {
    SearchApartments searchApartments = new SearchApartments();

    FiltersApartments filtersApartments = new FiltersApartments();
    SortApartments sortApartments = new SortApartments();
    BookingSettings bookingSettings = new BookingSettings();

    @Test
    public void checkFifthStarIconExist() {
        openFoundedApartment();
        Assert.assertEquals("Apartment don't exist icon \"Five stars\"",
                true,
                sortApartments.fifthStarExist());

        JUnitLogger.assertEqualsLogs(true, sortApartments.fifthStarExist());
    }

    private void enterLocationField() {
        searchApartments.clickOnLocationField();
        searchApartments.enterLocation("Париж");
    }


    private void setDates() {
        enterLocationField();
        searchApartments.clickDatesTable();
        searchApartments.setArrivalDate(bookingSettings.getArrivalDate());
        searchApartments.setDepartureDate(bookingSettings.getDepartureDate());
    }


    private void setResettlement() {
        setDates();
        searchApartments.clickResettlementTable();
        searchApartments.clickPlusAdultsButton();
        searchApartments.clickPlusAdultsButton();
        searchApartments.clickPlusApartmentsButton();
        searchApartments.clickPlusApartmentsButton();
        searchApartments.submitResettlementTable();
    }


    private void filterApartments() {
        setResettlement();
        filtersApartments.setFiveStars();
    }


    private void openFoundedApartment() {
        filterApartments();
        sortApartments.clickSortDropDown();
        sortApartments.clickDescendingApartments();
    }
}
