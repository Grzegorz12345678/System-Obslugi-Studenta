package pl.wwsis.SOS.dao;

import pl.wwsis.SOS.model.Ocena;
import pl.wwsis.SOS.model.Przedmiot;
import pl.wwsis.SOS.model.Zajecia;

import java.util.List;

public interface StudentDao {
    List<Ocena> pobierzOceny(int idStudenta);
    List<Zajecia> pobierzZajecia(int idStudenta);
    List<Przedmiot> pobierzPrzedmioty(int idStudenta);
}
