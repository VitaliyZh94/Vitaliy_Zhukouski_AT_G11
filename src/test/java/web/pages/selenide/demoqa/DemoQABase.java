package web.pages.selenide.demoqa;

import org.openqa.selenium.WebDriver;
import web.driver.DriverSelenium;


public class DemoQABase {

    public static final String URL = "https://demoqa.com/select-menu";
    protected WebDriver driver = DriverSelenium.getDriver();
}
