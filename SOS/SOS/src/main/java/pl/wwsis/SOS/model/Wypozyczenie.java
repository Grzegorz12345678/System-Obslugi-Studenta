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
@Table(name = "Wypozyczenia")
public class Wypozyczenie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_wypozyczenia")
    private int idWypozyczenia;

    @NotNull
    @Column(name = "id_studenta")
    private int idStudenta;

    @NotNull
    @Column(name = "id_ksiazki")
    private int idKsiazki;

    @NotNull
    @Column(name = "data_wypozyczenia")
    private LocalDateTime dataWypozyczenia;

    @Column(name = "data_zwrotu")
    private LocalDateTime dataZwrotu;

    @NotNull
    @Column(name = "status_wypozyczenia", length = 10)
    private String statusWypozyczenia;

    public int getIdWypozyczenia() {
        return idWypozyczenia;
    }

    public void setIdWypozyczenia(int idWypozyczenia) {
        this.idWypozyczenia = idWypozyczenia;
    }

    public int getIdStudenta() {
        return idStudenta;
    }

    public void setIdStudenta(int idStudenta) {
        this.idStudenta = idStudenta;
    }

    public int getIdKsiazki() {
        return idKsiazki;
    }

    public void setIdKsiazki(int idKsiazki) {
        this.idKsiazki = idKsiazki;
    }

    public LocalDateTime getDataWypozyczenia() {
        return dataWypozyczenia;
    }

    public void setDataWypozyczenia(LocalDateTime dataWypozyczenia) {
        this.dataWypozyczenia = dataWypozyczenia;
    }

    public LocalDateTime getDataZwrotu() {
        return dataZwrotu;
    }

    public void setDataZwrotu(LocalDateTime dataZwrotu) {
        this.dataZwrotu = dataZwrotu;
    }

    public String getStatusWypozyczenia() {
        return statusWypozyczenia;
    }

    public void setStatusWypozyczenia(String statusWypozyczenia) {
        this.statusWypozyczenia = statusWypozyczenia;
    }
}
