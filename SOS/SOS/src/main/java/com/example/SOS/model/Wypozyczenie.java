package com.example.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Wypozyczenia")
public class Wypozyczenie {

    @Id
    @GeneratedValue
    @Column(name = "id_wypozyczenia")
    private int idWypozyczenia;
    @Column(name = "id_studenta")
    private int idStudenta;
    @Column(name = "id_ksiazki")
    private int idKsiazki;
    @Column(name = "data_wypozyczenia")
    private LocalDateTime dataWypozyczenia;
    @Column(name = "data_zwrotu")
    private LocalDateTime dataZwrotu;
    @Column(name = "status_wypozyczenia")
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
