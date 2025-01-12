package web.pages.selenium.booking.main_page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import web.pages.selenium.booking.BookingBase;


public class SortApartmentsComponent extends BookingBase {

    private static final Logger LOGGER = LogManager.getLogger(SortApartmentsComponent.class);

    private final String SORT_DROP_DOWN = "//button[@data-testid='sorters-dropdown-trigger']";
    private final String DESCENDIN_GSELECTOR = "//button[contains(@aria-label, 'по убыванию')]";
    private final String FIRST_DESCENDING_APARTMENT = "(//div[@data-testid='title'])[1]/..";
    private final String FIFTH_STAR_OF_FIRST_VARIANT = "//div[@data-testid='rating-squares']/span[5]";

    public String getFIRST_DESCENDING_APARTMENT() {
        return FIRST_DESCENDING_APARTMENT;
    }

    public void clickSortDropDown() {
        try {
            driver.findElement(By.xpath(SORT_DROP_DOWN)).click();
        } catch (StaleElementReferenceException e) {
            driver.findElement(By.xpath(SORT_DROP_DOWN)).click();
        }

        LOGGER.trace("Click to sort drop down {}", SORT_DROP_DOWN);
        checkAndCloseRegistrationPopUp();
    }

    public void clickDescendingApartments() {
        driver.findElement(By.xpath(DESCENDIN_GSELECTOR)).click();

        LOGGER.trace("Click to descending apartments {}", DESCENDIN_GSELECTOR);
        checkAndCloseRegistrationPopUp();
    }

    public void clickFirstDescendingApartment() {
        driver.findElement(By.xpath(FIRST_DESCENDING_APARTMENT)).click();

        LOGGER.trace("Click to first descending apartment {}", FIRST_DESCENDING_APARTMENT);
        checkAndCloseRegistrationPopUp();
    }

    public boolean fifthStarExist() {
        LOGGER.trace("Check fifth start of first variant is exist. {}", FIFTH_STAR_OF_FIRST_VARIANT);
        return driver.findElement(By.xpath(FIFTH_STAR_OF_FIRST_VARIANT)).isDisplayed();
    }
}
