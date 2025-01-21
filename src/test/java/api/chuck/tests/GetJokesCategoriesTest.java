package api.chuck.tests;


import api.chuck.test_objects.JokesCategories;
import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GetJokesCategoriesTest {

    private static final String URL = "https://api.chucknorris.io/jokes/categories";
    private static final Logger LOGGER = LogManager.getLogger(GetJokesCategoriesTest.class);

    @Test
    public void getJokesCategories() {

        List<String> actual = RestAssured.given()
                .get(URL)
                .then()
                .extract().body().as(new TypeRef<List<String>>() {
                });

        List<String> expected = JokesCategories.categories;

        Assert.assertEquals(actual, expected, "Passed: \nActual: " + actual + "\nExpected: " + expected);

        LOGGER.debug("Passed:\nActaul: " + actual + "\nExpected: " + expected);
    }

}
