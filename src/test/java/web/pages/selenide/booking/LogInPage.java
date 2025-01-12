package web.pages.selenide.booking;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.codeborne.selenide.Selenide.$x;

public class LogInPage extends BookingBase {

    private static final Logger LOGGER = LogManager.getLogger(LogInPage.class);

    private final String GOOGLE_BUTTON = "//a[contains(@class, 'social-button-google')]";

    public void logInUsingGoogle() {
        $x(GOOGLE_BUTTON).click();

        LOGGER.trace("Log in using google {}", GOOGLE_BUTTON);
    }
}
