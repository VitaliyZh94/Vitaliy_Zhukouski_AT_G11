package web.pages.selenium.booking;

import org.openqa.selenium.By;

public class ChooseAccountToLogInPage extends BookingBase{

    private static final String ACCOUNT_BUTTON = "(//form[@method = 'post']//li)[1]";
    private static final String CONTINUE_BUTTON = "(//div[contains(@jsaction, 'click')]//button)[2]";

    public void LogIn() {
        driver.findElement(By.xpath(ACCOUNT_BUTTON)).click();
        driver.findElement(By.xpath(CONTINUE_BUTTON)).click();
    }

    //todo

}
