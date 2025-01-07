package selenium.tests.booking;

import junit.utils.JUnitLogger;
import org.junit.Assert;
import org.junit.Test;
import selenium.pages.booking.Apartment;
import selenium.pages.booking.SearchApartments;
import selenium.pages.booking.SortApartments;
import selenium.settings.BookingSettings;
import selenium.utils.JS;


public class CheckApartmentRateTest extends BookingBaseTest{
    SearchApartments searchApartments = new SearchApartments();

    BookingSettings bookingSettings = new BookingSettings();
    SortApartments sortApartments = new SortApartments();
    Apartment apartment = new Apartment();

    @Test
    public void checkApartmentRateMoreThanNine() {
        openFirstSortedApartment();
        Assert.assertEquals("Rate must be more than 9. Rate = " + apartment.getApartmentRate(),
                true,
                apartment.getApartmentRate() > 9);

        JUnitLogger.assertEqualsLogs(true, apartment.getApartmentRate() > 9);
    }

    private void enterLocationField() {
        searchApartments.clickOnLocationField();
        searchApartments.enterLocation("Прага");
    }

    private void setDates() {
        enterLocationField();
        searchApartments.clickDatesTable();
        searchApartments.setArrivalDate(bookingSettings.getArrivalDate());
        searchApartments.setDepartureDate(bookingSettings.getDepartureDate());
    }

    private void setResettlement() {
        setDates();
        searchApartments.submitResettlementTable();
    }

    private void sortApartments() {
        setResettlement();
        sortApartments.clickSortDropDown();
        sortApartments.clickDescendingApartments();
    }

    private void openFirstSortedApartment() {
        sortApartments();
        JS js = new JS(driver);
        js.openURLInCurrentTab(sortApartments.getFIRST_DESCENDING_APARTMENT());
        sortApartments.clickFirstDescendingApartment();
    }
}
