package suptech.miag.authorservice.author;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/authors/")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping("add")
    public Author addBook(@RequestBody Author author){
        try {
            return authorService.add(author);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
