package selenium.tests.google;

import org.junit.Test;
import selenium.pages.google.SearchPage;


public class GetTomorrowsTemperatureTest extends GoogleBaseTest {

    SearchPage searchPage = new SearchPage();

    @Test
    public void searchWeatherInMinsk() {
        searchPage.enterWeatherIn("Минск");
        searchPage.clickFirstResult();
    }

    @Test
    public void printTomorrowsTemperature() {
        searchWeatherInMinsk();
        System.out.println(searchPage.getTomorrowsTemperature());
    }

}
