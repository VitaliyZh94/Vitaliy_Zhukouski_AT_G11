package selenium.pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class SearchPage extends GoogleBase {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

    public static final String SEARCH_FIELD = "//textarea[@name='q']";
    public static final String FIRST_RESULT = "(//div[@role='option']//div[@role='presentation'])[1]";

    public void enterWeatherIn(String city) {
        driver.findElement(By.xpath(SEARCH_FIELD))
                .sendKeys("погода " + city);
    }

    public void clickFirstResult() {
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath(FIRST_RESULT)))
                .click();
    }

    public String getTomorrowsTemperature() {
        LocalDate today = LocalDate.now();

        String tomorrow = today.plusDays(1).getDayOfWeek()
                .getDisplayName(TextStyle.FULL, new Locale("ru"));

        WebElement tomorrowsTemperature = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//*[contains(@aria-label, 'Celsius " + tomorrow + " 12:00')]")));

        String[] tomorrowsTemperatureValue = tomorrowsTemperature
                .getAttribute("aria-label")
                .split("°");

        return tomorrowsTemperatureValue[0];
    }


}
