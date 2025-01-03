package testng.engineers;

import engineers.AutomatedEngineer;
import engineers.ManualEngineer;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGnotRelevantAgeTest {

    final int EXP = 0;
    final int AGE = 25;

    @DataProvider(name = "t")
    public Object[][] objects() {
        return new Object[][]{
                {66}, {17}, {-20}
        };
    }

    @Test(dataProvider = "t", expectedExceptions = IllegalArgumentException.class)
    public void setNotRelevantAgeToConstructorAQA(int inputAge) {
        new AutomatedEngineer(inputAge, EXP);
    }

    @Test(dataProvider = "t", expectedExceptions = IllegalArgumentException.class)
    public void setNotRelevantAgeToConstructorQA(int inputAge) {
        new ManualEngineer(inputAge, EXP);
    }

    @Test(dataProvider = "t", expectedExceptions = IllegalArgumentException.class)
    public void setNotRelevantAgeToSetterAQA(int inputAge) {
        AutomatedEngineer ae = new AutomatedEngineer(AGE, EXP);
        ae.setAge(inputAge);
    }

    @Test(dataProvider = "t", expectedExceptions = IllegalArgumentException.class)
    public void setNotRelevantAgeToSetterQA(int inputAge) {
        ManualEngineer me = new ManualEngineer(AGE, EXP);
        me.setAge(inputAge);
    }

}
