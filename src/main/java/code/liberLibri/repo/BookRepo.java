package code.liberLibri.repo;

import code.liberLibri.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepo extends JpaRepository<Book, Integer> {

    void deleteBookById(Integer id);
    Book getBookById(Integer id);
}
