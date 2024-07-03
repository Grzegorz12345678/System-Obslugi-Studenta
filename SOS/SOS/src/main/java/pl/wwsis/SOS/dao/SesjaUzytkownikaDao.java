package pl.wwsis.SOS.dao;

public interface SesjaUzytkownikaDao {
    void utworzSesje(int idUzytkownika);
    void zakonczSesje(int idUzytkownika);
    boolean czySesjaAktywna(int idUzytkownika);
}

