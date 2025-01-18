package api.tests;

import api.test_objects.SearchRequest;
import api.test_objects.User;
import api.test_objects.SearchResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.io.File;
import java.io.IOException;
import java.util.List;

public abstract class SearchBaseTest {

    protected static final String path = "src/test/resources/users/";
    protected static final String fileName = "users.json";

    private static final String URL = "http://178.124.206.46:8001/app/ws/";

    protected ObjectMapper objectMapper = new ObjectMapper();

    protected RequestSpecification getSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(URL)
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
    }

    protected SearchResponse getUsersResponse(String user, boolean strict) {
        return RestAssured.given()
                .spec(getSpec())
                .body(new SearchRequest(user, strict))
                .when()
                .post()
                .then()
                .extract().body().as(SearchResponse.class);
    }

    protected List<User> getTestUsersFromJson() throws IOException {
        SearchResponse testUsersResponse = objectMapper.readValue(new File(path + fileName), SearchResponse.class);
        return testUsersResponse.getData();
    }
}