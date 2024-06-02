CREATE TABLE Student (
    idStudenta int PRIMARY KEY,
    numerIndeksu int UNIQUE NOT NULL,
    imie varchar(255) NOT NULL,
    nazwisko varchar(255) NOT NULL,
    email varchar(255) UNIQUE NOT NULL,
    telefon varchar(20),
    ulica varchar(255),
    miejscowosc varchar(255),
    kodPocztowy varchar(10)
    login varchar(255) UNIQUE NOT NULL,
    haslo varchar(255) NOT NULL,
    blokada boolean NOT NULL
);