package api.chuck.test_objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RandomJokeResponse {

    String icon_url;
    String id;
    String url;
    String value;

    public RandomJokeResponse(String icon_url, String id, String url, String value) {
        this.icon_url = icon_url;
        this.id = id;
        this.url = url;
        this.value = value;
    }

    public RandomJokeResponse() {
    }

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        RandomJokeResponse that = (RandomJokeResponse) o;
        return Objects.equals(icon_url, that.icon_url) && Objects.equals(id, that.id) && Objects.equals(url, that.url) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(icon_url, id, url, value);
    }

    @Override
    public String toString() {
        return "ResponseJoke{" +
                "icon_url='" + icon_url + '\'' +
                ", id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
