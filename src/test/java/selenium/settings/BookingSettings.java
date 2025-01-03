package selenium.settings;

import java.time.LocalDate;

public class BookingSettings {

    public static String PARIS = "Париж";

    private LocalDate arrivalDate = LocalDate.now().plusDays(2);
    private LocalDate departureDate = LocalDate.now().plusDays(9);

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }
}
