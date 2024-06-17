package com.example.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Przedmiot")
public class Przedmiot {

    @Id
    @GeneratedValue
    @Column(name = "id_przedmiotu")
    private int idPrzedmiotu;
    @Column(name = "nazwa")
    private String nazwa;
    @Column(name = "ECTS")
    private int ECTS;
    @Column(name = "opis")
    private String opis;

}
