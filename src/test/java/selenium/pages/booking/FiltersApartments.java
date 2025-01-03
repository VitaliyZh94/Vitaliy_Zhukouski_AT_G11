package selenium.pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;

public class FiltersApartments extends BookingBase {

    private final String FIVE_STARS_CHECH_BOX = "(//div[@data-filters-item='class:class=5']/input[contains(@aria-label, '5 звезд:')])[1]";

    public void setFiveStars() {
        try {
            driver.findElement(By.xpath(FIVE_STARS_CHECH_BOX)).click();
        } catch (StaleElementReferenceException e) {
            driver.findElement(By.xpath(FIVE_STARS_CHECH_BOX)).click();
        }

        checkAndCloseRegistrationPopUp();
    }
}
