package selenium.pages.booking;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;

public class HotelsInVilnius extends BookingBase {

    public static final String HOTELS_IN_VILNIUS_BUTTON = "//a[@title='Отели в Вильнюсе, Литва']";
    public static final String NEXT_HOTELS_PAGE_BUTTON = "//h2[contains(text(), 'и другие виды жилья')]//following-sibling::a";
    public static final String HOTEL_ON_NEXT_PAGE = "//div[@data-testid='property-card'][10]";
    public static final String TITTLE_OF_HOTEL_ON_NEXT_PAGE = "//div[@data-testid='property-card'][10]//div[@data-testid='title']";

    JavascriptExecutor js = (JavascriptExecutor) driver;
    Actions make = new Actions(driver);
    TakesScreenshot screenshot = (TakesScreenshot) driver;

    public void openHotelsInVilniusPage() {
        driver.findElement(By.xpath(HOTELS_IN_VILNIUS_BUTTON)).click();
        checkAndCloseRegistrationPopUp();
    }

    public void openNextHotelsPage() {
        driver.findElement(By.xpath(NEXT_HOTELS_PAGE_BUTTON)).click();
        checkAndCloseRegistrationPopUp();
    }

    public void openHotelOnNextPage() {
        driver.findElement(By.xpath(HOTEL_ON_NEXT_PAGE)).click();
        checkAndCloseRegistrationPopUp();
    }

    public void scrollToHotelsCard() {
        make.scrollToElement(getHotelOnNextPage()).build().perform();
        checkAndCloseRegistrationPopUp();
    }

    public void changeBackToGreen() {
        js.executeScript("arguments[0].style.backgroundColor = 'green';", getHotelOnNextPage());
        checkAndCloseRegistrationPopUp();
    }

    public void changeTittleToRed() {
        WebElement tittle = driver.findElement(By.xpath(TITTLE_OF_HOTEL_ON_NEXT_PAGE));
        js.executeScript("arguments[0].style.color = 'red'", tittle);
        checkAndCloseRegistrationPopUp();
    }

    public void screenShot() {
        File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotAs, new File("hotel10"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        checkAndCloseRegistrationPopUp();
    }

    private WebElement getHotelOnNextPage() {
        return driver.findElement(By.xpath(HOTEL_ON_NEXT_PAGE));
    }
}
