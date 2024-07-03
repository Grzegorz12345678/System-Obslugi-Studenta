package pl.wwsis.SOS.dao;

import pl.wwsis.SOS.model.Przedmiot;
import pl.wwsis.SOS.model.Student;

public interface ZapisDao {
    void zapiszStudenta(int idStudenta, int idPrzedmiotu);
    void wypiszStudenta(int idStudenta, int idPrzedmiotu);
    boolean czyZapisany(int idStudenta, int idPrzedmiotu);
}
