package code.liberLibri.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    private String bookTitle;
    private String author;
    private Integer yearPublished;
    private String isbn;
    private Genre genre;
    private Boolean stillReading;
    private Integer pages;
    private Integer pagesRead;

    public Book() {}

    public Book(String bookTitle, String author, Integer yearPublished, String isbn, Genre genre, Boolean stillReading, Integer pages, Integer pagesRead) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
        this.genre = genre;
        this.stillReading = stillReading;
        this.pages = pages;
        this.pagesRead = pagesRead;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(Integer yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Boolean getStillReading() {
        return stillReading;
    }

    public void setStillReading(Boolean stillReading) {
        this.stillReading = stillReading;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getPagesRead() {
        return pagesRead;
    }

    public void setPagesRead(Integer pagesRead) {
        this.pagesRead = pagesRead;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookTitle='" + bookTitle + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                ", isbn='" + isbn + '\'' +
                ", genre=" + genre +
                ", stillReading=" + stillReading +
                ", pages=" + pages +
                ", pagesRead=" + pagesRead +
                '}';
    }
}
