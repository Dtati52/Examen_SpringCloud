package suptech.miag.authorservice.author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(exported = false)
public interface AuthorRepository extends JpaRepository<Author,String>{
}
