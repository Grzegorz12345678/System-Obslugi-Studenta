package pl.wwsis.SOS.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.wwsis.SOS.dao.WykladowcaDao;
import pl.wwsis.SOS.model.Ocena;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class WykladowcaDaoImpl implements WykladowcaDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void dodajOcene(Ocena ocena) {
        entityManager.persist(ocena);
    }

    @Override
    public void edytujOcene(Ocena ocena) {
        entityManager.merge(ocena);
    }

    @Override
    public void usunOcene(Ocena ocena) {
        Ocena mergedOcena = entityManager.merge(ocena);
        entityManager.remove(mergedOcena);
    }
}
