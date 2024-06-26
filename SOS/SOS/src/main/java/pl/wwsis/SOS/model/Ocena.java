package pl.wwsis.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "Oceny")
public class Ocena {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_oceny")
    private int idOceny;

    @NotNull
    @Column(name = "id_studenta", nullable = false)
    private int idStudenta;

    @NotNull
    @Column(name = "id_przedmiotu", nullable = false)
    private int idPrzedmiotu;

    @NotNull
    @Column(name = "ocena", nullable = false)
    private double ocena;

    @NotNull
    @Column(name = "termin", nullable = false)
    private int termin;

    @NotNull
    @Column(name = "data_wpisu", nullable = false)
    private LocalDateTime dataWpisu;


    public int getIdOceny() {
        return idOceny;
    }

    public void setIdOceny(int idOceny) {
        this.idOceny = idOceny;
    }

    public int getIdStudenta() {
        return idStudenta;
    }

    public void setIdStudenta(int idStudenta) {
        this.idStudenta = idStudenta;
    }

    public int getIdPrzedmiotu() {
        return idPrzedmiotu;
    }

    public void setIdPrzedmiotu(int idPrzedmiotu) {
        this.idPrzedmiotu = idPrzedmiotu;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public int getTermin() {
        return termin;
    }

    public void setTermin(int termin) {
        this.termin = termin;
    }

    public LocalDateTime getDataWpisu() {
        return dataWpisu;
    }

    public void setDataWpisu(LocalDateTime dataWpisu) {
        this.dataWpisu = dataWpisu;
    }
}
