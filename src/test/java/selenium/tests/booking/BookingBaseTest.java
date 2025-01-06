package selenium.tests.booking;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import selenium.driver.Driver;
import selenium.pages.booking.BookingBase;


public class BookingBaseTest {

    protected static final Logger LOGGER = LogManager.getLogger(BookingBase.class);
    protected static WebDriver driver;

    @Before
    public void openSite() {
        LOGGER.info("Start " + getClass().getSimpleName());

        driver = Driver.getDriver();
        driver.get(BookingBase.URL);
    }

    @After
    public void quitDriver() {
            LOGGER.info("Finished " + getClass().getSimpleName());
            driver.close();
    }
}
