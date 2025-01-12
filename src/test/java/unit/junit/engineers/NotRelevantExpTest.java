package unit.junit.engineers;

import engineers.AutomatedEngineer;
import engineers.ManualEngineer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class NotRelevantExpTest {

    private static final Logger LOGGER = LogManager.getLogger(NotRelevantExpTest.class);
    final int AGE = 25;
    final int EXP = 0;
    int inputExp;

    public NotRelevantExpTest(int inputExp) {
        this.inputExp = inputExp;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> obj() {
        return Arrays.asList(new Object[][]{
                {-1},
                {8},
                {30}
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void setNotRelevantExpToConstructorAQA() {

        try {
            new AutomatedEngineer(AGE, inputExp);

            LOGGER.debug("IllegalArgumentException failed");
        } catch (IllegalArgumentException e) {
            LOGGER.debug("IllegalArgumentException passed");
            throw e;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void setNotRelevantExpToConstructorQA() {

        try {
            new ManualEngineer(AGE, inputExp);

            LOGGER.debug("IllegalArgumentException failed");
        } catch (IllegalArgumentException e) {
            LOGGER.debug("IllegalArgumentException passed");
            throw e;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void setNotRelevantExpToSetterAQA() {

        try {
            AutomatedEngineer ae = new AutomatedEngineer(AGE, EXP);
            ae.setExperience(inputExp);

            LOGGER.debug("IllegalArgumentException failed");
        } catch (IllegalArgumentException e) {
            LOGGER.debug("IllegalArgumentException passed");
            throw e;
        }

    }

    @Test(expected = IllegalArgumentException.class)
    public void setNotRelevantExpToSetterQA() {

        try {
            ManualEngineer me = new ManualEngineer(AGE, EXP);
            me.setExperience(inputExp);

            LOGGER.debug("IllegalArgumentException failed");
        } catch (IllegalArgumentException e) {
            LOGGER.debug("IllegalArgumentException passed");
            throw e;
        }
    }
}
