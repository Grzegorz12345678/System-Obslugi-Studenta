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

}
