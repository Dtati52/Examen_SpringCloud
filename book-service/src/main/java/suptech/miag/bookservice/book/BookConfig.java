package suptech.miag.bookservice.book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.sql.Date;

@Configuration
public class BookConfig {
    private final BookRepository bookRepository;
    private final RepositoryRestConfiguration configuration ;

    public BookConfig(BookRepository bookRepository, RepositoryRestConfiguration configuration) {
        this.bookRepository = bookRepository;
        this.configuration = configuration;
    }

    @Bean
    CommandLineRunner init_products(){
        return args -> {
          configuration.exposeIdsFor(Book.class);
          bookRepository.save(new Book("R001","Martin Martin",1L, Date.valueOf("2022-12-06")));
        };
    }
}
