package selenium.pages.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SelectMenu extends DemoQABase {

    private final String COLOR_DROP_DOWN = "//select[@id='oldSelectMenu']";
    private final String CAR_DROP_DOWN = "//select[@id='cars']";
    private final String BLUE_OPTION = "//option[@value='1']";
    private final String SAAB_OPTION = "//option[@value='saab']";
    private final String BLUE = "1";
    private final String SAAB = "saab";

    Select select;

    public void selectBlue() {
        select = new Select(driver.findElement(By.xpath(COLOR_DROP_DOWN)));
        select.selectByValue(BLUE);

        LOGGER.trace("Select {} select in {}", BLUE, COLOR_DROP_DOWN);
    }

    public void selectSaab() {
        select = new Select(driver.findElement(By.xpath(CAR_DROP_DOWN)));
        select.selectByValue(SAAB);

        LOGGER.trace("Select {} select in {}", SAAB, CAR_DROP_DOWN);
    }

    public String getBlueSelectText() {
        return driver.findElement(By.xpath(BLUE_OPTION)).getText();
    }

    public String getSaabSelectText() {
        return driver.findElement(By.xpath(SAAB_OPTION)).getText();
    }

}
