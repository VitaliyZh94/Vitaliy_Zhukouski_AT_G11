package selenium.tests.booking;

import junit.utils.JUnitLogger;
import org.junit.Assert;
import org.junit.Test;
import selenium.pages.booking.HotelsInVilnius;

import java.io.File;


public class ScreenshotHotelTest extends BookingBaseTest {

    HotelsInVilnius hotelsInVilnius = new HotelsInVilnius();

    @Test
    public void checkScreenshotExist() {
        getScreenshot();

        File directory = new File("src/test/resources/screenshots");

        if (!directory.exists() || !directory.isDirectory()) {
            Assert.fail("There is no directory " + directory);
        }

        File[] files = directory.listFiles((dir, name) -> name.endsWith(".png"));
        boolean actualResult = files != null && files.length > 0;

        Assert.assertEquals("There is no screenshot file in folder " + directory, true, actualResult);

        if (directory.exists()) {
            for (File file : files) {
                file.delete();
            }
        }

        JUnitLogger.assertEqualsLogs(true, actualResult);
    }

    private void openHotelOnNextPage() { //change to London
        hotelsInVilnius.openHotelsInVilniusPage();
        hotelsInVilnius.openNextHotelsPage();
        hotelsInVilnius.openHotelOnNextPage();
    }

    private void changeHotelsCardVisual() {
        openHotelOnNextPage();
        hotelsInVilnius.scrollToHotelsCard();
        hotelsInVilnius.changeBackToGreen();
        hotelsInVilnius.changeTittleToRed();
    }

    private void getScreenshot() {
        changeHotelsCardVisual();
        hotelsInVilnius.screenShot();
    }
}
