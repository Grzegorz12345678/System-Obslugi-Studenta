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


    public int getIdKonta() {
        return idKonta;
    }

    public void setIdKonta(int idKonta) {
        this.idKonta = idKonta;
    }

    public int getIdStudenta() {
        return idStudenta;
    }

    public void setIdStudenta(int idStudenta) {
        this.idStudenta = idStudenta;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public boolean isBlokada() {
        return blokada;
    }

    public void setBlokada(boolean blokada) {
        this.blokada = blokada;
    }

    public boolean isAktywne() {
        return aktywne;
    }

    public void setAktywne(boolean aktywne) {
        this.aktywne = aktywne;
    }
}
