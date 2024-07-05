INSERT INTO Przedmiot (idPrzedmiot, nazwaPrzedmiotu, opisPrzedmiotu) VALUES
(1, 'Matematyka', 'Podstawy analizy matematycznej'),
(2, 'Informatyka', 'Wprowadzenie do programowania'),
(3, 'Fizyka', 'Mechanika klasyczna');

INSERT INTO Plan_Zajec (idPlanu, dataZajec, godzinaRozpoczecia, godzinaZakonczenia, idPrzedmiot) VALUES
(1, '2024-06-02', '08:00:00', '09:30:00', 1),
(2, '2024-06-03', '10:00:00', '11:30:00', 2),
(3, '2024-06-04', '12:00:00', '13:30:00', 3);

INSERT INTO Wykladowca (idWykladowcy, imie, nazwisko, tytulNaukowy, email, haslo) VALUES
(1, 'Jan', 'Kowalski', 'Dr', 'jan.kowalski@horyz.edu', ''),
(2, 'Anna', 'Nowak', 'Prof', 'anna.nowak@horyz.edu', ''),
(3, 'Piotr', 'Zieliński', 'Dr', 'piotr.zielinski@horyz.edu', '');

INSERT INTO Student (idStudenta, numerIndeksu, imie, nazwisko, email, login, haslo, zablokowany, telefon, ulica, miejscowosc, kodPocztowy) VALUES
(1, 1001, 'Adam', 'Kowalski', 'adam.kowalski@student.edu', 'adamk', '', FALSE, '123-456-789', 'Ulica 1', 'Miasto', '00-000'),
(2, 1002, 'Ewa', 'Nowak', 'ewa.nowak@student.edu', 'ewan', '', FALSE, '234-567-890', 'Ulica 2', 'Miasto', '00-001'),
(3, 1003, 'Karol', 'Wiśniewski', 'karol.wisniewski@student.edu', 'karolw', '', FALSE, '123-456-759', 'Ulica 3', 'Miasto', '00-002');

INSERT INTO Ocena (idOceny, wartosc, dataWystawienia, komentarz, idStudent, idPrzedmiot, idWykladowcy) VALUES
(1, 4.5, '2024-06-01 10:00:00', 'Brak komentarza', 1, 1, 1),
(2, 3.0, '2024-06-02 12:00:00', 'Brak komentarza', 2, 2, 2),
(3, 5.0, '2024-06-03 14:00:00', 'Świetna praca', 3, 3, 3);

INSERT INTO Zapis_na_Przedmiot (idZapisu, idStudent, idPrzedmiot) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 3, 3);

INSERT INTO Biblioteka (idBiblioteki, nazwa, adres) VALUES
(1, 'Biblioteka Główna 1', 'Koszykowa 5'),
(2, 'Biblioteka Główna 2', 'Koszykowa 6'),
(3, 'Biblioteka Główna 3', 'Koszykowa 7');

INSERT INTO Ksiazka (idKsiazki, idBiblioteki, ISBN, autor, opis, dostepnosc) VALUES
(1, 1, '978-3-16-148410-0', 'Jan Nowak', 'Podstawy matematyki', TRUE),
(2, 2, '978-0-07-142244-0', 'Anna Kowalska', 'Wprowadzenie do fizyki', TRUE),
(3, 3, '978-1-86197-876-9', 'Piotr Zieliński', 'Programowanie w Pythonie', TRUE);

INSERT INTO Wypozyczenia (idWypozyczenia, idStudenta, idKsiazki, od_kiedy, do_kiedy, dataOddania) VALUES
(1, 1, 1, '2024-06-01', '2024-06-15', NULL),
(2, 2, 2, '2024-06-02', '2024-06-16', NULL),
(3, 3, 3, '2024-06-03', '2024-06-17', NULL);

INSERT INTO Logi (idLogu, idStudenta, dataZdarzenia, dzialanie) VALUES
(1, 1, '2024-06-01 08:00:00', 'Logowanie do systemu'),
(2, 2, '2024-06-02 09:00:00', 'Zmiana hasła'),
(3, 3, '2024-06-03 10:00:00', 'Zmiana hasła');

INSERT INTO Faktura (idFaktury, idStudenta, kwotaDoZaplaty, opis, terminPlatnosci, dataZaplaty, status) VALUES
(1, 1, 100, 'Czesne za semestr', '2024-06-30', NULL, 'Nieopłacone'),
(2, 2, 150, 'Opłata za kurs', '2024-07-15', NULL, 'Nieopłacone'),
(3, 3, 200, 'Opłata za materiały', '2024-08-01', NULL, 'Nieopłacone');


INSERT INTO Powiadomienia (idPowiadomien, idStudenta, dataCzas, tytul, tresc) VALUES
(1, 1, '2024-06-01 12:00:00', 'Nowa ocena', 'Otrzymałeś nową ocenę z matematyki'),
(2, 2, '2024-06-02 13:00:00', 'Nowe zajęcia', 'Zajęcia z informatyki zostały dodane do planu'),
(3, 3, '2024-06-03 14:00:00', 'Wypożyczenie książki', 'Wypożyczyłeś książkę "Programowanie w Pythonie"');



