INSERT INTO Przedmiot (idPrzedmiot, nazwaPrzedmiotu, opisPrzedmiotu) VALUES
(1, 'Matematyka', 'Podstawy analizy matematycznej'),
(2, 'Informatyka', 'Wprowadzenie do programowania'),
(3, 'Fizyka', 'Mechanika klasyczna');

INSERT INTO Plan_Zajec (idPlanu, dataZajec, godzinaRozpoczecia, godzinaZakonczenia, idPrzedmiot) VALUES
(1, '2024-06-02', '08:00:00', '09:30:00', 1),
(2, '2024-06-03', '10:00:00', '11:30:00', 2),
(3, '2024-06-04', '12:00:00', '13:30:00', 3);