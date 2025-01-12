package web.runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import web.tests.selenium.booking.FifthStarIconExistTest;
import web.tests.selenium.booking.CurrencyHintTextTest;
import web.tests.selenium.booking.CheckApartmentRateTest;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        FifthStarIconExistTest.class,
        CurrencyHintTextTest.class,
        CheckApartmentRateTest.class
})
public class SeleniumRunner {

}
