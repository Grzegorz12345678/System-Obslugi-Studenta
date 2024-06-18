package com.example.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Zapisy")
public class Zapis {

    @Id
    @GeneratedValue
    @Column(name = "id_zapisu")
    private int idZapisu;
    @Column(name = "id_studenta")
    private int idStudenta;
    @Column(name = "id_zajec")
    private int idZajec;
    @Column(name = "data_zapisu")
    private LocalDateTime dataZapisu;
    @Column(name = "typ_zapisu")
    private String typZapisu;
    @Column(name = "status")
    private String status;

    public int getIdZapisu() {
        return idZapisu;
    }

    public void setIdZapisu(int idZapisu) {
        this.idZapisu = idZapisu;
    }

    public int getIdStudenta() {
        return idStudenta;
    }

    public void setIdStudenta(int idStudenta) {
        this.idStudenta = idStudenta;
    }

    public int getIdZajec() {
        return idZajec;
    }

    public void setIdZajec(int idZajec) {
        this.idZajec = idZajec;
    }

    public LocalDateTime getDataZapisu() {
        return dataZapisu;
    }

    public void setDataZapisu(LocalDateTime dataZapisu) {
        this.dataZapisu = dataZapisu;
    }

    public String getTypZapisu() {
        return typZapisu;
    }

    public void setTypZapisu(String typZapisu) {
        this.typZapisu = typZapisu;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
