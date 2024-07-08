package pl.wwsis.SOS.dao.impl;

import pl.wwsis.SOS.dao.OcenaDao;
import pl.wwsis.SOS.model.Ocena;

import java.util.List;

public class OcenaDaoImpl implements OcenaDao {
    @Override
    public List<Ocena> pobierzOceny(int idStudenta) {
        return null;
    }

    @Override
    public void dodajOcene(int idStudenta, int idPrzedmiotu, Ocena ocena) {

    }

    @Override
    public void edytujOcene(int idOceny, Ocena nowaOcena) {

    }

    @Override
    public void usunOcene(int idOceny) {

    }
}
