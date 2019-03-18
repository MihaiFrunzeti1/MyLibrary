package ro.privatelibrary.library.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BOOK")
public class Book implements Serializable {

    @Id
    @Column(name = "ID", unique = true, updatable = false, nullable = false)
    private String id;

    @Column(name = "BOOK_ID")
    private Long bookID;

    @Column(name = "NAME", nullable = false)
    private String name;

    @ManyToMany(mappedBy = "bookList")
    private List<Author> authorList;

    @ManyToOne
    private UserLib userLib;

}
