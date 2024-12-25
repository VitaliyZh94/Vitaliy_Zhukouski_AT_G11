package test.java.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NewTest1 {

    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        webDriver.get("https://www.booking.com/");

        webDriver.findElement(By.xpath("//a[@id='accommodations']"));
        WebElement clear = webDriver.findElement(By.xpath("//button[@type='button'] //span[@role='img']"));
        clear.click();
        WebElement element = webDriver.findElement(By.xpath("//input[@role='combobox']"));
        element.click();
        element.sendKeys("Париж");
    }

}
