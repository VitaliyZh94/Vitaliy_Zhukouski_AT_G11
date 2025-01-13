package web.tests.selenide.google;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import web.driver.Driver;
import web.pages.selenide.google.GoogleBase;

import static com.codeborne.selenide.Selenide.open;


public class GoogleBaseTest {

    protected static final Logger LOGGER = LogManager.getLogger(GoogleBaseTest.class);
    protected WebDriver driver;

    @Before
    public void openSite() {
        LOGGER.info("Start");

        open(GoogleBase.URL);
    }

    @After
    public void quitDriver() {
        LOGGER.info("Finished");
    }
}
