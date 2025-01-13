package web.runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import web.tests.selenide.booking.CurrencyHintTextTest;
import web.tests.selenide.booking.ScreenshotHotelTest;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        ScreenshotHotelTest.class,
        CurrencyHintTextTest.class})
public class SelenideRunner {
}
