package junit.engineers;

import engineers.AutomatedEngineer;
import engineers.ManualEngineer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SetRelevantSkillTest {

    final int AGE = 25;
    final int EXP = 0;
    int inputSkill;

    public SetRelevantSkillTest(int inputSkill) {
        this.inputSkill = inputSkill;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> obj() {
        return Arrays.asList(new Object[][]{
                {0},
                {200},
                {100}
        });
    }

    @Test
    public void setRelevantSkillAQA() {
        AutomatedEngineer ae = new AutomatedEngineer(AGE, EXP);
        ae.setSkill(inputSkill);
        Assert.assertEquals("Skill is not valid", inputSkill, ae.getSkill());
    }

    @Test
    public void setRelevantSkillQA() {
        ManualEngineer me = new ManualEngineer(AGE, EXP);
        me.setSkill(inputSkill);
        Assert.assertEquals("Skill is not valid", inputSkill, me.getSkill());
    }
}
