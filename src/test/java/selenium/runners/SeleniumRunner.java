package selenium.runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import selenium.tests.booking.FifthStarIconExistTest;
import selenium.tests.booking.CurrencyHintTextTest;
import selenium.tests.booking.HotelRateTest;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        FifthStarIconExistTest.class,
        CurrencyHintTextTest.class,
        HotelRateTest.class
})
public class SeleniumRunner {

}
