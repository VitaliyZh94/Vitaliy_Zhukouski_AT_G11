package selenium.tests.booking;

import org.junit.Assert;
import org.junit.Test;
import selenium.pages.booking.Apartment;
import selenium.pages.booking.SearchApartments;
import selenium.pages.booking.SortApartments;
import selenium.settings.BookingSettings;
import selenium.utils.JS;


public class HotelRateTest extends BookingBaseTest{

    SearchApartments searchApartments = new SearchApartments();
    BookingSettings bookingSettings = new BookingSettings();
    SortApartments sortApartments = new SortApartments();
    JS js = new JS(driver);
    Apartment apartment = new Apartment();

    @Test
    public void enterLocationField() {
        searchApartments.clickOnLocationField();
        searchApartments.enterLocation("Прага");
    }

    @Test
    public void setDates() {
        enterLocationField();
        searchApartments.clickDatesTable();
        searchApartments.setArrivalDate(bookingSettings.getArrivalDate());
        searchApartments.setDepartureDate(bookingSettings.getDepartureDate());
    }

    @Test
    public void setResettlement() {
        setDates();
        searchApartments.submitResettlementTable();
    }

    @Test
    public void sortApartments() {
        setResettlement();
        sortApartments.clickSortDropDown();
        sortApartments.clickDescendingApartments();
    }

    @Test
    public void openFirstApartment() {
        sortApartments();
        js.openURLInCurrentTab(sortApartments.getFirstDescendingApartment());
        sortApartments.clickFirstDescendingApartment();
    }

    @Test
    public void checkApartmentRateMoreThanNine() {
        openFirstApartment();
        Assert.assertEquals("Rate must be more than 9",
                true,
                apartment.getApartmentRate() > 9);
    }
}
