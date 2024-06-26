package pl.wwsis.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Zapisy")
public class Zapis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_zapisu")
    private int idZapisu;

    @Column(name = "id_studenta", nullable = false)
    private int idStudenta;

    @Column(name = "id_zajec", nullable = false)
    private int idZajec;

    @Column(name = "data_zapisu")
    private LocalDateTime dataZapisu;

    @Column(name = "typ_zapisu", length = 50)
    private String typZapisu;

    @Column(name = "status", length = 20)
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
