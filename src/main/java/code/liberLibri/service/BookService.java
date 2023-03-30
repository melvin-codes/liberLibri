package code.liberLibri.service;

import code.liberLibri.exception.BookNotFoundException;
import code.liberLibri.model.Book;
import code.liberLibri.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepo bookRepo;

    @Autowired
    public BookService(BookRepo bookRepo) { this.bookRepo = bookRepo;}

    public Book addBook(Book book) {
        return bookRepo.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public Book updateBook(Book book) {
        return bookRepo.save(book);
    }

    public Book getBookById(Integer id) {
        try {
            return bookRepo.getBookById(id);
        } catch(Exception e) {
            throw new BookNotFoundException("Book by ID " + id + " was not found");
        }
    }

    public void deleteBook(Integer id) {
        bookRepo.deleteBookById(id);
    }
}
