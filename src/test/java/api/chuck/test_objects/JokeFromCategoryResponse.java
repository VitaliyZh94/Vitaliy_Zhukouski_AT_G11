package api.chuck.test_objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JokeFromCategoryResponse {

    String value;

    public JokeFromCategoryResponse(String value) {
        this.value = value;
    }

    public JokeFromCategoryResponse() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JokeFromCategoryResponse that = (JokeFromCategoryResponse) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return "JokeFromCategoryResponse{" +
                "value='" + value + '\'' +
                '}';
    }
}
