package ro.privatelibrary.library.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AUTHOR")
public class Author implements Serializable {

    @Id
    @Column(name = "AUTHOR_ID", unique = true, updatable = false, nullable = false)
    private String id;

    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Column(name = "CNP", nullable = false)
    @NotNull
    private String cnp;

    @ManyToMany
    private List<Book> bookList;
}
