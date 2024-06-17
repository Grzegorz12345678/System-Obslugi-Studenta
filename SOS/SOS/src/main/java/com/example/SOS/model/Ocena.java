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

}
