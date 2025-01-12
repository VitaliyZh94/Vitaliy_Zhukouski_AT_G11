package web.tests.selenide.demoqa;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import web.pages.selenide.demoqa.SelectMenuComponent;


public class SelectorsTest extends DemoQABaseTest {

    private static final Logger LOGGER = LogManager.getLogger(SelectorsTest.class);

    SelectMenuComponent selectMenu = new SelectMenuComponent();

    @Test
    public void checkBlueSelect() {
        String expectedColor = "Blue";
        selectMenu.selectBlue();

        Assert.assertEquals("Must be: " + expectedColor, expectedColor, selectMenu.getBlueSelectText());

        LOGGER.debug("Assert passed: Expected = {}. Actual = {}", selectMenu.getBlueSelectText(), expectedColor);
    }

    @Test
    public void checkSaabSelect() {
        String expectedCar = "Saab";
        selectMenu.selectSaab();

        Assert.assertEquals("Must be: " + expectedCar, expectedCar, selectMenu.getSaabSelectText());

        LOGGER.debug("Assert passed: Expected = {}. Actual = {}", selectMenu.getSaabSelectText(), expectedCar);
    }
}
