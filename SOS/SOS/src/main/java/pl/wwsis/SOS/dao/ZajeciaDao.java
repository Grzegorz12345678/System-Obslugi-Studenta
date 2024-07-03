package pl.wwsis.SOS.dao;

import pl.wwsis.SOS.model.Zajecia;

import java.util.List;

public interface ZajeciaDao {
    List<Zajecia> pobierzWszystkieZajecia();
    Zajecia pobierzZajecia(int idZajecia);
    void dodajZajecia(Zajecia zajecia);
    void edytujZajecia(Zajecia zajecia);
    void usunZajecia(int idZajecia);
}

