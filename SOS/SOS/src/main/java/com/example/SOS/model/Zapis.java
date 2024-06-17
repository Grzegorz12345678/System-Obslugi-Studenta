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

}
