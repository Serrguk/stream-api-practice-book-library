import LibraryBase.Book;
import LibraryBase.EmailAddress;
import LibraryBase.Library;
import LibraryBase.Reader;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        // Получаем список всех книг, отсортированных по году издания
        List<Book> list = library.getBooks().stream()
                .sorted(Comparator.comparing(Book::getIssueYear))
                .toList();

        System.out.println(list);

        //Получаем список всех емайл адресов читателей
        List<EmailAddress> addresses = library.getReaders().stream()
                .map(Reader::getEmail)
                .map(EmailAddress::new)
                .collect(Collectors.toList());

        System.out.println(addresses);

    }
}