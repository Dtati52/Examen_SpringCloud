package suptech.miag.authorservice.author;

import org.springframework.stereotype.Service;

@Service
public class AuthorService implements IAuthorService{

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @Override
    public Author add(Author author) {
        if(author.getSexe().equals("Masculin") && author.getName().contains("Mr")){
            authorRepository.save(author);
        }else if(author.getSexe().equals("Feminin") && author.getName().contains("Mdm")){
            authorRepository.save(author);
        }else {
            throw new RuntimeException("Erreur d'ajout.");
        }
        return author;
    }
}
