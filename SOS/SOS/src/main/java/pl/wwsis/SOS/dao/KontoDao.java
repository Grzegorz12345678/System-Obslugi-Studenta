package pl.wwsis.SOS.dao;

public interface KontoDao {
    void zarejestruj(int numerIndeksu, String imie, String nazwisko, String login, String adresEmail, String haslo);
    boolean zaloguj(String login, String haslo);
    void wyloguj();
    void zmienHaslo(String stareHaslo, String noweHaslo);
    boolean edytujProfil(String imie, String nazwisko, String email, String haslo);
    void przypomnijHaslo(String login);
    void usunKonto();
    void zablokujKonto();
    boolean jestZablokowane(String login);
}
