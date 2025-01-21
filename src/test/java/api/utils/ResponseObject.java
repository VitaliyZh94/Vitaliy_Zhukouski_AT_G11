package api.utils;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class ResponseObject {

    public static <T> T getResponse( String url, Class<T> clazz) {
        return RestAssured.given()
                .spec(getSpec())
                .when()
                .get(url)
                .then()
                .extract().body().as(clazz);
    }

    public static String getResponse( String url) {
        return RestAssured.given()
                .spec(getSpec())
                .when()
                .get(url)
                .then()
                .extract().asString();
    }

    private static RequestSpecification getSpec() {
        return new RequestSpecBuilder()
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
    }
}
