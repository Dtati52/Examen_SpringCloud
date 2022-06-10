package suptech.miag.bookservice.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book,String>{
    List<Book> getBookByIdauthor(Long id_author);
}
