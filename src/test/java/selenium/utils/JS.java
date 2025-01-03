package selenium.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JS {

    WebDriver driver;

    public JS(WebDriver driver) {
        this.driver = driver;
    }

    public void openURLInCurrentTab(String url) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].removeAttribute('target')", url);
    }
}
