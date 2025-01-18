package api.test_objects;

import java.util.Objects;

public class SearchRequest {
    String user = "";
    boolean strict;

    public SearchRequest() {
    }

    public SearchRequest(String user, boolean strict) {
        this.user = user;
        this.strict = strict;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean isStrict() {
        return strict;
    }

    public void setStrict(boolean strict) {
        this.strict = strict;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchRequest searchRequest = (SearchRequest) o;
        return strict == searchRequest.strict && Objects.equals(user, searchRequest.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, strict);
    }

    @Override
    public String toString() {
        return "api.Search{" +
                "user='" + user + '\'' +
                ", strict=" + strict +
                '}';
    }
}
