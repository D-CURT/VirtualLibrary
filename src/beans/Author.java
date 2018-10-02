package beans;

import java.util.List;

public class Author {
    private int id;
    private String name;
    private String surname;
    private List<Book> books;

    public Author() {
    }

    public Author(String name, String surname, List<Book> books) {
        this.name = name;
        this.surname = surname;
        this.books = books;
    }

    public Author(int id, String name, String surname, List<Book> books) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<Book> getBooks() {
        return books;
    }
}