package com.example.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Oceny")
public class Ocena {

    @Id
    @GeneratedValue
    @Column(name = "id_oceny")
    private int idOceny;
    @Column(name = "id_studenta")
    private int idStudenta;
    @Column(name = "id_przedmiotu")
    private int idPrzedmiotu;
    @Column(name = "ocena")
    private double ocena;
    @Column(name = "termin")
    private int termin;
    @Column(name = "data_wpisu")
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
