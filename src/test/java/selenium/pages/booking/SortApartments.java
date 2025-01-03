package selenium.pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;


public class SortApartments extends BookingBase {

    private final String sortDropDown = "//button[@data-testid='sorters-dropdown-trigger']";
    private final String descendingSelector = "//button[contains(@aria-label, 'по убыванию')]";
    private final String firstDescendingApartment = "(//div[@data-testid='title'])[1]/..";
    private final String fifthStarOfFirstVariant = "//div[@data-testid='rating-squares']/span[5]";

    public String getFirstDescendingApartment() {
        return firstDescendingApartment;
    }

    public void clickSortDropDown() {
        try {
            driver.findElement(By.xpath(sortDropDown)).click();
        } catch (StaleElementReferenceException e) {
            driver.findElement(By.xpath(sortDropDown)).click();
        }

        checkAndCloseRegistrationPopUp();
    }

    public void clickDescendingApartments() {
        driver.findElement(By.xpath(descendingSelector)).click();
        checkAndCloseRegistrationPopUp();
    }

    public void clickFirstDescendingApartment() {
        driver.findElement(By.xpath(firstDescendingApartment)).click();
    }

    public boolean fifthStarExist() {
        return driver.findElement(By.xpath(fifthStarOfFirstVariant)).isDisplayed();
    }
}
