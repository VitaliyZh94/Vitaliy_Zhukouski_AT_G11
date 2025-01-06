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

        try {
            new AutomatedEngineer(AGE, inputExp);

            JUnitLogger.illegalArgumentExceptionFailedLogs();
        } catch (IllegalArgumentException e) {
            JUnitLogger.illegalArgumentExceptionPassedLogs();
            throw e;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void setNotRelevantExpToConstructorQA() {

        try {
            new ManualEngineer(AGE, inputExp);

            JUnitLogger.illegalArgumentExceptionFailedLogs();
        } catch (IllegalArgumentException e) {
            JUnitLogger.illegalArgumentExceptionPassedLogs();
            throw e;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void setNotRelevantExpToSetterAQA() {

        try {
            AutomatedEngineer ae = new AutomatedEngineer(AGE, EXP);
            ae.setExperience(inputExp);

            JUnitLogger.illegalArgumentExceptionFailedLogs();
        } catch (IllegalArgumentException e) {
            JUnitLogger.illegalArgumentExceptionPassedLogs();
            throw e;
        }

    }

    @Test(expected = IllegalArgumentException.class)
    public void setNotRelevantExpToSetterQA() {

        try {
            ManualEngineer me = new ManualEngineer(AGE, EXP);
            me.setExperience(inputExp);

            JUnitLogger.illegalArgumentExceptionFailedLogs();
        } catch (IllegalArgumentException e) {
            JUnitLogger.illegalArgumentExceptionPassedLogs();
            throw e;
        }
    }
}
