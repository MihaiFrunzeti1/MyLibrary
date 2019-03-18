package ro.privatelibrary.library.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER_LIB")
public class UserLib implements Serializable {

    @Id
    @Column(name = "USER_ID", unique = true, updatable = false, nullable = false)
    private String id;

    @Column(name = "FIRST_NAME", nullable = false)
    @NotNull
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false)
    @NotNull
    private String LastName;

    @Column(name = "PASSWORD", nullable = false)
    @NotNull
    private String password;

    @Column(name = "START_ACTIVE_DATE")
    private Date startActiveDate;

    @Column(name = "END_ACTIVE_DATE")
    private Date endActiveDate;

    @Column(name = "ACTIVE")
    @NotNull
    private Boolean active;

    @Column(name="ISADMIN")
    private Boolean admin;

    //daca nu pun EAGER, vine o lista goala; de obicei se lasa default adica eager, pt ca nu e necesar sa aduci tot odata, se incarca memoria aiurea; ORICUM EEAGER NU PREA E RECOMANDAT
    @OneToMany(mappedBy = "userLib", fetch = FetchType.EAGER, cascade=CascadeType.REMOVE)
    private List<Book> bookList;
}
