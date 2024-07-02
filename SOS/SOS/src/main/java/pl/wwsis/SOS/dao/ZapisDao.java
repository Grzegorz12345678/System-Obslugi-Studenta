package pl.wwsis.SOS.dao;

import pl.wwsis.SOS.model.Przedmiot;
import pl.wwsis.SOS.model.Student;

public interface ZapisDao {

    void zapiszStudenta(Student student, Przedmiot przedmiot);
    void wypiszStudenta(Student student, Przedmiot przedmiot);

}
