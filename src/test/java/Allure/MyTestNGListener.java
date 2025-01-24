package Allure;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestNGListener implements ITestListener {

    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getMethod().getDescription());
        Result result1 = new Result(1);
        TestRailReporter.reportResult("2363", result.getMethod().getDescription(), result1);
        System.out.println("Success");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println(result.getMethod().getDescription());
        Result result2 = new Result(5);
        TestRailReporter.reportResult("2363", result.getMethod().getDescription(), result2);
        System.out.println("Failed");
    }
}
