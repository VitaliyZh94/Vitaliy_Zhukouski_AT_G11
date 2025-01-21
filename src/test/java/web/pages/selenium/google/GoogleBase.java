package web.pages.selenium.google;

import org.openqa.selenium.WebDriver;
import web.driver.DriverSelenium;


public class GoogleBase {

    public static final String URL = "https://www.google.com/";

    protected WebDriver driver = DriverSelenium.getDriver();
}
