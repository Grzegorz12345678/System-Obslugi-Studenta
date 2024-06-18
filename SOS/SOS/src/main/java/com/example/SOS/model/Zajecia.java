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


    public int getIdZajec() {
        return idZajec;
    }

    public void setIdZajec(int idZajec) {
        this.idZajec = idZajec;
    }

    public int getIdPrzedmiotu() {
        return idPrzedmiotu;
    }

    public void setIdPrzedmiotu(int idPrzedmiotu) {
        this.idPrzedmiotu = idPrzedmiotu;
    }

    public int getIdWykladowcy() {
        return idWykladowcy;
    }

    public void setIdWykladowcy(int idWykladowcy) {
        this.idWykladowcy = idWykladowcy;
    }

    public int getIdSali() {
        return idSali;
    }

    public void setIdSali(int idSali) {
        this.idSali = idSali;
    }

    public String getFormaZajec() {
        return formaZajec;
    }

    public void setFormaZajec(String formaZajec) {
        this.formaZajec = formaZajec;
    }

    public String getStatusZajec() {
        return statusZajec;
    }

    public void setStatusZajec(String statusZajec) {
        this.statusZajec = statusZajec;
    }

    public LocalDateTime getDataZajec() {
        return dataZajec;
    }

    public void setDataZajec(LocalDateTime dataZajec) {
        this.dataZajec = dataZajec;
    }
}
