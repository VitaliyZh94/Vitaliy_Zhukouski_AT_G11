package junit.engineers;

import engineers.AutomatedEngineer;
import engineers.ManualEngineer;
import junit.utils.JUnitLogger;
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

        try {
            new AutomatedEngineer(inputAge, EXP);

            JUnitLogger.illegalArgumentExceptionFailedLogs();
        } catch (IllegalArgumentException e) {
            JUnitLogger.illegalArgumentExceptionPassedLogs();
            throw e;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void setNotRelevantAgeToConstructorQA() {

        try {
            new ManualEngineer(inputAge, EXP);

            JUnitLogger.illegalArgumentExceptionFailedLogs();
        } catch (IllegalArgumentException e) {
            JUnitLogger.illegalArgumentExceptionPassedLogs();
            throw e;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void setNotRelevantAgeToSetterAQA() {

        try {
            AutomatedEngineer ae = new AutomatedEngineer(AGE, EXP);
            ae.setAge(inputAge);

            JUnitLogger.illegalArgumentExceptionFailedLogs();
        } catch (IllegalArgumentException e) {
            JUnitLogger.illegalArgumentExceptionPassedLogs();
            throw e;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void setNotRelevantAgeToSetterQA() {

        try {
            ManualEngineer me = new ManualEngineer(AGE, EXP);
            me.setAge(inputAge);

            JUnitLogger.illegalArgumentExceptionFailedLogs();
        } catch (IllegalArgumentException e) {
            JUnitLogger.illegalArgumentExceptionPassedLogs();
            throw e;
        }
    }
}
