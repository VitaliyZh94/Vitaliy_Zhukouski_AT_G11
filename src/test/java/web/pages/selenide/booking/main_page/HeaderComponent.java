package web.pages.selenide.booking.main_page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import web.pages.selenium.booking.BookingBase;

import static com.codeborne.selenide.Selenide.$x;

public class HeaderComponent extends BookingBase {

    private static final Logger LOGGER = LogManager.getLogger(HeaderComponent.class);

    private final String CURRENCY_ICON = "//button[@data-testid='header-currency-picker-trigger']";
    private final String CURRENCY_HINT = "(//script[@type='text/javascript']/following-sibling::div/div)[last()]";
    private final String LOG_IN_BUTTON = "//a[@data-testid ='header-sign-in-button']";

    public void hoverCurrencyIcon() {
        $x(CURRENCY_ICON).hover();

        LOGGER.trace("Hover to currency icon {}", CURRENCY_ICON);
        checkAndCloseRegistrationPopUp();
    }

    public void clickLogInButton() {
        $x(LOG_IN_BUTTON).click();

        LOGGER.trace("Click log in button {}", LOG_IN_BUTTON);
        checkAndCloseRegistrationPopUp();
    }

    public String currencyHintsText() {
        checkAndCloseRegistrationPopUp();

        LOGGER.trace("Return text in currency hint {}", CURRENCY_HINT);
        return $x(CURRENCY_HINT).getText();
    }
}
