package selenium.pages.demoqa;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import selenium.driver.Driver;


public class DemoQABase {

    public static final String URL = "https://demoqa.com/select-menu";
    protected static final Logger LOGGER = LogManager.getLogger(DemoQABase.class);
    protected WebDriver driver = Driver.getDriver();
}
