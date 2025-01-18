package api.test_objects;

import java.util.List;
import java.util.Objects;

public class SearchResponse {

    private String code;
    private List<User> data;

    public SearchResponse(String code, List<User> data) {
        this.code = code;
        this.data = data;
    }

    public SearchResponse() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchResponse usersResponse = (SearchResponse) o;
        return Objects.equals(code, usersResponse.code) && Objects.equals(data, usersResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, data);
    }

    @Override
    public String toString() {
        return "Wrapper{" +
                "code='" + code + '\'' +
                ", data=" + data +
                '}';
    }
}
