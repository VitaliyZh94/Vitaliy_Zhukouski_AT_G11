package selenium.pages.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SelectMenu extends DemoQABase {

    private final String FIRST_SELECT = "//select[@id='oldSelectMenu']";
    private final String SECOND_SELECT = "select[@id='cars']";

    Select select;

    public void selectFirstSelect(int value) {
        select = new Select(driver.findElement(By.xpath(FIRST_SELECT)));
        select.selectByValue(Integer.toString(value));
    }

    public void selectSecondSelect(int value) {
        select = new Select(driver.findElement(By.xpath(SECOND_SELECT)));
        select.selectByValue(Integer.toString(value));

        //todo
    }
}
