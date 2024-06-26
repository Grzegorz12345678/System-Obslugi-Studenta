package pl.wwsis.sos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Wykladowcy")
public class Wykladowca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_wykladowcy")
    private int idWykladowcy;

    @Column(name = "imie", length = 50)
    private String imie;

    @Column(name = "nazwisko", length = 50)
    private String nazwisko;

    @Column(name = "email", length = 100, unique = true)
    private String email;

    @Column(name = "tytul_naukowy", length = 50)
    private String tytulNaukowy;

    public int getIdWykladowcy() {
        return idWykladowcy;
    }

    public void setIdWykladowcy(int idWykladowcy) {
        this.idWykladowcy = idWykladowcy;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTytulNaukowy() {
        return tytulNaukowy;
    }

    public void setTytulNaukowy(String tytulNaukowy) {
        this.tytulNaukowy = tytulNaukowy;
    }

}
