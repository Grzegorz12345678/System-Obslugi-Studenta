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