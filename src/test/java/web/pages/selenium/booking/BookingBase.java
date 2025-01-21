package web.pages.selenium.booking;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import web.driver.DriverSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BookingBase {

    public static final String URL = "https://www.booking.com/";

    protected WebDriver driver = DriverSelenium.getDriver();
    private static final Logger LOGGER = LogManager.getLogger(BookingBase.class);
    protected boolean isRegistrationPopIpClosed = false;

    private static final String REGISTRATION_POPUP = "//button[@aria-label='Скрыть меню входа в аккаунт.']";


    protected void checkAndCloseRegistrationPopUp() {

        if (isRegistrationPopIpClosed) return;

        LOGGER.trace("Check registration pop-up {}", REGISTRATION_POPUP);

        try {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable((By.xpath(REGISTRATION_POPUP))));

            element.click();

            LOGGER.trace("Registration pop-up closed {}", REGISTRATION_POPUP);

            isRegistrationPopIpClosed = true;

        } catch (TimeoutException e) {
            LOGGER.error(e.getMessage());
        }
    }
}
