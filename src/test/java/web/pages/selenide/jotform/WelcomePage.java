package web.pages.selenide.jotform;

import web.driver.ChromeOptionsSelenide;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class WelcomePage {

    private static final String URL = "https://www.jotform.com/";
    private static final String LOG_IN_BUTTON = "//button[contains(text(), 'Login')]";
    private static final String EMAIL_FIELD = "//input[@placeholder = 'Username or Email']";
    private static final String PASSWORD_FIELD = "//input[@placeholder = 'Password']";
    private static final String SIGN_IN_BUTTON = "//button[@id= 'signinButton']";

    public void openSite() {
        ChromeOptionsSelenide.setUp();
        open(URL);
    }

    public void logIn() {
        $x(LOG_IN_BUTTON).should(exist, Duration.ofSeconds(30)).click();
        $x(EMAIL_FIELD).setValue(TestPerson.EMAIL);
        $x(PASSWORD_FIELD).setValue(TestPerson.PASSWORD);
        $x(SIGN_IN_BUTTON).click();
    }
}
