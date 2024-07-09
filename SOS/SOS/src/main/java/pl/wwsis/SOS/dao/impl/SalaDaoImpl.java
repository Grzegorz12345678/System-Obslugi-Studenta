
package pl.wwsis.SOS.dao.impl;

import pl.wwsis.SOS.dao.SalaDao;
import pl.wwsis.SOS.model.Sala;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class SalaDaoImpl implements SalaDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Sala> pobierzWszystkieSale() {
        TypedQuery<Sala> query = entityManager.createQuery("SELECT s FROM Sala s", Sala.class);
        return query.getResultList();
    }

    @Override
    public Sala pobierzSale(int idSali) {
        return entityManager.find(Sala.class, idSali);
    }

    @Override
    public void dodajSale(Sala sala) {
        entityManager.persist(sala);
    }

    @Override
    public void edytujSale(Sala sala) {
        Sala istniejącaSala = entityManager.find(Sala.class, sala.getIdSali());
        if (istniejącaSala != null) {
            istniejącaSala.setNazwa(sala.getNazwa());
            istniejącaSala.setLiczbaMiejsc(sala.getLiczbaMiejsc());
            entityManager.merge(istniejącaSala);
        }
    }

    @Override
    public void usunSale(int idSali) {
        Sala sala = entityManager.find(Sala.class, idSali);
        if (sala != null) {
            entityManager.remove(sala);
        }
    }
}
