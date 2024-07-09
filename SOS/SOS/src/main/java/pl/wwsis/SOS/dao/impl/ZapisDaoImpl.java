package pl.wwsis.SOS.dao.impl;

import pl.wwsis.SOS.dao.ZapisDao;
import pl.wwsis.SOS.model.Zapis;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.time.LocalDateTime;
import java.util.List;

@Repository
@Transactional
public class ZapisDaoImpl implements ZapisDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void zapiszStudenta(int idStudenta, int idPrzedmiotu) {
        Zapis zapis = new Zapis();
        zapis.setIdStudenta(idStudenta);
        zapis.setIdZajec(idPrzedmiotu);
        zapis.setDataZapisu(LocalDateTime.now());
        zapis.setTypZapisu("zapis");
        zapis.setStatus("aktywny");
        entityManager.persist(zapis);
    }

    @Override
    public void wypiszStudenta(int idStudenta, int idPrzedmiotu) {
        TypedQuery<Zapis> query = entityManager.createQuery(
                "SELECT z FROM Zapis z WHERE z.idStudenta = :idStudenta AND z.idZajec = :idZajec AND z.status = 'aktywny'",
                Zapis.class);
        query.setParameter("idStudenta", idStudenta);
        query.setParameter("idZajec", idPrzedmiotu);
        List<Zapis> zapisy = query.getResultList();

        if (!zapisy.isEmpty()) {
            Zapis zapis = zapisy.get(0);
            zapis.setStatus("wypisany");
            entityManager.merge(zapis);
        }
    }

    @Override
    public boolean czyZapisany(int idStudenta, int idPrzedmiotu) {
        TypedQuery<Zapis> query = entityManager.createQuery(
                "SELECT z FROM Zapis z WHERE z.idStudenta = :idStudenta AND z.idZajec = :idZajec AND z.status = 'aktywny'",
                Zapis.class);
        query.setParameter("idStudenta", idStudenta);
        query.setParameter("idZajec", idPrzedmiotu);
        List<Zapis> zapisy = query.getResultList();
        return !zapisy.isEmpty();
    }
}
