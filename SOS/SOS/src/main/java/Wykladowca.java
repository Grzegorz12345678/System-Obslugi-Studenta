import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Wykladowcy")
public class Wykladowca {

    @Id
    @GeneratedValue
    @Column(name = "id_wykladowcy")
    private int idWykladowcy;
    @Column(name = "imie")
    private String imie;
    @Column(name = "nazwisko")
    private String nazwisko;
    @Column(name = "email")
    private String email;
    @Column(name = "tytul_naukowy")
    private String tytulNaukowy;

}
