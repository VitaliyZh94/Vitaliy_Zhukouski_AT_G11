package selenium.tests.demo_qa;

import selenium.driver.Driver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import selenium.pages.demoQA.DemoQABase;


public class DemoQABaseTest {

    WebDriver driver = Driver.getDriver();

    @Before
    public void openSite() {
        driver.get(DemoQABase.URL);
    }

    @After
    public void quitDriver() {
        driver.quit();
    }
}
