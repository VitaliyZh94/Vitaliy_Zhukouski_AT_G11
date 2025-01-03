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
public class GetSkillTest {

    final int AGE = 25;
    int inputExp;

    public GetSkillTest(int inputExp) {
        this.inputExp = inputExp;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> obj() {
        return Arrays.asList(new Object[][]{
                {0},
                {7},
        });
    }

    @Test
    public void skillTestAQA() {
        AutomatedEngineer ae = new AutomatedEngineer(AGE, inputExp);
        Assert.assertEquals("Skill is not relevant", inputExp * ae.getCoeff(), ae.getSkill());
    }

    @Test
    public void skillTestQA() {
        ManualEngineer me = new ManualEngineer(AGE, inputExp);
        Assert.assertEquals("Skill is not relevant", inputExp * me.getCoeff(), me.getSkill());
    }
}
