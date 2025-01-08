package selenium.tests.demoqa;

import junit.utils.JUnitLogger;
import org.junit.Assert;
import org.junit.Test;
import selenium.pages.demoqa.SelectMenu;


public class SelectorsTest extends DemoQABaseTest {

    SelectMenu selectMenu = new SelectMenu();

    @Test
    public void checkBlueSelect() {
        String expectedColor = "Blue";
        selectMenu.selectBlue();
        Assert.assertEquals("Must be: " + expectedColor, expectedColor, selectMenu.getBlueSelectText());

        JUnitLogger.assertEqualsLogs(selectMenu.getBlueSelectText(), expectedColor);
    }

    @Test
    public void checkSaabSelect() {
        String expectedCar = "Saab";
        selectMenu.selectSaab();
        Assert.assertEquals("Must be: " + expectedCar, expectedCar, selectMenu.getSaabSelectText());

        JUnitLogger.assertEqualsLogs(selectMenu.getSaabSelectText(), expectedCar);
    }
}
