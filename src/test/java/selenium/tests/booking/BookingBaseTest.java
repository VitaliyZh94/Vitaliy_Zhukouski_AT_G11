package selenium.tests.booking;

import selenium.driver.Driver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import selenium.pages.booking.BookingBase;


public class BookingBaseTest {

    protected static WebDriver driver;

    @Before
    public void openSite() {
        driver = Driver.getDriver();
        driver.get(BookingBase.URL);
    }

    @After
    public void quitDriver() {
        driver.close();
    }
}
