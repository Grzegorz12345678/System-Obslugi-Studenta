package pl.wwsis.SOS.dao.impl;

import pl.wwsis.SOS.dao.StudentDao;
import pl.wwsis.SOS.model.Ocena;
import pl.wwsis.SOS.model.Przedmiot;
import pl.wwsis.SOS.model.Zajecia;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Ocena> pobierzOceny(int idStudenta) {
        TypedQuery<Ocena> query = entityManager.createQuery("SELECT o FROM Ocena o WHERE o.idStudenta = :idStudenta", Ocena.class);
        query.setParameter("idStudenta", idStudenta);
        return query.getResultList();
    }

    @Override
    public List<Zajecia> pobierzZajecia(int idStudenta) {
        TypedQuery<Zajecia> query = entityManager.createQuery("SELECT z FROM Zajecia z JOIN Zapis za ON z.idZajec = za.idZajec WHERE za.idStudenta = :idStudenta", Zajecia.class);
        query.setParameter("idStudenta", idStudenta);
        return query.getResultList();
    }

    @Override
    public List<Przedmiot> pobierzPrzedmioty(int idStudenta) {
        TypedQuery<Przedmiot> query = entityManager.createQuery("SELECT DISTINCT p FROM Przedmiot p JOIN Zajecia z ON p.idPrzedmiotu = z.idPrzedmiotu JOIN Zapis za ON z.idZajec = za.idZajec WHERE za.idStudenta = :idStudenta", Przedmiot.class);
        query.setParameter("idStudenta", idStudenta);
        return query.getResultList();
    }
}
