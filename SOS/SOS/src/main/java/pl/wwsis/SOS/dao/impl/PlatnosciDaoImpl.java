
package pl.wwsis.SOS.dao.impl;

import pl.wwsis.SOS.dao.PlatnosciDao;
import pl.wwsis.SOS.model.Platnosci;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class PlatnosciDaoImpl implements PlatnosciDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Platnosci> pobierzPlatnosci(int idStudenta) {
        TypedQuery<Platnosci> query = entityManager.createQuery("SELECT p FROM Platnosci p WHERE p.idStudenta = :idStudenta", Platnosci.class);
        query.setParameter("idStudenta", idStudenta);
        return query.getResultList();
    }

    @Override
    public boolean czyZaplacone(int idStudenta) {
        TypedQuery<Platnosci> query = entityManager.createQuery("SELECT p FROM Platnosci p WHERE p.idStudenta = :idStudenta ORDER BY p.dataPlatnosci DESC", Platnosci.class);
        query.setParameter("idStudenta", idStudenta);
        List<Platnosci> platnosciList = query.getResultList();
        return !platnosciList.isEmpty();
    }

    @Override
    public Platnosci pobierzOstatniaPlatnosc(int idStudenta) {
        TypedQuery<Platnosci> query = entityManager.createQuery("SELECT p FROM Platnosci p WHERE p.idStudenta = :idStudenta ORDER BY p.dataPlatnosci DESC", Platnosci.class);
        query.setParameter("idStudenta", idStudenta);
        List<Platnosci> platnosciList = query.setMaxResults(1).getResultList();
        return platnosciList.isEmpty() ? null : platnosciList.get(0);
    }

    @Override
    public void dodajPlatnosc(int idStudenta, Platnosci platnosc) {
        platnosc.setIdStudenta(idStudenta);
        entityManager.persist(platnosc);
    }
}
