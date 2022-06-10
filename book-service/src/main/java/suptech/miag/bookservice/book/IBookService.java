package suptech.miag.bookservice.book;

import java.util.List;

public interface IBookService {
    Book addBook(Book book);
    List<Book> getBook(Long id_author);
}
