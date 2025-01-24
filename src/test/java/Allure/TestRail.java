package Allure;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyTestNGListener.class)
public class TestRail {

    @Test (description = "158023")
    public void test1() {
        Assert.assertEquals(true, true, "");
    }

    @Test (description = "158024")
    public void test2() {
        Assert.assertEquals(true, true, "");
    }

    @Test (description = "158025")
    public void test3() {
        Assert.assertEquals(true, true, "");
    }

    @Test (description = "158026")
    public void test4() {
        Assert.assertEquals(true, false, "");
    }
}
