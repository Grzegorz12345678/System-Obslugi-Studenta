CREATE TABLE Przedmiot (
    idPrzedmiot INT PRIMARY KEY,
    nazwaPrzedmiotu VARCHAR(255) NOT NULL,
    opisPrzedmiotu VARCHAR(255)
);


CREATE TABLE Plan_Zajec (
    idPlanu INT PRIMARY KEY,
    dataZajec DATE NOT NULL,
    godzinaRozpoczecia TIME NOT NULL,
    godzinaZakonczenia TIME NOT NULL,
    idPrzedmiot INT,
    FOREIGN KEY (idPrzedmiot) REFERENCES Przedmiot(idPrzedmiot)
);



CREATE TABLE Wykladowca (
    idWykladowcy INT PRIMARY KEY,
    imie VARCHAR(255) NOT NULL,
    nazwisko VARCHAR(255) NOT NULL,
    tytulNaukowy VARCHAR(255),
    email VARCHAR(255) UNIQUE NOT NULL,
    haslo VARCHAR(255) NOT NULL
);

CREATE TABLE Student (
    idStudenta INT PRIMARY KEY,
    numerIndeksu INT UNIQUE NOT NULL,
    imie VARCHAR(255) NOT NULL,
    nazwisko VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    login VARCHAR(255) UNIQUE NOT NULL,
    haslo VARCHAR(255) NOT NULL,
    zablokowany BOOLEAN NOT NULL,
    telefon VARCHAR(20),
    ulica VARCHAR(255),
    miejscowosc VARCHAR(255),
    kodPocztowy VARCHAR(10)
);

CREATE TABLE Ocena (
    idOceny INT PRIMARY KEY,
    wartosc FLOAT NOT NULL,
    dataWystawienia TIMESTAMP NOT NULL,
    komentarz VARCHAR(255),
    idStudent INT,
    idPrzedmiot INT,
    idWykladowcy INT,
    FOREIGN KEY (idStudent) REFERENCES Student(idStudenta),
    FOREIGN KEY (idPrzedmiot) REFERENCES Przedmiot(idPrzedmiot),
    FOREIGN KEY (idWykladowcy) REFERENCES Wykladowca(idWykladowcy)
);



CREATE TABLE Zapis_na_Przedmiot (
    idZapisu INT PRIMARY KEY,
    idStudent INT,
    idPrzedmiot INT,
    FOREIGN KEY (idStudent) REFERENCES Student(idStudenta),
    FOREIGN KEY (idPrzedmiot) REFERENCES Przedmiot(idPrzedmiot)
);


CREATE TABLE Biblioteka (
    idBiblioteki INT PRIMARY KEY,
    nazwa VARCHAR(255) NOT NULL,
    adres VARCHAR(255) NOT NULL
);


CREATE TABLE Ksiazka (
    idKsiazki INT PRIMARY KEY,
    idBiblioteki INT,
    ISBN VARCHAR(255) UNIQUE NOT NULL,
    autor VARCHAR(255) NOT NULL,
    opis VARCHAR(255),
    dostepnosc BOOLEAN NOT NULL,
    FOREIGN KEY (idBiblioteki) REFERENCES Biblioteka(idBiblioteki)
);


CREATE TABLE Wypozyczenia (
    idWypozyczenia INT PRIMARY KEY,
    idStudenta INT,
    idKsiazki INT,
    od_kiedy DATE NOT NULL,
    do_kiedy DATE,
    dataOddania DATE,
    FOREIGN KEY (idStudenta) REFERENCES Student(idStudenta),
    FOREIGN KEY (idKsiazki) REFERENCES Ksiazka(idKsiazki)
);


CREATE TABLE Logi (
    idLogu INT PRIMARY KEY,
    idStudenta INT,
    dataZdarzenia TIMESTAMP NOT NULL,
    dzialanie VARCHAR(255) NOT NULL,
    FOREIGN KEY (idStudenta) REFERENCES Student(idStudenta)
);

CREATE TABLE Faktura (
    idFaktury INT PRIMARY KEY,
    idStudenta INT,
    kwotaDoZaplaty INT NOT NULL,
    opis VARCHAR(255),
    terminPlatnosci DATE NOT NULL,
    dataZaplaty DATE,
    status VARCHAR(255),
    FOREIGN KEY (idStudenta) REFERENCES Student(idStudenta)
);

CREATE TABLE Powiadomienia (
    idPowiadomien INT PRIMARY KEY,
    idStudenta INT,
    dataCzas TIMESTAMP NOT NULL,
    tytul VARCHAR(255) NOT NULL,
    tresc VARCHAR(255) NOT NULL,
    FOREIGN KEY (idStudenta) REFERENCES Student(idStudenta)
);