package com.example.SOS.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Platnosci")
public class Platnosci {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_platnosci")
    private int idPlatnosci;

    @Column(name = "id_studenta", nullable = false)
    private int idStudenta;

    @Column(name = "kwota_platnosci", nullable = false)
    private BigDecimal kwotaPlatnosci;

    @Column(name = "data_platnosci", nullable = false)
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

    public BigDecimal getKwotaPlatnosci() {
        return kwotaPlatnosci;
    }

    public void setKwotaPlatnosci(BigDecimal kwotaPlatnosci) {
        this.kwotaPlatnosci = kwotaPlatnosci;
    }

    public LocalDateTime getDataPlatnosci() {
        return dataPlatnosci;
    }

    public void setDataPlatnosci(LocalDateTime dataPlatnosci) {
        this.dataPlatnosci = dataPlatnosci;
    }
}
