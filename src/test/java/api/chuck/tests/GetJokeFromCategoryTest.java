package api.chuck.tests;

import api.chuck.test_objects.JokeFromCategoryResponse;
import api.chuck.test_objects.JokesCategories;
import api.utils.ResponseObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetJokeFromCategoryTest {

    private static final String URL = "https://api.chucknorris.io/jokes/random?category=" + JokesCategories.ANIMAL;
    private static final Logger LOGGER = LogManager.getLogger(GetJokeFromCategoryTest.class);

    @Test
    public void checkJokeTextExist() {
        JokeFromCategoryResponse actualResponse = ResponseObject.getResponse(URL, JokeFromCategoryResponse.class);

        Assert.assertEquals(!actualResponse.getValue().isEmpty(), true, "Joke is empty");

        LOGGER.debug("Assert passed: \nExpected = {} letters > 0,", actualResponse.getValue().length());
    }

}
