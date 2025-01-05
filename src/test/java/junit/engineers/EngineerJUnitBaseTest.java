package junit.engineers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

public class EngineerJUnitBaseTest {

    protected static final Logger LOGGER = LogManager.getLogger();

    protected static void assertEqualLogs(Object expected, Object actual) {

        try {
            Assert.assertEquals(expected, actual);
            LOGGER.debug("{}: Assert passed: Expected = {}. Actual = {}",
                    Thread.currentThread().getStackTrace()[2].getClassName(),
                    expected,
                    actual);
        } catch (AssertionError e) {
            LOGGER.error("{}: Assert failed: Expected = {}. Actual = {}",
                    Thread.currentThread().getStackTrace()[2].getClassName(),
                    expected,
                    actual);
            throw e;
        }
    }
}
