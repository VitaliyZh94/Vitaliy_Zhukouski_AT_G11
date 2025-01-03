package junit.engineers;

import engineers.AutomatedEngineer;
import engineers.ManualEngineer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SetNotRelevantSkillTest {

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
        AutomatedEngineer ae = new AutomatedEngineer(AGE, EXP);
        ae.setSkill(inputSkill);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setNotRelevantSkillQA() {
        ManualEngineer me = new ManualEngineer(AGE, EXP);
        me.setSkill(inputSkill);
    }
}
