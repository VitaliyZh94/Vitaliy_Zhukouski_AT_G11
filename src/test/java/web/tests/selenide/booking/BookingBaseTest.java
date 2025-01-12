package web.tests.selenide.booking;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import web.driver.Driver;
import web.pages.selenide.booking.BookingBase;


public class BookingBaseTest {

    private static final Logger LOGGER = LogManager.getLogger(BookingBaseTest.class);
    protected static WebDriver driver;

    @Before
    public void openSite() {
        LOGGER.info("Start");

        driver = Driver.getDriver();
        driver.get(BookingBase.URL);
    }

    @After
    public void quitDriver() {
        LOGGER.info("Finished");
        driver.quit();
    }
}
