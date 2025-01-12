package web.tests.selenide.booking;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import web.pages.selenide.booking.main_page.HeaderComponent;


public class CurrencyHintTextTest extends BookingBaseTest {

    private static final Logger LOGGER = LogManager.getLogger(CurrencyHintTextTest.class);

    HeaderComponent header = new HeaderComponent();

    @Test
    public void checkCurrencyIconHint() {
        header.hoverCurrencyIcon();

        Assert.assertEquals("Text must be: Выберите валюту",
                "Выберите влюту",
                header.currencyHintsText());

        LOGGER.debug("Assert passed: Expected = {}. Actual = {}", "Выберите валюту", header.currencyHintsText());
    }
}
