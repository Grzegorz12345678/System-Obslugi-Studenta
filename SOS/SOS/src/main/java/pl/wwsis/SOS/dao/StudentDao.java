package pl.wwsis.SOS.dao;

import pl.wwsis.SOS.model.Ocena;
import pl.wwsis.SOS.model.Przedmiot;
import pl.wwsis.SOS.model.Zajecia;

import java.util.List;

public interface StudentDao {

    boolean zaloguj(String login, String hasło );
    void zarejestruj(int numerIndeksu, String imie, String nazwisko, String login, String adressEmail, String haslo);
    void wyloguj();
    void zmienHaslo(String stareHaslo, String noweHaslo);
    boolean edytujProfil(String imie, String nazwisko, String email, String haslo);
    void przypomnijHaslo(String login);
    void usunKonto();
    void zablokujKonto();
    List<Ocena> pobierzOceny();
    List<Zajecia> pobierzZajecia();
    List<Przedmiot> pobierzPrzedmioty();
}
