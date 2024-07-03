package pl.wwsis.SOS.dao;

import pl.wwsis.SOS.model.Przedmiot;

import java.util.List;

public interface PrzedmiotDao {
    List<Przedmiot> pobierzWszystkiePrzedmioty();
    Przedmiot pobierzPrzedmiot(int idPrzedmiotu);

}

