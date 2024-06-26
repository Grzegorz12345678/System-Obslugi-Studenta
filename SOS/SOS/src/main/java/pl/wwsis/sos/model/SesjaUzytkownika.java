package pl.wwsis.sos.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sesja_uzytkownika")
public class SesjaUzytkownika {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sesji")
    private int idSesji;

    @Column(name = "id_konta")
    private int idKonta;

    @Column(name = "IP", length = 128)
    private String IP;

    @Column(name = "start_sesji")
    private LocalDateTime startSesji;

    @Column(name = "koniec_sesji")
    private LocalDateTime koniecSesji;

    public int getIdSesji() {
        return idSesji;
    }

    public void setIdSesji(int idSesji) {
        this.idSesji = idSesji;
    }

    public int getIdKonta() {
        return idKonta;
    }

    public void setIdKonta(int idKonta) {
        this.idKonta = idKonta;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public LocalDateTime getStartSesji() {
        return startSesji;
    }

    public void setStartSesji(LocalDateTime startSesji) {
        this.startSesji = startSesji;
    }

    public LocalDateTime getKoniecSesji() {
        return koniecSesji;
    }

    public void setKoniecSesji(LocalDateTime koniecSesji) {
        this.koniecSesji = koniecSesji;
    }
}
