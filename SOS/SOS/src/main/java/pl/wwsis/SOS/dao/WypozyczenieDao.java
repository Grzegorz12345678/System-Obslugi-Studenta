package pl.wwsis.SOS.dao;

import java.util.Date;

public interface WypozyczenieDao {
    void wypozyczKsiazke(int idStudenta, int idKsiazki, Date termin);
    void zwrocKsiazke(int idKsiazki);
    boolean sprawdzDostepnosc(int idKsiazki);
}
