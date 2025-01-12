package web.tests.selenide.google;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import web.pages.selenide.google.SearchPage;


public class GetTomorrowsTemperatureTest extends GoogleBaseTest {

    private static final Logger LOGGER = LogManager.getLogger(GetTomorrowsTemperatureTest.class);

    SearchPage searchPage = new SearchPage();

    @Test
    public void checkTomorrowsTemperature() {
        searchPage.enterWeatherIn("Минск");
        searchPage.clickFirstResult();

        int minTemperature = -40;
        int maxTemperature = 50;
        String tomorrowsTemperature = searchPage.getTomorrowsTemperature();

        LOGGER.debug("Tomorrows temperature = " + tomorrowsTemperature);

        int actualTemperature = Integer.parseInt(tomorrowsTemperature);
        boolean expectedResult = maxTemperature > actualTemperature && actualTemperature > minTemperature;

        Assert.assertEquals("Temperature must be > -40 and < 50, but it's " + actualTemperature,
                expectedResult,
                true);

        LOGGER.debug("Assert passed: Expected = {}. Actual = {}", expectedResult , true);
    }
}
