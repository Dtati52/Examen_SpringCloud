package suptech.miag.bookservice.book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Book {
    @Id @Column(length = 30)
    private String isbn ;
    @Column(unique = true)
    private String title ;
    private Long idauthor ;
    private Date date ;
}
