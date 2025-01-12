package web.pages.selenide.booking.main_page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import web.pages.selenium.booking.BookingBase;

import java.time.LocalDate;

import static com.codeborne.selenide.Selenide.$x;

public class SearchApartmentsComponent extends BookingBase {

    private static final Logger LOGGER = LogManager.getLogger(SearchApartmentsComponent.class);

    private final String LOCATION_FIELD = "//input[@role='combobox']";
    private final String DATES_TABLE = "//button[@data-testid='date-display-field-end']";
    private final String RESETTLEMENT_TABLE = "//button[@data-testid='occupancy-config']";
    private final String PLUS_ADULTS_BUTTON = "(//button[@tabindex='-1'])[2]";
    private final String PLUS_APARTMENTS_BUTTON = "(//button[@tabindex='-1'])[6]";
    private final String SUBMIT_BUTTON = "//button[@type='submit']";

    private LocalDate arrivalDate;
    private LocalDate departurelDate;

    private String arrivalDateButton = "//span[@data-date=" + arrivalDate + "]";
    private String departureDateButton = "//span[@data-date=" + departurelDate + "]";


    public void clickOnLocationField() {
        LOGGER.trace("Click on location field {}", LOCATION_FIELD);

        $x(LOCATION_FIELD).click();

        checkAndCloseRegistrationPopUp();
    }

    public void enterLocation(String location) {
        LOGGER.trace("Enter location to field {}", LOCATION_FIELD);

        $x(LOCATION_FIELD).setValue(location);

        checkAndCloseRegistrationPopUp();
    }

    public void clickDatesTable() {
        LOGGER.trace("Clock on dates table {}", DATES_TABLE);

        $x(DATES_TABLE).click();

        checkAndCloseRegistrationPopUp();
    }

    public void setArrivalDate(LocalDate date) {
        LOGGER.trace("Set arrival date {}", arrivalDateButton);

        arrivalDate = date;
        $x("//span[@data-date='2025-01-02']").click();//todo

        checkAndCloseRegistrationPopUp();
    }

    public void setDepartureDate(LocalDate date) {
        LOGGER.trace("Set arrival date {}", departureDateButton);

        departurelDate = date;
        $x("//span[@data-date='2025-01-15']").click();//todo

        checkAndCloseRegistrationPopUp();
    }

    public void clickResettlementTable() {
        LOGGER.trace("CLick on resettlement table {}", RESETTLEMENT_TABLE);

        $x(RESETTLEMENT_TABLE).click();

        checkAndCloseRegistrationPopUp();
    }

    public void clickPlusAdultsButton(int amount) {
        for (int i = 0; i < amount; i++) {
            $x(PLUS_ADULTS_BUTTON).click();
        }

        LOGGER.trace("Click to plus adults button {}", PLUS_ADULTS_BUTTON);
        checkAndCloseRegistrationPopUp();
    }

    public void clickPlusApartmentsButton(int amount) {
        for (int i = 0; i < amount; i++) {
            $x(PLUS_APARTMENTS_BUTTON).click();
        }

        LOGGER.trace("Click to plus apartment button {}", PLUS_APARTMENTS_BUTTON);
        checkAndCloseRegistrationPopUp();
    }

    public void submitResettlementTable() {
        $x(SUBMIT_BUTTON).click();

        LOGGER.trace("Click on button to submit resettlement table {}", SUBMIT_BUTTON);
        checkAndCloseRegistrationPopUp();
    }
}