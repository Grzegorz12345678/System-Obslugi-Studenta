package com.example.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Ksiazki")
public class Ksiazka {

    @Id
    @GeneratedValue
    @Column(name = "id_ksiazki")
    private int idKsiazki;
    @Column(name = "tytul")
    private String tytul;
    @Column(name = "autor")
    private String autor;
    @Column(name = "rok_wydania")
    private int rokWydania;

}
