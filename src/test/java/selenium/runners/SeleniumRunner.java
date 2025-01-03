package selenium.runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import selenium.tests.booking.FiveStarsHotelTest;
import selenium.tests.booking.HeaderTest;
import selenium.tests.booking.HotelRateTest;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        FiveStarsHotelTest.class,
        HeaderTest.class,
        HotelRateTest.class
})
public class SeleniumRunner {

}
