package selenium.pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;

public class SearchApartments extends BookingBase {

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

        driver.findElement(By.xpath(LOCATION_FIELD)).click();

        checkAndCloseRegistrationPopUp();
    }

    public void enterLocation(String location) {
        LOGGER.trace("Enter location to field {}", LOCATION_FIELD);

        WebElement field = driver.findElement(By.xpath(LOCATION_FIELD));
        field.sendKeys(location);

        checkAndCloseRegistrationPopUp();
    }

    public void clickDatesTable() {
        LOGGER.trace("Clock on dates table {}", DATES_TABLE);

        driver.findElement(By.xpath(DATES_TABLE)).click();

        checkAndCloseRegistrationPopUp();
    }

    public void setArrivalDate(LocalDate date) {
        LOGGER.trace("Set arrival date {}", arrivalDateButton);

        arrivalDate = date;
//        driver.findElement(By.xpath(arrivalDateButton)).click();
        driver.findElement(By.xpath("//span[@data-date='2025-01-02']")).click();//todo

        checkAndCloseRegistrationPopUp();
    }

    public void setDepartureDate(LocalDate date) {
        LOGGER.trace("Set arrival date {}", departureDateButton);

        departurelDate = date;
//        driver.findElement(By.xpath(departureDateButton)).click();
        driver.findElement(By.xpath("//span[@data-date='2025-01-04']")).click();//todo

        checkAndCloseRegistrationPopUp();
    }

    public void clickResettlementTable() {
        LOGGER.trace("CLick on resettlement table {}", RESETTLEMENT_TABLE);

        driver.findElement(By.xpath(RESETTLEMENT_TABLE)).click();

        checkAndCloseRegistrationPopUp();
    }

    public void clickPlusAdultsButton() {
        driver.findElement(By.xpath(PLUS_ADULTS_BUTTON)).click();

        LOGGER.trace("Click to plus adults button {}", PLUS_ADULTS_BUTTON);
        checkAndCloseRegistrationPopUp();
    }

    public void clickPlusApartmentsButton() {
        driver.findElement(By.xpath(PLUS_APARTMENTS_BUTTON)).click();

        LOGGER.trace("Click to plus apartment button {}", PLUS_APARTMENTS_BUTTON);
        checkAndCloseRegistrationPopUp();
    }

    public void submitResettlementTable() {
        driver.findElement(By.xpath(SUBMIT_BUTTON)).click();

        LOGGER.trace("Click on button to submit resettlement table {}", SUBMIT_BUTTON);
        checkAndCloseRegistrationPopUp();
    }
}