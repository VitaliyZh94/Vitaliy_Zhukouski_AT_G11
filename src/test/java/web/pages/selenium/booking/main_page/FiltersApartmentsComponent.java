package web.pages.selenium.booking.main_page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import web.pages.selenium.booking.BookingBase;

public class FiltersApartmentsComponent extends BookingBase {

    private static final Logger LOGGER = LogManager.getLogger(FiltersApartmentsComponent.class);

    private final String FIVE_STARS_CHECH_BOX = "(//div[@data-filters-item='class:class=5']/input[contains(@aria-label, '5 звезд:')])[1]";

    public void setFiveStars() {

        try {
            driver.findElement(By.xpath(FIVE_STARS_CHECH_BOX)).click();
        } catch (StaleElementReferenceException e) {
            driver.findElement(By.xpath(FIVE_STARS_CHECH_BOX)).click();
        }

        LOGGER.trace("Set check box \"five stars\" to hotel. {}", FIVE_STARS_CHECH_BOX);
        checkAndCloseRegistrationPopUp();
    }
}
