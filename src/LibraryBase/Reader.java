package LibraryBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Reader {
    private String fIO;
    private String email;
    private boolean subscriber;
    private List<Book> books;

    public Reader(String fIO, String email, boolean subscriber) {
        this.fIO = fIO;
        this.email = email;
        this.subscriber = subscriber;
        this.books = new ArrayList<>();
    }

    public String getFIO() {
        return fIO;
    }

    public String getEmail() {
        return email;
    }

    public boolean isSubscriber() {
        return subscriber;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reader)) return false;
        Reader reader = (Reader) o;
        return fIO.equals(reader.fIO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fIO);
    }
}
