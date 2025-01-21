package web.tests.selenium.google;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import web.driver.DriverSelenium;
import web.pages.selenium.google.GoogleBase;


public class GoogleBaseTest {

    protected static final Logger LOGGER = LogManager.getLogger(GoogleBaseTest.class);
    protected WebDriver driver;

    @Before
    public void openSite() {
        LOGGER.info("Start " + getClass().getSimpleName());

        driver = DriverSelenium.getDriver();
        driver.get(GoogleBase.URL);
    }

    @After
    public void quitDriver() {
        LOGGER.info("Finished " + getClass().getSimpleName());
        DriverSelenium.quitDriver();
    }
}
