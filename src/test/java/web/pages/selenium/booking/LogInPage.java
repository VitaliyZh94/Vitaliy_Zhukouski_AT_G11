package web.pages.selenium.booking;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class LogInPage extends BookingBase {

    private static final Logger LOGGER = LogManager.getLogger(LogInPage.class);

    private final String GOOGLE_BUTTON = "//a[contains(@class, 'social-button-google')]";

    public void logInUsingGoogle() {
        driver.findElement(By.xpath(GOOGLE_BUTTON)).click();

        LOGGER.trace("Log in using google {}", GOOGLE_BUTTON);
    }
}
