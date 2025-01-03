package selenium.tests.booking;

import org.junit.Test;
import selenium.pages.booking.HotelsInVilnius;


public class ScreenshotHotelTest extends BookingBaseTest {

    HotelsInVilnius hotelsInVilnius = new HotelsInVilnius();

    @Test
    public void openHotelOnNextPage() { //change to London
        hotelsInVilnius.openHotelsInVilniusPage();
        hotelsInVilnius.openNextHotelsPage();
        hotelsInVilnius.openHotelOnNextPage();
    }

    @Test
    public void changeHotelsCardVisual() {
        openHotelOnNextPage();
        hotelsInVilnius.scrollToHotelsCard();
        hotelsInVilnius.changeBackToGreen();
        hotelsInVilnius.changeTittleToRed();
    }

    @Test
    public void getScreenshot() {
        openHotelOnNextPage();
        changeHotelsCardVisual();
        hotelsInVilnius.screenShot();
    }
}
