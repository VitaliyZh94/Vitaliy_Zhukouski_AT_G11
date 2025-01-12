package web.pages.selenide.booking;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import web.pages.selenium.booking.BookingBase;

import static com.codeborne.selenide.Selenide.$x;

public class ApartmentPage extends BookingBase {

    private static final Logger LOGGER = LogManager.getLogger(ApartmentPage.class);

    private final String APARTMENT_RATE = "//div[@data-testid='review-score-right-component']/div/div[contains(text(), 'Оценка')]";

    public Double getApartmentRate() {
        String apartmentRateText = $x(APARTMENT_RATE).getText();
        String[] split = apartmentRateText.split(" ");

        LOGGER.trace("Return apartment rate {}", APARTMENT_RATE);
        return Double.valueOf(split[1]);
    }
}
