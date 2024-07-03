package pl.wwsis.SOS.dao;

import pl.wwsis.SOS.model.Sala;

import java.util.List;

public interface SalaDao {
    List<Sala> pobierzWszystkieSale();
    Sala pobierzSale(int idSali);
}

