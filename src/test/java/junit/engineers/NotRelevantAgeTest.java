package junit.engineers;

import engineers.AutomatedEngineer;
import engineers.ManualEngineer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class NotRelevantAgeTest {

    final int EXP = 0;
    final int AGE = 25;
    int inputAge;

    public NotRelevantAgeTest(int inputAge) {
        this.inputAge = inputAge;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> obj() {
        return Arrays.asList(new Object[][]{
                {66}, {17}, {-20}
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void setNotRelevantAgeToConstructorAQA() {
        new AutomatedEngineer(inputAge, EXP);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setNotRelevantAgeToConstructorQA() {
        new ManualEngineer(inputAge, EXP);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setNotRelevantAgeToSetterAQA() {
        AutomatedEngineer ae = new AutomatedEngineer(AGE, EXP);
        ae.setAge(inputAge);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setNotRelevantAgeToSetterQA() {
        ManualEngineer me = new ManualEngineer(AGE, EXP);
        me.setAge(inputAge);
    }
}
