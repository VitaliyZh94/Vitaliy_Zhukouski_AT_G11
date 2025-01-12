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
public class SetNotRelevantSkillTest {

    private static final Logger LOGGER = LogManager.getLogger(SetNotRelevantSkillTest.class);
    final int AGE = 25;
    final int EXP = 0;
    int inputSkill;

    public SetNotRelevantSkillTest(int inputSkill) {
        this.inputSkill = inputSkill;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> obj() {
        return Arrays.asList(new Object[][]{
                {-1},
                {201}
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void setNotRelevantSkillAQA() {

        try {
            AutomatedEngineer ae = new AutomatedEngineer(AGE, EXP);
            ae.setSkill(inputSkill);

            LOGGER.debug("IllegalArgumentException failed");
        } catch (IllegalArgumentException e) {
            LOGGER.debug("IllegalArgumentException passed");
            throw e;
        }

    }

    @Test(expected = IllegalArgumentException.class)
    public void setNotRelevantSkillQA() {

        try {
            ManualEngineer me = new ManualEngineer(AGE, EXP);
            me.setSkill(inputSkill);

            LOGGER.debug("IllegalArgumentException failed");
        } catch (IllegalArgumentException e) {
            LOGGER.debug("IllegalArgumentException passed");
            throw e;
        }

    }
}
