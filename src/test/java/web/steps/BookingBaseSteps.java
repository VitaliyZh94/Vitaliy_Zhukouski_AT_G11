package web.steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import web.driver.Driver;
import web.pages.selenium.booking.BookingBase;

public class BookingBaseSteps {

    protected static final Logger LOGGER = LogManager.getLogger();

    WebDriver driver = Driver.getDriver();

    public void openSite() {
        driver.get(BookingBase.URL);

        LOGGER.debug("Given: I open a site - passed");
    }

    public void quit() {
        driver.quit();

        LOGGER.debug("Quit");
    }
}
