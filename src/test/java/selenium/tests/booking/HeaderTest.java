package selenium.tests.booking;

import org.junit.Assert;
import org.junit.Test;
import selenium.pages.booking.Header;


public class HeaderTest extends BookingBaseTest {

    Header header = new Header();

    @Test
    public void checkCurrencyIconHint() {
        header.hoverCurrencyIcon();

        Assert.assertEquals("Text must be: Выберите валюту",
                "Выберите валюту",
                header.currencyHintsText());
    }
}
