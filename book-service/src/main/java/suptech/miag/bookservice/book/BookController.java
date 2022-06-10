package suptech.miag.bookservice.book;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books/")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @PostMapping("add")
    public Book addBook(@RequestBody Book book){
        try {
            return bookService.addBook(book);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    @GetMapping("get/{id}")
    public List<Book> getBook(@PathVariable(name = "id") Long id_author){
        try {
            return bookService.getBook(id_author);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
