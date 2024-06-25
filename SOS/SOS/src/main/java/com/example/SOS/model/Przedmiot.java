package com.example.SOS.model;

import javax.persistence.*;

@Entity
@Table(name = "Przedmiot")
public class Przedmiot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_przedmiotu")
    private int idPrzedmiotu;

    @Column(name = "nazwa", nullable = false, length = 100, unique = true)
    private String nazwa;

    @Column(name = "ECTS", nullable = false)
    private int ECTS;

    @Column(name = "opis", length = 500)
    private String opis;


    public int getIdPrzedmiotu() {
        return idPrzedmiotu;
    }

    public void setIdPrzedmiotu(int idPrzedmiotu) {
        this.idPrzedmiotu = idPrzedmiotu;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getECTS() {
        return ECTS;
    }

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
