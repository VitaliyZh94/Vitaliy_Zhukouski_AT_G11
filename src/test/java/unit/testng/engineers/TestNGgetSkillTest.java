package unit.testng.engineers;

import engineers.AutomatedEngineer;
import engineers.ManualEngineer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGgetSkillTest {

    private static final Logger LOGGER = LogManager.getLogger(TestNGgetSkillTest.class);
    final int AGE = 25;

    @DataProvider(name = "t")
    public Object[][] createData() {
        return new Object[][]{
                {0},
                {7}
        };
    }

    @Test(dataProvider = "t")
    public void skillTestAQA(int inputExp) {
        AutomatedEngineer ae = new AutomatedEngineer(AGE, inputExp);
        int expected = inputExp * ae.getCoeff();
        Assert.assertEquals(ae.getSkill(), expected, "Skill is not relevant");

        LOGGER.debug("Assert passed: Expected = {}. Actual = {}", ae.getSkill(), expected);
    }

    @Test(dataProvider = "t")
    public void skillTestQA(int inputExp) {
        ManualEngineer me = new ManualEngineer(AGE, inputExp);
        int expected = inputExp * me.getCoeff();
        Assert.assertEquals(me.getSkill(), expected, "Skill is not relevant");

        LOGGER.debug("Assert passed: Expected = {}. Actual = {}", me.getSkill(), expected);
    }
}
