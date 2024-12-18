package homework.day14.selemium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class SearchTemperatureTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        driver.get("https://www.google.com/");

        driver.findElement(By.xpath("//textarea[@name='q']"))
                .sendKeys("погода минск");

        WebElement firstField = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("(//div[@role='option']//div[@role='presentation'])[1]")));

        firstField.click();

        LocalDate today = LocalDate.now();

        String tomorrow = today.plusDays(1).getDayOfWeek()
                .getDisplayName(TextStyle.FULL, new Locale("ru"));

        WebElement tomorrowsTemperature = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//*[contains(@aria-label, 'Celsius " + tomorrow + " 12:00')]")));

        String[] tomorrowsTemperatureValue = tomorrowsTemperature
                .getAttribute("aria-label")
                .split("°");

        System.out.println(tomorrowsTemperatureValue[0]);
    }

}
