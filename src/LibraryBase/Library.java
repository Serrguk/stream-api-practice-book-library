package LibraryBase;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        init();
    }

    private void init() {
        books = new ArrayList<>();

        books.add(new Book("Питер Уоттс", "Ложная слепота", 2005));
        books.add(new Book("Питер Уоттс", "Эхопраксия", 2008));
        books.add(new Book("Карл Саган", "Контакт", 1983));
        books.add(new Book("Гарри Гаррисон", "Неукротимая планета", 2005));
        books.add(new Book("Джером Дэвид Селинджер", "Над пропастью во ржи", 1951));
        books.add(new Book("Роберд Говард", "Конан-Варвар", 1987));
        books.add(new Book("Станислав Лем", "Солярис", 1960));

        readers = new ArrayList<>();

        readers.add(new Reader("Иванов Иван Иванович", "ivanov@gmail.com", true));
        readers.add(new Reader("Сидоров Чунгук Лясович", "sidorov@gmail.com", true));
        readers.add(new Reader("Чаптыков Энрике Побызакович", "chaptyk@gmail.com", true));
        readers.add(new Reader("Лоза Юрий Котьянович", "lozzza@gmail.com", false));
        readers.add(new Reader("Шпик Павел Николаевич", "schpick@gmail.com", true));
        readers.add(new Reader("Сарасти Юкка Упырьевич", "yukka@gmail.com", true));
        readers.add(new Reader("Падлов Лоскутик Соулсович", "padla@gmail.com", false));

        readers.get(0).getBooks().add(books.get(1));
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }
}
