package web.pages.selenide.booking;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import web.driver.Driver;

import static com.codeborne.selenide.Selenide.$x;


public class BookingBase {

    public static final String URL = "https://www.booking.com/";

    protected WebDriver driver = Driver.getDriver();
    private static final Logger LOGGER = LogManager.getLogger(BookingBase.class);
    protected boolean isRegistrationPopIpClosed = false;

    private static final String REGISTRATION_POPUP = "//button[@aria-label='Скрыть меню входа в аккаунт.']";


    protected void checkAndCloseRegistrationPopUp() {

        if (isRegistrationPopIpClosed) {
            return;
        } else {
            LOGGER.trace("Check registration pop-up {}", REGISTRATION_POPUP);

            if ($x(REGISTRATION_POPUP).exists()) {
                $x(REGISTRATION_POPUP).click();
                isRegistrationPopIpClosed = true;

                LOGGER.trace("Registration pop-up closed {}", REGISTRATION_POPUP);
            }
        }
    }
}
