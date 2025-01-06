package selenium.tests.booking;

import junit.utils.JUnitLogger;
import org.junit.Assert;
import org.junit.Test;
import selenium.pages.booking.Header;


public class CurrencyHintTextTest extends BookingBaseTest {

    Header header = new Header();

    @Test
    public void checkCurrencyIconHint() {
        header.hoverCurrencyIcon();

        Assert.assertEquals("Text must be: Выберите валюту",
                "Выберите влюту",
                header.currencyHintsText());

        JUnitLogger.assertEqualsLogs("Выберите валюту", header.currencyHintsText());
    }
}
