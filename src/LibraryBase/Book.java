package LibraryBase;

import java.util.Objects;

public class Book {
    private final String author; //Автор
    private final String nameBook;//Название книги
    private final Integer issueYear;//Год издания

    public Book(String author, String nameBook, Integer issueYear) {
        this.author = author;
        this.nameBook = nameBook;
        this.issueYear = issueYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Integer getIssueYear() {
        return issueYear;
    }

    @Override
    public String toString() {
        return "\nLibraryBase.Book: " +
                "Автор " + author +
                ", название «" + nameBook +
                "», год издания " + issueYear +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return author.equals(book.author) &&
                nameBook.equals(book.nameBook) &&
                issueYear.equals(book.issueYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, nameBook, issueYear);
    }
}
