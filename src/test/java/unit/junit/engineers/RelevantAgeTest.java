package unit.junit.engineers;

import engineers.AutomatedEngineer;
import engineers.ManualEngineer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RelevantAgeTest { //check set to constructor and setter + getter

    private static final Logger LOGGER = LogManager.getLogger(RelevantAgeTest.class);

    final int EXP = 0;
    final int AGE = 25;
    int inputAge;
    int expectedAge;

    public RelevantAgeTest(int inputAge, int expectedAge) {
        this.inputAge = inputAge;
        this.expectedAge = expectedAge;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> obj() {
        return Arrays.asList(new Object[][]{
                {18, 18},
                {65, 65},
                {30, 30}
        });
    }

    @Test
    public void setToConstructorRelevantAgeAQA() {
        AutomatedEngineer at = new AutomatedEngineer(inputAge, EXP);
        int actualAge = at.getAge();
        Assert.assertEquals("Age is not relevant", expectedAge, actualAge);

        LOGGER.debug("Assert passed: Expected = {}. Actual = {}", expectedAge, actualAge);
    }

    @Test
    public void setToConstructorRelevantAgeQA() {
        ManualEngineer me = new ManualEngineer(inputAge, EXP);
        int actualAge = me.getAge();
        Assert.assertEquals("Age is not relevant", expectedAge, actualAge);

        LOGGER.debug("Assert passed: Expected = {}. Actual = {}", expectedAge, actualAge);
    }

    @Test
    public void setToSetterRelevantAgeAQA() {
        AutomatedEngineer at = new AutomatedEngineer(AGE, EXP);
        at.setAge(inputAge);
        int actualAge = at.getAge();
        Assert.assertEquals("Age is not relevant: expected = " + expectedAge + ", actual = " + actualAge, expectedAge, actualAge);

        LOGGER.debug("Assert passed: Expected = {}. Actual = {}", expectedAge, actualAge);
    }

    @Test
    public void setToSetterRelevantAgeQA() {
        ManualEngineer me = new ManualEngineer(AGE, EXP);
        me.setAge(inputAge);
        int actualAge = me.getAge();
        Assert.assertEquals("Age is not relevant: expected = " + expectedAge + ", actual = " + actualAge, expectedAge, actualAge);;

        LOGGER.debug("Assert passed: Expected = {}. Actual = {}", expectedAge, actualAge);
    }

}
