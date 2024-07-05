package pl.wwsis.SOS.dao;

import pl.wwsis.SOS.model.Ocena;

public interface WykladowcaDao {
    void dodajOcene(Ocena ocena);
    void edytujOcene(Ocena ocena);
    void usunOcene(Ocena ocena);

}
