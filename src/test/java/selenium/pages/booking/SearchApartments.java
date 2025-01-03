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
        driver.findElement(By.xpath(LOCATION_FIELD)).click();
        checkAndCloseRegistrationPopUp();
    }

    public void enterLocation(String location) {
        WebElement field = driver.findElement(By.xpath(LOCATION_FIELD));
        field.sendKeys(location);
        checkAndCloseRegistrationPopUp();
    }

    public void clickDatesTable() {
        driver.findElement(By.xpath(DATES_TABLE)).click();
        checkAndCloseRegistrationPopUp();
    }

    public void setArrivalDate(LocalDate date) {
        arrivalDate = date;
//        driver.findElement(By.xpath(arrivalDateButton)).click();
        driver.findElement(By.xpath("//span[@data-date='2025-01-02']")).click();//todo
        checkAndCloseRegistrationPopUp();
    }

    public void setDepartureDate(LocalDate date) {
        departurelDate = date;
//        driver.findElement(By.xpath(departureDateButton)).click();
        driver.findElement(By.xpath("//span[@data-date='2025-01-04']")).click();//todo

        checkAndCloseRegistrationPopUp();
    }

    public void clickResettlementTable() {
        driver.findElement(By.xpath(RESETTLEMENT_TABLE)).click();
        checkAndCloseRegistrationPopUp();
    }

    public void clickPlusAdultsButton() {
        driver.findElement(By.xpath(PLUS_ADULTS_BUTTON)).click();
        checkAndCloseRegistrationPopUp();
    }

    public void clickPlusApartmentsButton() {
        driver.findElement(By.xpath(PLUS_APARTMENTS_BUTTON)).click();
        checkAndCloseRegistrationPopUp();
    }

    public void submitResettlementTable() {
        driver.findElement(By.xpath(SUBMIT_BUTTON)).click();
        checkAndCloseRegistrationPopUp();
    }
}