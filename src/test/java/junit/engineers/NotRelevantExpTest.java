package junit.engineers;

import engineers.AutomatedEngineer;
import engineers.ManualEngineer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class NotRelevantExpTest {

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
        new AutomatedEngineer(AGE, inputExp);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setNotRelevantExpToConstructorQA() {
        new ManualEngineer(AGE, inputExp);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setNotRelevantExpToSetterAQA() {
        AutomatedEngineer ae = new AutomatedEngineer(AGE, EXP);
        ae.setExperience(inputExp);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setNotRelevantExpToSetterQA() {
        ManualEngineer me = new ManualEngineer(AGE, EXP);
        me.setExperience(inputExp);
    }
}
