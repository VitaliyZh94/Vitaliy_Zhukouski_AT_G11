package web.driver;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Collections;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {

            ChromeOptions caps = new ChromeOptions();
            caps.addArguments("start-maximized");
            caps.addArguments("disable-infobars");
            caps.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
            Configuration.browserCapabilities = caps;

            driver = new ChromeDriver(caps);
            WebDriverRunner.setWebDriver(driver);

//            Selenium
//            ChromeOptions options = new ChromeOptions();
//
//            options.addArguments("--ignore-certificate-errors");
//            options.addArguments("--disable-notifications");
//            options.addArguments("start-maximized");
//            options.addArguments("disable-infobars");
//            options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
//            options.addArguments("--disable-auto-update");
//
//            driver = new ChromeDriver(options);
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
