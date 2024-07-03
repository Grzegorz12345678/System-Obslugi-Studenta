package pl.wwsis.SOS.dao;

import pl.wwsis.SOS.model.Wypozyczenie;

import java.util.Date;
import java.util.List;

public interface WypozyczenieDao {
    void wypozyczKsiazke(int idStudenta, int idKsiazki, Date termin);
    void zwrocKsiazke(int idKsiazki);
    boolean sprawdzDostepnosc(int idKsiazki);
    List<Wypozyczenie> pobierzWypozyczenia(int idStudenta);
}
