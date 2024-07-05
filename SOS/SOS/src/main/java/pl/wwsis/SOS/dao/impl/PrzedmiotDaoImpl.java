package pl.wwsis.SOS.dao.impl;

import pl.wwsis.SOS.dao.PrzedmiotDao;
import pl.wwsis.SOS.model.Przedmiot;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class PrzedmiotDaoImpl implements PrzedmiotDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Przedmiot> pobierzWszystkiePrzedmioty() {
        Query query = entityManager.createQuery("SELECT p FROM Przedmiot p");
        return query.getResultList();
    }

    @Override
    public Przedmiot pobierzPrzedmiot(int idPrzedmiotu) {
        return entityManager.find(Przedmiot.class, idPrzedmiotu);
    }

    @Override
    public void dodajPrzedmiot(Przedmiot przedmiot) {
        entityManager.persist(przedmiot);
    }

    @Override
    public void edytujPrzedmiot(Przedmiot przedmiot) {
        entityManager.merge(przedmiot);
    }

    @Override
    public void usunPrzedmiot(int idPrzedmiotu) {
        Przedmiot przedmiot = entityManager.find(Przedmiot.class, idPrzedmiotu);
        if (przedmiot != null) {
            entityManager.remove(przedmiot);
        }
    }
}
