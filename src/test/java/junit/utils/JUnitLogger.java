package junit.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

public class JUnitLogger {

    private static final Logger LOGGER = LogManager.getLogger();

    static String fullClassName = Thread.currentThread().getStackTrace()[2].getClassName();
    static String simpleClassName = fullClassName.substring(fullClassName.lastIndexOf('.') + 1);

    public static void illegalArgumentExceptionPassedLogs(){
        LOGGER.debug("{}: IllegalArgumentException passed", simpleClassName);
    }

    public static void illegalArgumentExceptionFailedLogs(){
        LOGGER.error("{}: IllegalArgumentException failed", simpleClassName);
    }

    public static void assertEqualsLogs(Object expected, Object actual) {
            Assert.assertEquals(expected, actual);
            LOGGER.debug("{}: Assert passed: Expected = {}. Actual = {}",
                    simpleClassName,
                    expected,
                    actual);
    }
}
