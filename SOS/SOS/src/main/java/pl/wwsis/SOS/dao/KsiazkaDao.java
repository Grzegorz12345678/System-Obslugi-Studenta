package pl.wwsis.SOS.dao;

import pl.wwsis.SOS.model.Ksiazka;

import java.util.List;

public interface KsiazkaDao {
    List<Ksiazka> pobierzWszystkieKsiazki();
    Ksiazka pobierzKsiazke(int idKsiazki);
    void dodajKsiazke(Ksiazka ksiazka);
    void edytujKsiazke(Ksiazka ksiazka);
    void usunKsiazke(int idKsiazki);
}

