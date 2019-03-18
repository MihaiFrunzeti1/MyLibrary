package ro.privatelibrary.library.rest;

import io.swagger.annotations.Api;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.privatelibrary.library.service.BookService;

import javax.ws.rs.Produces;
import ro.privatelibrary.library.domain.Book;
import java.util.List;

@Data
@RestController
@RequestMapping("/book-class")
@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
@Api(tags = "book-class", value = "/book-class", description = "Operations for books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;

    }

    @GetMapping("/all")
    public List<Book> findAllOrderByName() {
        return bookService.findAllOrderByName();
    }
}
