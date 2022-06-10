package suptech.miag.authorservice.author;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;


@Configuration
public class AuthorConfig {
    private final AuthorRepository authorRepository;
    private final RepositoryRestConfiguration configuration ;

    public AuthorConfig(AuthorRepository authorRepository, RepositoryRestConfiguration configuration) {
        this.authorRepository = authorRepository;
        this.configuration = configuration;
    }

    @Bean
    CommandLineRunner init_products(){
        return args -> {
          configuration.exposeIdsFor(Author.class);
          authorRepository.save(new Author("","Karl Max", "Masculin"));
        };
    }
}
