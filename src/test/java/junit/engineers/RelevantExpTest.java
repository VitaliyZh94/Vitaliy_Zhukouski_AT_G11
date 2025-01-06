package junit.engineers;

import engineers.AutomatedEngineer;
import engineers.ManualEngineer;
import junit.utils.JUnitLogger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RelevantExpTest  {

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
        int actualExp = ae.getExperience();
        Assert.assertEquals("Exp is not relevant: expected = " + inputExp + ", actual = " + actualExp, inputExp, actualExp);

        JUnitLogger.assertEqualsLogs(inputExp, actualExp);
    }

    @Test
    public void setRelevantExpToConstructorQA() {
        ManualEngineer me = new ManualEngineer(AGE, inputExp);
        int actualExp = me.getExperience();
        Assert.assertEquals("Exp is not relevant: expected = " + inputExp + ", actual = " + actualExp, inputExp, actualExp);

        JUnitLogger.assertEqualsLogs(inputExp, actualExp);
    }

    @Test
    public void setToSetterRelevantExpAQA() {
        AutomatedEngineer ae = new AutomatedEngineer(AGE, EXP);
        ae.setExperience(inputExp);
        int actualExp = ae.getExperience();
        Assert.assertEquals("Exp is not relevant: expected = " + inputExp + ", actual = " + actualExp, inputExp, actualExp);

        JUnitLogger.assertEqualsLogs(inputExp, actualExp);
    }

    @Test
    public void setToSetterRelevantExpQA() {
        ManualEngineer me = new ManualEngineer(AGE, EXP);
        me.setExperience(inputExp);
        int actualExp = me.getExperience();
        Assert.assertEquals("Exp is not relevant: expected = " + inputExp + ", actual = " + actualExp, inputExp, actualExp);

        JUnitLogger.assertEqualsLogs(inputExp, actualExp);
    }
}
