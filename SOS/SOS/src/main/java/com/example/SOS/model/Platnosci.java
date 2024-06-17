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
}
