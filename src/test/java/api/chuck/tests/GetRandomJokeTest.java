package api.chuck.tests;

import api.chuck.test_objects.RandomJokeResponse;
import api.utils.ResponseObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class GetRandomJokeTest {

    private static final String URL = "https://api.chucknorris.io/jokes/random";
    private static final String FILE = "src/test/resources/chuck/chuckResponse.json";
    private static final Logger LOGGER = LogManager.getLogger(GetRandomJokeTest.class);

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void getRandomJoke() throws IOException {
        RandomJokeResponse jokeResponse = ResponseObject.getResponse(URL, RandomJokeResponse.class);
        RandomJokeResponse actualJokeResponse = formatedResponse(jokeResponse);
        RandomJokeResponse expectedJokeResponse = objectMapper.readValue(new File(FILE), RandomJokeResponse.class);

        Assert.assertEquals(actualJokeResponse,
                expectedJokeResponse,
                "Failed: \nActual: " + actualJokeResponse + "\nExpected: " + expectedJokeResponse);

        LOGGER.debug("Assert passed: \nExpected = {}, \nActual = {}",
                actualJokeResponse.toString(),
                expectedJokeResponse.toString());
    }

    private RandomJokeResponse formatedResponse(RandomJokeResponse response) {

        RandomJokeResponse formatedResponse = new RandomJokeResponse();

        if (response.getId() != null) {
            formatedResponse.setId("");
        } else {
            LOGGER.error("Id == null");
        }

        if (response.getUrl() != null) {
            formatedResponse.setUrl("");
        } else {
            LOGGER.error("URL == null");
        }

        if (response.getValue() != null) {
            formatedResponse.setValue("");
        } else {
            LOGGER.error("Value == null");
        }

        formatedResponse.setIcon_url(response.getIcon_url());

        return formatedResponse;
    }
}
