package unit.testng.engineers;

import engineers.AutomatedEngineer;
import engineers.ManualEngineer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGnotRelevantAgeTest {

    private static final Logger LOGGER = LogManager.getLogger(TestNGnotRelevantAgeTest.class);
    final int EXP = 0;
    final int AGE = 25;

    @DataProvider(name = "t")
    public Object[][] objects() {
        return new Object[][]{
                {66}, {17}, {-20}
        };
    }

    @Test(dataProvider = "t", expectedExceptions = IllegalArgumentException.class)
    public void setNotRelevantAgeToConstructorAQA(int inputAge) {

        try {
            new AutomatedEngineer(inputAge, EXP);

            LOGGER.debug("IllegalArgumentException failed");
        } catch (IllegalArgumentException e) {
            LOGGER.debug("IllegalArgumentException passed");
            throw e;
        }
    }

    @Test(dataProvider = "t", expectedExceptions = IllegalArgumentException.class)
    public void setNotRelevantAgeToConstructorQA(int inputAge) {
        try {
            new ManualEngineer(inputAge, EXP);
            LOGGER.debug("IllegalArgumentException failed");
        } catch (IllegalArgumentException e) {
            LOGGER.debug("IllegalArgumentException passed");
            throw e;
        }
    }

    @Test(dataProvider = "t", expectedExceptions = IllegalArgumentException.class)
    public void setNotRelevantAgeToSetterAQA(int inputAge) {

        try {
            AutomatedEngineer ae = new AutomatedEngineer(AGE, EXP);
            ae.setAge(inputAge);

            LOGGER.debug("IllegalArgumentException failed");
        } catch (IllegalArgumentException e) {
            LOGGER.debug("IllegalArgumentException passed");
            throw e;
        }

    }

    @Test(dataProvider = "t", expectedExceptions = IllegalArgumentException.class)
    public void setNotRelevantAgeToSetterQA(int inputAge) {

        try {
            ManualEngineer me = new ManualEngineer(AGE, EXP);
            me.setAge(inputAge);

            LOGGER.debug("IllegalArgumentException failed");
        } catch (IllegalArgumentException e) {
            LOGGER.debug("IllegalArgumentException passed");
            throw e;
        }
    }
}
