package web.pages.selenide.booking.main_page;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import web.pages.selenium.booking.BookingBase;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.$x;

public class HotelsInVilniusComponent extends BookingBase {

    private static final Logger LOGGER = LogManager.getLogger(HotelsInVilniusComponent.class);

    public static final String HOTELS_IN_VILNIUS_BUTTON = "//a[@title='Отели в Вильнюсе, Литва']";
    public static final String NEXT_HOTELS_PAGE_BUTTON = "//h2[contains(text(), 'и другие виды жилья')]//following-sibling::a";
    public static final String HOTEL_ON_NEXT_PAGE = "//div[@data-testid='property-card'][10]";
    public static final String TITTLE_OF_HOTEL_ON_NEXT_PAGE = "//div[@data-testid='property-card'][10]//div[@data-testid='title']";

    JavascriptExecutor js = (JavascriptExecutor) driver;
    TakesScreenshot screenshot = (TakesScreenshot) driver;

    public void openHotelsInVilniusPage() {
        $x(HOTELS_IN_VILNIUS_BUTTON).click();

        LOGGER.trace("Open all hotels in Vilnius page. {}", HOTELS_IN_VILNIUS_BUTTON);
        checkAndCloseRegistrationPopUp();
    }

    public void openNextHotelsPage() {
        $x(NEXT_HOTELS_PAGE_BUTTON).click();

        LOGGER.trace("Open hotels on next page. {}", NEXT_HOTELS_PAGE_BUTTON);
        checkAndCloseRegistrationPopUp();
    }

    public void openHotelOnNextPage() {
        $x(HOTEL_ON_NEXT_PAGE).click();

        LOGGER.trace("Open hotel on next page. {}", HOTEL_ON_NEXT_PAGE);
        checkAndCloseRegistrationPopUp();
    }

    public void scrollToHotelsCard() {
        $x(HOTEL_ON_NEXT_PAGE).scrollTo();

        LOGGER.trace("Scroll to hotels card. {}", HOTEL_ON_NEXT_PAGE);
        checkAndCloseRegistrationPopUp();
    }

    public void changeBackToGreen() {
        WebElement hotelOnNExtPage = $x(HOTEL_ON_NEXT_PAGE);
        js.executeScript("arguments[0].style.backgroundColor = 'green';", hotelOnNExtPage);

        LOGGER.trace("Make hotels card backend green. {}", HOTEL_ON_NEXT_PAGE);
        checkAndCloseRegistrationPopUp();
    }

    public void changeTittleToRed() {
        WebElement tittle = $x(TITTLE_OF_HOTEL_ON_NEXT_PAGE);
        js.executeScript("arguments[0].style.color = 'red'", tittle);

        LOGGER.trace("Make tittle of hotels card red");
        checkAndCloseRegistrationPopUp();
    }

    public void screenShot() {
        String fileName = "src/test/resources/screenshots/hotel10.png";

        File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotAs, new File(fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        LOGGER.trace("Make screenshot {}", fileName);
        checkAndCloseRegistrationPopUp();
    }
}
