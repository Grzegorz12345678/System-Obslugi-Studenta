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