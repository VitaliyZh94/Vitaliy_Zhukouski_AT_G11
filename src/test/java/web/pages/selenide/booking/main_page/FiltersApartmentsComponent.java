package web.pages.selenide.booking.main_page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import web.pages.selenium.booking.BookingBase;

import static com.codeborne.selenide.Selenide.$x;

public class FiltersApartmentsComponent extends BookingBase {

    private static final Logger LOGGER = LogManager.getLogger(FiltersApartmentsComponent.class);

    private final String FIVE_STARS_CHECH_BOX = "(//div[@data-filters-item='class:class=5']/input[contains(@aria-label, '5 звезд:')])[1]";

    public void setFiveStars() {
        $x(FIVE_STARS_CHECH_BOX).click();

        LOGGER.trace("Set check box \"five stars\" to hotel. {}", FIVE_STARS_CHECH_BOX);
        checkAndCloseRegistrationPopUp();
    }
}
