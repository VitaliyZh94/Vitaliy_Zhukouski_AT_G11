package web.pages.selenide.booking;

import static com.codeborne.selenide.Selenide.$x;

public class ChooseAccountToLogInPage extends BookingBase {

    private static final String ACCOUNT_BUTTON = "(//form[@method = 'post']//li)[1]";
    private static final String CONTINUE_BUTTON = "(//div[contains(@jsaction, 'click')]//button)[2]";

    public void LogIn() {
        $x(ACCOUNT_BUTTON).click();
        $x(CONTINUE_BUTTON).click();
    }

    //todo

}
