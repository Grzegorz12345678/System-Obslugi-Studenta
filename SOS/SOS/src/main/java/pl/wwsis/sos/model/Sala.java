package pl.wwsis.sos.model;

import javax.persistence.*;

@Entity
@Table(name = "Sale")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sali")
    private int idSali;

    @Column(name = "nazwa", nullable = false, length = 100, unique = true)
    private String nazwa;

    @Column(name = "liczba_miejsc", nullable = false)
    private int liczbaMiejsc;


    public int getIdSali() {
        return idSali;
    }

    public void setIdSali(int idSali) {
        this.idSali = idSali;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getLiczbaMiejsc() {
        return liczbaMiejsc;
    }

    public void setLiczbaMiejsc(int liczbaMiejsc) {
        this.liczbaMiejsc = liczbaMiejsc;
    }
}
