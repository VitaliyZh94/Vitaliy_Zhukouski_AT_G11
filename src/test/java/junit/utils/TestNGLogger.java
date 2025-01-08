package junit.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

public class TestNGLogger {

    private static final Logger LOGGER = LogManager.getLogger();

    private static String fullClassName = Thread.currentThread().getStackTrace()[2].getClassName();
    private static String simpleClassName = fullClassName.substring(fullClassName.lastIndexOf('.') + 1);

    public static void assertEqualsLogs(Object expected, Object actual) {
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();

        Assert.assertEquals(expected, actual);
        LOGGER.debug("{} {}: Assert passed: Actual = {}. Expected = {}",
                simpleClassName,
                methodName,
                actual,
                expected);
    }
}
