package web.tests.selenium.booking;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import web.pages.selenium.booking.main_page.HotelsInVilniusComponent;

import java.io.File;


public class ScreenshotHotelTest extends BookingBaseTest {

    private static final Logger LOGGER = LogManager.getLogger(ScreenshotHotelTest.class);

    HotelsInVilniusComponent hotelsInVilnius = new HotelsInVilniusComponent();

    @Test
    public void checkScreenshotExist() {
        hotelsInVilnius.openHotelsInVilniusPage();
        hotelsInVilnius.openNextHotelsPage();
        hotelsInVilnius.openHotelOnNextPage();
        hotelsInVilnius.scrollToHotelsCard();
        hotelsInVilnius.changeBackToGreen();
        hotelsInVilnius.changeTittleToRed();
        hotelsInVilnius.screenShot();

        File directory = new File("src/test/resources/screenshots");

        if (!directory.exists() || !directory.isDirectory()) {
            Assert.fail("There is no directory " + directory);
        }

        File[] files = directory.listFiles((dir, name) -> name.endsWith(".png"));
        boolean actualResult = files != null && files.length > 0;

        Assert.assertEquals("There is no screenshot file in folder " + directory, true, actualResult);

        LOGGER.debug("Assert passed: Expected = {}. Actual = {}", true, actualResult);

        deleteScreenshots(directory, files);
    }

    private static void deleteScreenshots(File directory, File[] files) {
        if (directory.exists()) {
            for (File file : files) {
                file.delete();
            }
        }
    }
}
