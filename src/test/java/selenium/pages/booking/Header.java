package selenium.pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Header extends BookingBase {

    private final String CURRENCY_ICON = "//button[@data-testid='header-currency-picker-trigger']";
    private final String CURRENCY_HINT = "(//script[@type='text/javascript']/following-sibling::div/div)[last()]";
    private final String LOG_IN_BUTTON = "//a[@data-testid ='header-sign-in-button']";

    Actions actions = new Actions(driver);

    public void hoverCurrencyIcon() {
        actions.moveToElement(driver.findElement(By.xpath(CURRENCY_ICON)))
                .build()
                .perform();

        checkAndCloseRegistrationPopUp();
    }

    public void clickLogInButton() {
        driver.findElement(By.xpath(LOG_IN_BUTTON)).click();
    }

    public String currencyHintsText() {
        return driver.findElement(By.xpath(CURRENCY_HINT)).getText();
    }
}
