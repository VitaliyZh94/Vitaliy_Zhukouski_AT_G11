package selenium.pages.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SelectMenu extends DemoQABase {

    private final String FIRST_SELECT_DROP_DOWN = "//select[@id='oldSelectMenu']";
    private final String SECOND_SELECT_DROP_DOWN = "select[@id='cars']";
    private final String GROUP1_OPTION2 = "//div[@id = 'react-select-2-option-0-1']"; //Group 1, option 2
    private final String FIRST_SELECT_CONTAINER = "//div[@id = 'withOptGroup']"; // отсюда надо гет текст и сравнить с Group 1, option 2


    Select select;

    public void selectFirstSelect(int value) {
        select = new Select(driver.findElement(By.xpath(FIRST_SELECT_DROP_DOWN)));
        select.selectByValue(Integer.toString(value));

        LOGGER.trace("Select first select {}", FIRST_SELECT_DROP_DOWN);
    }

    public void selectSecondSelect(int value) {
        select = new Select(driver.findElement(By.xpath(SECOND_SELECT_DROP_DOWN)));
        select.selectByValue(Integer.toString(value));

        LOGGER.trace("Select second select {}", SECOND_SELECT_DROP_DOWN);
        //todo
    }
}
