
package pl.wwsis.SOS.dao.impl;

import pl.wwsis.SOS.dao.KontoDao;
import pl.wwsis.SOS.model.Konto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class KontoDaoImpl implements KontoDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void zarejestruj(int numerIndeksu, String imie, String nazwisko, String login, String adresEmail, String haslo) {
        Konto konto = new Konto();
        konto.setIdStudenta(numerIndeksu);
        konto.setLogin(login);
        konto.setHaslo(haslo);
        konto.setBlokada(false);
        konto.setAktywne(true);
        entityManager.persist(konto);
    }

    @Override
    public boolean zaloguj(String login, String haslo) {
        TypedQuery<Konto> query = entityManager.createQuery("SELECT k FROM Konto k WHERE k.login = :login AND k.haslo = :haslo AND k.aktywne = true", Konto.class);
        query.setParameter("login", login);
        query.setParameter("haslo", haslo);
        List<Konto> konta = query.getResultList();
        return !konta.isEmpty();
    }

    @Override
    public void wyloguj() {
        // Wylogowanie użytkownika poprzez Spring Security
        SecurityContextHolde.clearContext();
    }


    @Override
    public void zmienHaslo(String stareHaslo, String noweHaslo) {
        TypedQuery<Konto> query = entityManager.createQuery("SELECT k FROM Konto k WHERE k.haslo = :stareHaslo AND k.aktywne = true", Konto.class);
        query.setParameter("stareHaslo", stareHaslo);
        List<Konto> konta = query.getResultList();
        if (!konta.isEmpty()) {
            Konto konto = konta.get(0);
            konto.setHaslo(noweHaslo);
            entityManager.merge(konto);
        }
    }

    @Override
    public boolean edytujProfil(String imie, String nazwisko, String email, String haslo) {
        TypedQuery<Konto> query = entityManager.createQuery("SELECT k FROM Konto k WHERE k.haslo = :haslo AND k.aktywne = true", Konto.class);
        query.setParameter("haslo", haslo);
        List<Konto> konta = query.getResultList();
        if (!konta.isEmpty()) {
            Konto konto = konta.get(0);
            entityManager.merge(konto);
            return true;
        }
        return false;
    }

    @Override
    public void przypomnijHaslo(String login) {

    }

    @Override
    public void usunKonto(int idKonta) {
        Konto konto = entityManager.find(Konto.class, idKonta);

        if (konto != null) {
            entityManager.remove(konto);
        }
    }


    @Override
    public void zablokujKonto(int idKonta) {
        Konto konto = entityManager.find(Konto.class, idKonta);
        if (konto != null) {
            konto.setBlokada(true);
            entityManager.merge(konto);
        }
    }

    @Override
    public boolean jestZablokowane(String login) {
        TypedQuery<Konto> query = entityManager.createQuery("SELECT k FROM Konto k WHERE k.login = :login AND k.blokada = true", Konto.class);
        query.setParameter("login", login);
        List<Konto> konta = query.getResultList();
        return !konta.isEmpty();
    }
}
