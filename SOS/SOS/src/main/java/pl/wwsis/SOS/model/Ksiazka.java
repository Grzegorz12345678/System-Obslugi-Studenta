package pl.wwsis.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Ksiazki")
public class Ksiazka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ksiazki")
    private int idKsiazki;

    @NotNull
    @Size(max = 100)
    @Column(name = "tytul", nullable = false, length = 100)
    private String tytul;

    @NotNull
    @Size(max = 100)
    @Column(name = "autor", nullable = false, length = 100)
    private String autor;

    @NotNull
    @Column(name = "rok_wydania", nullable = false)
    private int rokWydania;



    public int getIdKsiazki() {
        return idKsiazki;
    }

    public void setIdKsiazki(int idKsiazki) {
        this.idKsiazki = idKsiazki;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }
}
