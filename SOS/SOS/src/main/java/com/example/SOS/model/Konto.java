package com.example.SOS.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Konta", uniqueConstraints = @UniqueConstraint(columnNames = "login"))
public class Konto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_konta")
    private int idKonta;

    @NotNull
    @Column(name = "id_studenta", nullable = false)
    private int idStudenta;

    @NotNull
    @Size(max = 50)
    @Column(name = "login", nullable = false, unique = true, length = 50)
    private String login;

    @NotNull
    @Size(max = 100)
    @Column(name = "haslo", nullable = false, length = 100)
    private String haslo;

    @Column(name = "blokada", nullable = false)
    private boolean blokada;

    @Column(name = "aktywne", nullable = false)
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