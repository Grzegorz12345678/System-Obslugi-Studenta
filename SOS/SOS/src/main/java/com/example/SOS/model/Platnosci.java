package com.example.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Platnosci")
public class Platnosci {

    @Id
    @GeneratedValue
    @Column(name = "id_platnosci")
    private int idPlatnosci;
    @Column(name = "id_studenta")
    private int idStudenta;
    @Column(name = "kwota_platnosci")
    private double kwotaPlatnosci; // można dać BigDecimal
    @Column(name = "data_platnosci")
    private LocalDateTime dataPlatnosci;

    public int getIdPlatnosci() {
        return idPlatnosci;
    }

    public void setIdPlatnosci(int idPlatnosci) {
        this.idPlatnosci = idPlatnosci;
    }

    public int getIdStudenta() {
        return idStudenta;
    }

    public void setIdStudenta(int idStudenta) {
        this.idStudenta = idStudenta;
    }

    public double getKwotaPlatnosci() {
        return kwotaPlatnosci;
    }

    public void setKwotaPlatnosci(double kwotaPlatnosci) {
        this.kwotaPlatnosci = kwotaPlatnosci;
    }

    public LocalDateTime getDataPlatnosci() {
        return dataPlatnosci;
    }

    public void setDataPlatnosci(LocalDateTime dataPlatnosci) {
        this.dataPlatnosci = dataPlatnosci;
    }
}
