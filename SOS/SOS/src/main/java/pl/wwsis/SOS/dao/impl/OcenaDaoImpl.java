package pl.wwsis.SOS.dao.impl;

import pl.wwsis.SOS.dao.OcenaDao;
import pl.wwsis.SOS.model.Ocena;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class OcenaDaoImpl implements OcenaDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Ocena> pobierzOceny(int idStudenta) {
        TypedQuery<Ocena> query = entityManager.createQuery("SELECT o FROM Ocena o WHERE o.idStudenta = :idStudenta", Ocena.class);
        query.setParameter("idStudenta", idStudenta);
        return query.getResultList();
    }

    @Override
    public void dodajOcene(int idStudenta, int idPrzedmiotu, Ocena ocena) {
        ocena.setIdStudenta(idStudenta);
        ocena.setIdPrzedmiotu(idPrzedmiotu);
        entityManager.persist(ocena);
    }

    @Override
    public void edytujOcene(int idOceny, Ocena nowaOcena) {

    }

    @Override
    public void usunOcene(int idOceny) {

    }
}
