package selenium.tests.google;

import selenium.driver.Driver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import selenium.pages.google.GoogleBase;


public class GoogleBaseTest {

    WebDriver driver = Driver.getDriver();

    @Before
    public void openSite() {
        driver.get(GoogleBase.URL);
    }

    @After
    public void quitDriver() {
        driver.quit();
    }
}
