package web.pages.selenide.booking.main_page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import web.pages.selenium.booking.BookingBase;

import static com.codeborne.selenide.Selenide.$x;


public class SortApartmentsComponent extends BookingBase {

    private static final Logger LOGGER = LogManager.getLogger(SortApartmentsComponent.class);

    private final String SORT_DROP_DOWN = "//button[@data-testid='sorters-dropdown-trigger']";
    private final String DESCENDIN_SELECTOR = "//button[contains(@aria-label, 'по убыванию')]";
    private final String FIRST_DESCENDING_APARTMENT = "(//div[@data-testid='title'])[1]/..";
    private final String FIFTH_STAR_OF_FIRST_VARIANT = "//div[@data-testid='rating-squares']/span[5]";

    public String getFIRST_DESCENDING_APARTMENT() {
        return FIRST_DESCENDING_APARTMENT;
    }

    public void clickSortDropDown() {
        $x(SORT_DROP_DOWN).click();

        LOGGER.trace("Click to sort drop down {}", SORT_DROP_DOWN);
        checkAndCloseRegistrationPopUp();
    }

    public void clickDescendingApartments() {
        $x(DESCENDIN_SELECTOR).click();

        LOGGER.trace("Click to descending apartments {}", DESCENDIN_SELECTOR);
        checkAndCloseRegistrationPopUp();
    }

    public void clickFirstDescendingApartment() {
        $x(FIRST_DESCENDING_APARTMENT).click();

        LOGGER.trace("Click to first descending apartment {}", FIRST_DESCENDING_APARTMENT);
        checkAndCloseRegistrationPopUp();
    }

    public boolean fifthStarExist() {
        LOGGER.trace("Check fifth start of first variant is exist. {}", FIFTH_STAR_OF_FIRST_VARIANT);
        return $x(FIFTH_STAR_OF_FIRST_VARIANT).isDisplayed();
    }
}
