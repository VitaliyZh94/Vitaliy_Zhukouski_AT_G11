package selenium.pages.booking;

import org.openqa.selenium.By;

public class Apartment extends BookingBase {

    private final String APARTMENT_RATE = "//div[@data-testid='review-score-right-component']/div/div[contains(text(), 'Оценка')]";

    public Double getApartmentRate() {
        String apartmentRateText = driver.findElement(By.xpath(APARTMENT_RATE)).getText();
        String[] split = apartmentRateText.split(" ");

        return Double.valueOf(split[1]);
    }


}
