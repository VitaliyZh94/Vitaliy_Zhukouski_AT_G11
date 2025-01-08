package selenium.tests.google;

import junit.utils.JUnitLogger;
import org.junit.Assert;
import org.junit.Test;
import selenium.pages.google.SearchPage;


public class GetTomorrowsTemperatureTest extends GoogleBaseTest {

    SearchPage searchPage = new SearchPage();

    @Test
    public void checkTomorrowsTemperature() {
        searchWeatherInMinsk();

        int minTemperature = -40;
        int maxTemperature = 50;
        String tomorrowsTemperature = searchPage.getTomorrowsTemperature();

        System.out.println("Tomorrows temperature = " + tomorrowsTemperature);

        int actualTemperature = Integer.parseInt(tomorrowsTemperature);
        boolean expectedResult = maxTemperature > actualTemperature && actualTemperature > minTemperature;

        Assert.assertEquals("Temperature must be > -40 and < 50, but it's " + actualTemperature,
                expectedResult,
                true);

        JUnitLogger.assertEqualsLogs(expectedResult, true);
    }

    private void searchWeatherInMinsk() {
        searchPage.enterWeatherIn("Минск");
        searchPage.clickFirstResult();
    }
}
