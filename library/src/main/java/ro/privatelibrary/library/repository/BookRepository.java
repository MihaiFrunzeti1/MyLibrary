package ro.privatelibrary.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.privatelibrary.library.domain.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {

  //  List<Book> findAllByOrderByName();

}
