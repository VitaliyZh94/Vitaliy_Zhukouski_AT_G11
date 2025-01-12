package web.pages.selenium.booking;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class ApartmentPage extends BookingBase {

    private static final Logger LOGGER = LogManager.getLogger(ApartmentPage.class);

    private final String APARTMENT_RATE = "//div[@data-testid='review-score-right-component']/div/div[contains(text(), 'Оценка')]";

    public Double getApartmentRate() {
        String apartmentRateText = driver.findElement(By.xpath(APARTMENT_RATE)).getText();
        String[] split = apartmentRateText.split(" ");

        LOGGER.trace("Return apartment rate {}", APARTMENT_RATE);
        return Double.valueOf(split[1]);
    }
}
