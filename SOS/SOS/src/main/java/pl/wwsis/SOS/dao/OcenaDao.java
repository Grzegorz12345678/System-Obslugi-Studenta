package pl.wwsis.SOS.dao;

import pl.wwsis.SOS.model.Ocena;

import java.util.List;

public interface OcenaDao {
    List<Ocena> pobierzOceny(int idStudenta);
    void dodajOcene(int idStudenta, int idPrzedmiotu, Ocena ocena);
    void edytujOcene(int idOceny, Ocena nowaOcena);
    void usunOcene(int idOceny);
}
