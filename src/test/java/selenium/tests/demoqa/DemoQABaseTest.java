package selenium.tests.demoqa;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import selenium.driver.Driver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import selenium.pages.demoqa.DemoQABase;


public class DemoQABaseTest {

    protected static final Logger LOGGER = LogManager.getLogger(DemoQABase.class);
    protected WebDriver driver = Driver.getDriver();

    @Before
    public void openSite() {
        LOGGER.info("Start " + getClass().getSimpleName());
        driver.get(DemoQABase.URL);
    }

    @After
    public void quitDriver() {
        driver.quit();
        LOGGER.info("Finished " + getClass().getSimpleName());
    }
}
