package suptech.miag.bookservice.book;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService implements IBookService{
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book addBook(Book book) {
        if(book.getIdauthor() > 0 && !book.getTitle().trim().equals("")){
            List<Book> books = bookRepository.getBookByIdauthor(book.getIdauthor());
            if(books.size() < 100){
                bookRepository.save(book);
            }else {
                throw new RuntimeException("Nombre de livre par autheur atteint.");
            }
        }else{
            throw new RuntimeException("Problème d'ajout.");
        }
        return book;
    }

    @Override
    public List<Book> getBook(Long id_author) {
        List<Book> books = new ArrayList<>();
        if(id_author > 0){
            books = bookRepository.getBookByIdauthor(id_author);
        }
        return books;
    }
}
