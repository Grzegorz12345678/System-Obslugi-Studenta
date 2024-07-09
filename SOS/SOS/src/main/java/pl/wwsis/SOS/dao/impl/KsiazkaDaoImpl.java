package pl.wwsis.SOS.dao.impl;

import pl.wwsis.SOS.dao.KsiazkaDao;
import pl.wwsis.SOS.model.Ksiazka;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class KsiazkaDaoImpl implements KsiazkaDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Ksiazka> pobierzWszystkieKsiazki() {
        TypedQuery<Ksiazka> query = entityManager.createQuery("SELECT k FROM Ksiazka k", Ksiazka.class);
        return query.getResultList();
    }

    @Override
    public Ksiazka pobierzKsiazke(int idKsiazki) {
        return entityManager.find(Ksiazka.class, idKsiazki);
    }

    @Override
    public void dodajKsiazke(Ksiazka ksiazka) {
        entityManager.persist(ksiazka);
    }

    @Override
    public void edytujKsiazke(Ksiazka ksiazka) {
        Ksiazka istniejącaKsiazka = entityManager.find(Ksiazka.class, ksiazka.getIdKsiazki());
        if (istniejącaKsiazka != null) {
            istniejącaKsiazka.setTytul(ksiazka.getTytul());
            istniejącaKsiazka.setAutor(ksiazka.getAutor());
            istniejącaKsiazka.setRokWydania(ksiazka.getRokWydania());
            entityManager.merge(istniejącaKsiazka);
        }
    }

    @Override
    public void usunKsiazke(int idKsiazki) {
        Ksiazka ksiazka = entityManager.find(Ksiazka.class, idKsiazki);
        if (ksiazka != null) {
            entityManager.remove(ksiazka);
        }
    }
}
