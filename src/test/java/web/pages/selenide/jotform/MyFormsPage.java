package web.pages.selenide.jotform;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class MyFormsPage {

    private static final String APPOINTMENT_REQUEST_FORM = "//img[@src= 'https://files.jotform.com/jotformapps/appointment-request-form-28fed491828a4a54d730e1c8d9eaf7bb-classic.png']";
    private static final String FIRST_NAME_FIELD = "//input[@id = 'first_3']";
    private static final String LAST_NAME_FIELD = "//input[@id = 'last_3']";
    private static final String PHONE_FIELD = "//input[@id = 'input_4_full']";
    private static final String EMAIL_FIELD = "//input[@id = 'input_5']";
    private static final String STREET_ADDRESS_FILED = "//input[@id = 'input_6_addr_line1']";
    private static final String STREET_ADDRESS2_FILED = "//input[@id = 'input_6_addr_line2']";
    private static final String CITY_FIELD = "//input[@id = 'input_6_city']";
    private static final String STATE_FIELD = "//input[@id = 'input_6_state']";
    private static final String POSTAL_FIELD = "//input[@id = 'input_6_postal']";
    private static final String SELECT_MONTH = "//select[@class = 'pickerMonth']";
    private static final String SELECT_YEAR = "//select[@class = 'pickerYear']";
    private static final String TOMORROW = getTomorrow();
    private static final String CALENDAR_DAY_BUTTON = "//div[@class = 'appointmentCalendarDays days']//div[@data-value = '" + TOMORROW + "']";
    private static final String TIME_BUTTON = "//div[@class = 'appointmentSlot slot ']";
    private static final String ADDITIONAL_DATE_BUTTON = "//button[@id = 'input_12_pick']";
    private static final String CURRENT_MONTH_IN_ADDITIONAL_APPOINTMENT_TEXT = "//div[@class = 'calendar-new-month']//span";
    private static final String NEXT_MONTH_BUTTON = "//button[@class = 'button nextMonth']";
    private static final String DAY_AFTER_TOMORROW = getDayAfterTomorrow();
    private static final String DAY_IN_ADDITIONAL_APPOINTMENT = "//table[@role = 'grid']//td[@data-date = '" + DAY_AFTER_TOMORROW + "']";
    private static final String HOURS_IN_ADDITIONAL_APPOINTMENT = "//input[@id= 'input_12_hourSelect']";
    private static final String MINUTES_IN_ADDITIONAL_APPOINTMENT = "//input[@id= 'input_12_minuteSelect']";
    private static final String AM_PM_SELECT = "//select[@id= 'input_12_ampm']";
    private static final String TEXT_AREA = "//textarea[@id= 'input_10']";
    private static final String OFF_TOGGLE = "//label[@id= 'label_input_11_1']";
    private static final String SUBMIT = "//button[@id= 'input_14']";
    private static final String TNX_POP_UP = "//img[@src = 'https://cdn.jotfor.ms/img/Thankyou-iconV2.png?v=0.1']";

    Select select;

    public void enterPersonsData() {
        $x(APPOINTMENT_REQUEST_FORM).should(exist, Duration.ofSeconds(30)).click();
        $x(FIRST_NAME_FIELD).should(exist, Duration.ofSeconds(30)).setValue(TestPerson.NAME);
        $x(LAST_NAME_FIELD).setValue(TestPerson.LAST_NAME);
        $x(PHONE_FIELD).setValue(TestPerson.PHONE_NUMBER);
        $x(EMAIL_FIELD).setValue(TestPerson.EMAIL);
        $x(STREET_ADDRESS_FILED).setValue(TestPerson.STREET_ADDRESS);
        $x(STREET_ADDRESS2_FILED).setValue(TestPerson.STREET_ADDRESS2);
        $x(CITY_FIELD).setValue(TestPerson.CITY);
        $x(STATE_FIELD).setValue(TestPerson.STATE);
        $x(POSTAL_FIELD).setValue(TestPerson.POSTAL);
    }

    public void enterMainAppointment() {
        select = new Select($x(SELECT_MONTH));
        String month = capitalizeFirstLetter(LocalDate.now().plusDays(1).getMonth().toString());
        select.selectByValue(month);

        select = new Select($x(SELECT_YEAR));
        String year = String.valueOf(LocalDate.now().plusDays(1).getYear());
        select.selectByValue(year);

        $x(CALENDAR_DAY_BUTTON).click();
        $x(TIME_BUTTON).click();
    }

    public void enterAdditionalAppointment() {
        $x(ADDITIONAL_DATE_BUTTON).click();

        LocalDate dayAfterTomorrow = LocalDate.now().plusDays(2);
        String requiredMonth = capitalizeFirstLetter(dayAfterTomorrow.getMonth().toString());

        if (!requiredMonth.equals(CURRENT_MONTH_IN_ADDITIONAL_APPOINTMENT_TEXT)) {
            $x(NEXT_MONTH_BUTTON).click();
        }

        $x(DAY_IN_ADDITIONAL_APPOINTMENT).click();

        executeJavaScript("arguments[0].setAttribute('value', '20');", HOURS_IN_ADDITIONAL_APPOINTMENT);
        executeJavaScript("arguments[0].setAttribute('value', '30');", MINUTES_IN_ADDITIONAL_APPOINTMENT);

        select = new Select($x(AM_PM_SELECT));
        select.selectByValue("PM");
    }

    public void enterTextArea() {
        $x(TEXT_AREA).setValue("BLA BLA BLA");
        $x(OFF_TOGGLE).click();
    }

    public void submit() {
        $x(SUBMIT).click();
    }

    public void checkTnxPopUpExists() {
        Assert.assertEquals("Pop-up is not exists", true, $x(TNX_POP_UP).exists());
    }

    private String capitalizeFirstLetter(String string) {
        if (string == null || string.isEmpty()) return string;
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    private static String getTomorrow() {
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        DateTimeFormatter formatted = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return tomorrow.format(formatted);
    }

    private static String getDayAfterTomorrow() {
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        DateTimeFormatter formatted = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        return tomorrow.format(formatted);
    }
}
