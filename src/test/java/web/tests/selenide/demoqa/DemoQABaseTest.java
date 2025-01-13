package web.tests.selenide.demoqa;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import web.driver.Driver;
import web.pages.selenide.demoqa.DemoQABase;

import static com.codeborne.selenide.Selenide.open;


public class DemoQABaseTest {

    protected static final Logger LOGGER = LogManager.getLogger(DemoQABaseTest.class);
    protected WebDriver driver;

    @Before
    public void openSite() {
        LOGGER.info("Start");

        open(DemoQABase.URL);
    }

    @After
    public void quitDriver() {
        LOGGER.info("Finished");
    }
}
