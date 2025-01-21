package api.users.tests;

import api.users.test_objects.SearchResponse;
import api.users.test_objects.User;
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
public class SearchUserByStrictNameTest extends SearchBaseTest {

    private static final Logger LOGGER = LogManager.getLogger(SearchUserByStrictNameTest.class);

    String user;
    boolean strict = true;

    public SearchUserByStrictNameTest(String user) {
        this.user = user;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> obj() {
        return Arrays.asList(new Object[][]{
                {"a"},
                {"rangaradjangoo"}
        });
    }

    @Test
    public void searchUserByStrictName() throws IOException {
        SearchResponse usersResponse = getUsersResponse(user, strict);

        List<User> responseUsers = usersResponse.getData();
        User responseUser = responseUsers.getFirst();

        List<User> testUsers = getTestUsersFromJson();

        User testUser = testUsers.stream().filter(x -> user.equals(x.getUsername()))
                .findFirst()
                .orElse(null);

        Assert.assertEquals(testUser, responseUser);

        LOGGER.debug("Assert passed: \nExpected = {}, \nActual = {}", testUser, responseUser);
    }
}
