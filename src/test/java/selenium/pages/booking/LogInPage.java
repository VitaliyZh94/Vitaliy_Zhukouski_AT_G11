package selenium.pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.settings.BookingSettings;

public class LogInPage extends BookingBase{

    private final String EMAIL_FIELD = "//input[@type='email']";
    private final String SUBMIT_BUTTON = "//button[@type='submit']";

    public void enterEmail() {
        WebElement emailField = driver.findElement(By.xpath(EMAIL_FIELD));
        emailField.click();
        emailField.sendKeys(BookingSettings.email);
    }
}
