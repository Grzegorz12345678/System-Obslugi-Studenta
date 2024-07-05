package pl.wwsis.SOS.dao.impl;

import pl.wwsis.SOS.dao.StudentDao;
import pl.wwsis.SOS.model.Ocena;
import pl.wwsis.SOS.model.Przedmiot;
import pl.wwsis.SOS.model.Zajecia;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Ocena> pobierzOceny(int idStudenta) {
        Query query = entityManager.createQuery("SELECT o FROM Ocena o WHERE o.student.idStudenta = :idStudenta");
        query.setParameter("idStudenta", idStudenta);
        return query.getResultList();
    }

    @Override
    public List<Zajecia> pobierzZajecia(int idStudenta) {
        Query query = entityManager.createQuery("SELECT z FROM Zajecia z JOIN z.students s WHERE s.idStudenta = :idStudenta");
        query.setParameter("idStudenta", idStudenta);
        return query.getResultList();
    }

    @Override
    public List<Przedmiot> pobierzPrzedmioty(int idStudenta) {
        Query query = entityManager.createQuery("SELECT p FROM Przedmiot p JOIN p.zajecia z JOIN z.students s WHERE s.idStudenta = :idStudenta");
        query.setParameter("idStudenta", idStudenta);
        return query.getResultList();
    }
}
