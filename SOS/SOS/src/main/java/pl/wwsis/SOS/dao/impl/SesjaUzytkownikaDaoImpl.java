package pl.wwsis.SOS.dao.impl;

import pl.wwsis.SOS.dao.SesjaUzytkownikaDao;
import pl.wwsis.SOS.model.SesjaUzytkownika;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.time.LocalDateTime;

@Repository
@Transactional
public class SesjaUzytkownikaDaoImpl implements SesjaUzytkownikaDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void utworzSesje(int idUzytkownika) {
        SesjaUzytkownika sesja = new SesjaUzytkownika();
        sesja.setIdKonta(idUzytkownika);
        sesja.setStartSesji(LocalDateTime.now());
        sesja.setIP("127.0.0.1");
        entityManager.persist(sesja);
    }

    @Override
    public void zakonczSesje(int idUzytkownika) {
        TypedQuery<SesjaUzytkownika> query = entityManager.createQuery(
                "SELECT s FROM SesjaUzytkownika s WHERE s.idKonta = :idKonta AND s.koniecSesji IS NULL",
                SesjaUzytkownika.class);
        query.setParameter("idKonta", idUzytkownika);
        List<SesjaUzytkownika> sesje = query.getResultList();

        if (!sesje.isEmpty()) {
            SesjaUzytkownika sesja = sesje.get(0);
            sesja.setKoniecSesji(LocalDateTime.now());
            entityManager.merge(sesja);
        }
    }

    @Override
    public boolean czySesjaAktywna(int idUzytkownika) {
        TypedQuery<SesjaUzytkownika> query = entityManager.createQuery(
                "SELECT s FROM SesjaUzytkownika s WHERE s.idKonta = :idKonta AND s.koniecSesji IS NULL",
                SesjaUzytkownika.class);
        query.setParameter("idKonta", idUzytkownika);
        List<SesjaUzytkownika> sesje = query.getResultList();

        return !sesje.isEmpty();
    }
}
