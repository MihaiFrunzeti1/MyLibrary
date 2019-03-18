package ro.privatelibrary.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.privatelibrary.library.repository.BookRepository;
import ro.privatelibrary.library.domain.Book;
import java.util.List;

@Service
public class BookService {


    private final BookRepository bookRepository;

    @Autowired
    public BookService(final BookRepository bookRepository) {
        this.bookRepository = bookRepository;

    }

    public List<Book> findAllOrderByName() {
        return bookRepository.findAll();
    }
}
