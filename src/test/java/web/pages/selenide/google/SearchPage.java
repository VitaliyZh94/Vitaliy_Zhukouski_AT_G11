package web.pages.selenide.google;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$x;

public class SearchPage extends GoogleBase {

    private static final Logger LOGGER = LogManager.getLogger(SearchPage.class);

    private static final String SEARCH_FIELD = "//textarea[@name='q']";
    private static final String FIRST_RESULT = "(//div[@role='option']//div[@role='presentation'])[1]";


    public void enterWeatherIn(String city) {
        $x(SEARCH_FIELD).setValue("погода " + city);

        LOGGER.trace("Enter: Weather in " + city);
    }

    public void clickFirstResult() {
        $x(FIRST_RESULT).should(appear).click();

        LOGGER.trace("Click first result");
    }

    public String getTomorrowsTemperature() {
        LocalDate today = LocalDate.now();

        String tomorrow = today.plusDays(1).getDayOfWeek()
                .getDisplayName(TextStyle.FULL, new Locale("ru"));


        WebElement tomorrowsTemperature = $x("//*[contains(@aria-label, 'Celsius " + tomorrow + " 12:00')]").should(appear);
        tomorrowsTemperature.click();

        String[] tomorrowsTemperatureValue = tomorrowsTemperature
                .getAttribute("aria-label")
                .split("°");

        return tomorrowsTemperatureValue[0];
    }
}
