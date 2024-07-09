package pl.wwsis.SOS.dao.impl;

import pl.wwsis.SOS.dao.ZajeciaDao;
import pl.wwsis.SOS.model.Zajecia;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class ZajeciaDaoImpl implements ZajeciaDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Zajecia> pobierzWszystkieZajecia() {
        TypedQuery<Zajecia> query = entityManager.createQuery("SELECT z FROM Zajecia z", Zajecia.class);
        return query.getResultList();
    }

    @Override
    public Zajecia pobierzZajecia(int idZajecia) {
        return entityManager.find(Zajecia.class, idZajecia);
    }

    @Override
    public void dodajZajecia(Zajecia zajecia) {
        entityManager.persist(zajecia);
    }

    @Override
    public void edytujZajecia(Zajecia zajecia) {
        Zajecia istniejąceZajecia = entityManager.find(Zajecia.class, zajecia.getIdZajec());
        if (istniejąceZajecia != null) {
            istniejąceZajecia.setIdPrzedmiotu(zajecia.getIdPrzedmiotu());
            istniejąceZajecia.setIdWykladowcy(zajecia.getIdWykladowcy());
            istniejąceZajecia.setIdSali(zajecia.getIdSali());
            istniejąceZajecia.setFormaZajec(zajecia.getFormaZajec());
            istniejąceZajecia.setStatusZajec(zajecia.getStatusZajec());
            istniejąceZajecia.setDataZajec(zajecia.getDataZajec());
            entityManager.merge(istniejąceZajecia);
        }
    }

    @Override
    public void usunZajecia(int idZajecia) {
        Zajecia zajecia = entityManager.find(Zajecia.class, idZajecia);
        if (zajecia != null) {
            entityManager.remove(zajecia);
        }
    }
}
