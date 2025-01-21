package api.users.tests;

import api.users.test_objects.User;
import api.users.test_objects.SearchResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class SearchUserBySegmentTest extends SearchBaseTest {

    private static final Logger LOGGER = LogManager.getLogger(SearchUserBySegmentTest.class);

    private static final String USER_WITH_MIN_NAME = "a";
    private static final String USER_WITH_MAX_NAME = "rangaradjangoo";

    String segment;
    boolean strict = false;

    public SearchUserBySegmentTest(String segment) {
        this.segment = segment;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> obj() {
        return Arrays.asList(new Object[][] {
                {"a"},
                {""}
        });
    }

    @Test
    public void searchUserWithMinName() throws IOException {

        SearchResponse usersResponse = getUsersResponse(segment, strict);

        List<User> responseUsers = usersResponse.getData();

        User responseUser = responseUsers.stream()
                .filter(x -> x.getUsername().contains(segment))
                .min((x, y) -> Integer.compare(x.getUsername().length(), y.getUsername().length()))
                .orElse(null);

        List<User> testUsers = getTestUsersFromJson();

        User testUser = testUsers.stream()
                .filter(x -> x.getUsername().contains(segment) && x.getUsername().equals(USER_WITH_MIN_NAME))
                .findFirst().orElse(null);

        Assert.assertEquals(testUser, responseUser);

        LOGGER.debug("Assert passed: \nExpected = {}, \nActual = {}", testUser, responseUser);
    }

    @Test
    public void searchUserWithMaxName() throws IOException {
        SearchResponse usersResponse = getUsersResponse(segment, strict);

        List<User> responsUsers = usersResponse.getData();
        User responseUser = responsUsers.stream()
                .filter(x -> x.getUsername().contains(segment))
                .max((x, y) -> Integer.compare(x.getUsername().length(), y.getUsername().length()))
                .orElse(null);

        List<User> testUsers = getTestUsersFromJson();

        User testUser = testUsers.stream()
                .filter(x -> x.getUsername().contains(segment) && x.getUsername().equals(USER_WITH_MAX_NAME))
                .findFirst().orElse(null);

        Assert.assertEquals(testUser, responseUser);

        LOGGER.debug("Assert passed: \nExpected = {}, \nActual = {}", testUser, responseUser);
    }
}
