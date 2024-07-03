package pl.wwsis.SOS.dao;

import pl.wwsis.SOS.model.Platnosci;

import java.util.List;

public interface PlatnosciDao {
    List<Platnosci> pobierzPlatnosci(int idStudenta);
    boolean czyZaplacone(int idStudenta);
    Platnosci pobierzOstatniaPlatnosc(int idStudenta);
    void dodajPlatnosc(int idStudenta, Platnosci platnosc);
}

