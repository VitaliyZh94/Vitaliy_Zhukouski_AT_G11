package web.tests.selenide.booking;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import web.pages.selenide.booking.BookingBase;

import static com.codeborne.selenide.Selenide.open;


public class BookingBaseTest {

    private static final Logger LOGGER = LogManager.getLogger(BookingBaseTest.class);

    @Before
    public void openSite() {
        LOGGER.info("Start");

        open(BookingBase.URL);
    }

    @After
    public void finished() {
        LOGGER.info("Finished");
    }
}
