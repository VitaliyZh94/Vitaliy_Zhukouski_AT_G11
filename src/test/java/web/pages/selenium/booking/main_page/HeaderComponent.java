package web.pages.selenium.booking.main_page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import web.pages.selenium.booking.BookingBase;

public class HeaderComponent extends BookingBase {

    private static final Logger LOGGER = LogManager.getLogger(HeaderComponent.class);

    private final String CURRENCY_ICON = "//button[@data-testid='header-currency-picker-trigger']";
    private final String CURRENCY_HINT = "(//script[@type='text/javascript']/following-sibling::div/div)[last()]";
    private final String LOG_IN_BUTTON = "//a[@data-testid ='header-sign-in-button']";

    Actions actions = new Actions(driver);

    public void hoverCurrencyIcon() {

        actions.moveToElement(driver.findElement(By.xpath(CURRENCY_ICON)))
                .build()
                .perform();

        LOGGER.trace("Hover to currency icon {}", CURRENCY_ICON);
        checkAndCloseRegistrationPopUp();
    }

    public void clickLogInButton() {
        driver.findElement(By.xpath(LOG_IN_BUTTON)).click();

        LOGGER.trace("Click log in button {}", LOG_IN_BUTTON);
        checkAndCloseRegistrationPopUp();
    }

    public String currencyHintsText() {
        checkAndCloseRegistrationPopUp();

        LOGGER.trace("Return text in currency hint {}", CURRENCY_HINT);
        return driver.findElement(By.xpath(CURRENCY_HINT)).getText();
    }
}
