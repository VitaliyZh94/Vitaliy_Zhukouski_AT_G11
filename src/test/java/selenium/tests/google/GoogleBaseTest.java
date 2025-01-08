package selenium.tests.google;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import selenium.driver.Driver;
import selenium.pages.google.GoogleBase;


public class GoogleBaseTest {

    protected static final Logger LOGGER = LogManager.getLogger(GoogleBaseTest.class);
    protected WebDriver driver;

    @Before
    public void openSite() {
        LOGGER.info("Start " + getClass().getSimpleName());

        driver = Driver.getDriver();
        driver.get(GoogleBase.URL);
    }

    @After
    public void quitDriver() {
        LOGGER.info("Finished " + getClass().getSimpleName());
        driver.quit();
    }
}
