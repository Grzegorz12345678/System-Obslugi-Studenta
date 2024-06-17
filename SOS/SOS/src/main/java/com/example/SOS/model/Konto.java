package com.example.SOS.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Konta")
public class Konto {

    @Id
    @GeneratedValue
    @Column(name = "id_konta")
    private int idKonta;
    @Column(name = "id_studenta")
    private int idStudenta;
    @Column(name = "login")
    private String login;
    @Column(name = "haslo")
    private String haslo;
    @Column(name = "blokada")
    private boolean blokada;
    @Column(name = "aktywne")
    private boolean aktywne;



}
