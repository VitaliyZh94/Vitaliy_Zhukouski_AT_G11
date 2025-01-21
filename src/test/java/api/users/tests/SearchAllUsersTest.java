package api.users.tests;

import api.users.test_objects.User;
import api.users.test_objects.SearchResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class SearchAllUsersTest extends SearchBaseTest {

    private static final Logger LOGGER = LogManager.getLogger(SearchAllUsersTest.class);

    String user = "";
    boolean strict = false;

    @Test
    public void searchAllUsers() throws IOException {
        SearchResponse usersResponse = getUsersResponse(user, strict);
        List<User> responseUsers = usersResponse.getData();
        List<User> testUsers = getTestUsersFromJson();

        Assert.assertEquals(testUsers, responseUsers);

        LOGGER.debug("Assert passed: \nExpected = {}, \nActual = {}", testUsers, responseUsers);
    }
}
