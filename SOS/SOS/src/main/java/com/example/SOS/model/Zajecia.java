package com.example.SOS.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Zajecia")
public class Zajecia {

    @Id
    @GeneratedValue
    @Column(name = "id_zajec")
    private int idZajec;
    @Column(name = "id_przedmiotu")
    private int idPrzedmiotu;
    @Column(name = "id_wykladowcy")
    private int idWykladowcy;
    @Column(name = "id_sali")
    private int idSali;
    @Column(name = "forma_zajec")
    private String formaZajec;
    @Column(name = "status_zajec")
    private String statusZajec;
    @Column(name = "data_zajec")
    private LocalDateTime dataZajec;

}
