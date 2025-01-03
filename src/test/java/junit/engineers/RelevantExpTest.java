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
public class RelevantExpTest { //check set to constructor and setter + getter

    final int AGE = 25;
    final int EXP = 0;
    private int inputExp;

    public RelevantExpTest(int inputExp) {
        this.inputExp = inputExp;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> obj() {
        return Arrays.asList(new Object[][]{
                {7},
                {0},
                {3}
        });
    }

    @Test
    public void setRelevantExpToConstructorAQA() {
        AutomatedEngineer ae = new AutomatedEngineer(AGE, inputExp);
        Assert.assertEquals("Exp is not relevant", inputExp, ae.getExperience());
    }

    @Test
    public void setRelevantExpToConstructorQA() {
        ManualEngineer me = new ManualEngineer(AGE, inputExp);
        Assert.assertEquals("Exp is not relevant", inputExp, me.getExperience());
    }

    @Test
    public void setToSetterRelevantExpAQA() {
        AutomatedEngineer ae = new AutomatedEngineer(AGE, EXP);
        ae.setExperience(inputExp);
        Assert.assertEquals("Exp is not relevant", inputExp, ae.getExperience());
    }

    @Test
    public void setToSetterRelevantExpQA() {
        ManualEngineer me = new ManualEngineer(AGE, EXP);
        me.setExperience(inputExp);
        Assert.assertEquals("Exp is not relevant", inputExp, me.getExperience());
    }
}
