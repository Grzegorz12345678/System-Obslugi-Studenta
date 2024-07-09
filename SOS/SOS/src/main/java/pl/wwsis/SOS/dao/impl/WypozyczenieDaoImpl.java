
package pl.wwsis.SOS.dao.impl;

import pl.wwsis.SOS.dao.WypozyczenieDao;
import pl.wwsis.SOS.model.Wypozyczenie;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Repository
@Transactional
public class WypozyczenieDaoImpl implements WypozyczenieDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void wypozyczKsiazke(int idStudenta, int idKsiazki, Date termin) {
        Wypozyczenie wypozyczenie = new Wypozyczenie();
        wypozyczenie.setIdStudenta(idStudenta);
        wypozyczenie.setIdKsiazki(idKsiazki);
        wypozyczenie.setDataWypozyczenia(LocalDateTime.now());
        wypozyczenie.setStatusWypozyczenia("WYPOZYCZONE");
        entityManager.persist(wypozyczenie);
    }

    @Override
    public void zwrocKsiazke(int idKsiazki) {
        TypedQuery<Wypozyczenie> query = entityManager.createQuery(
                "SELECT w FROM Wypozyczenie w WHERE w.idKsiazki = :idKsiazki AND w.statusWypozyczenia = 'WYPOZYCZONE'",
                Wypozyczenie.class);
        query.setParameter("idKsiazki", idKsiazki);
        List<Wypozyczenie> wypozyczenia = query.getResultList();

        if (!wypozyczenia.isEmpty()) {
            Wypozyczenie wypozyczenie = wypozyczenia.get(0);
            wypozyczenie.setDataZwrotu(LocalDateTime.now());
            wypozyczenie.setStatusWypozyczenia("ZWROCONE");
            entityManager.merge(wypozyczenie);
        }
    }

    @Override
    public boolean sprawdzDostepnosc(int idKsiazki) {
        TypedQuery<Wypozyczenie> query = entityManager.createQuery(
                "SELECT w FROM Wypozyczenie w WHERE w.idKsiazki = :idKsiazki AND w.statusWypozyczenia = 'WYPOZYCZONE'",
                Wypozyczenie.class);
        query.setParameter("idKsiazki", idKsiazki);
        List<Wypozyczenie> wypozyczenia = query.getResultList();
        return wypozyczenia.isEmpty();
    }

    @Override
    public List<Wypozyczenie> pobierzWypozyczenia(int idStudenta) {
        TypedQuery<Wypozyczenie> query = entityManager.createQuery(
                "SELECT w FROM Wypozyczenie w WHERE w.idStudenta = :idStudenta",
                Wypozyczenie.class);
        query.setParameter("idStudenta", idStudenta);
        return query.getResultList();
    }
}
