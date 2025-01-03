package selenium.pages.booking;

import selenium.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BookingBase {

    public static final String URL = "https://www.booking.com/";
    protected WebDriver driver = Driver.getDriver();

    protected void checkAndCloseRegistrationPopUp() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//button[@aria-label='Скрыть меню входа в аккаунт.']"))));

            element.click();
        } catch (TimeoutException e) {
            System.out.println("Popup closed or not found");
        }
    }
}
