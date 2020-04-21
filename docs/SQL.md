## Creazione SQL
** Per la creazione del DB si propone il seguente script SQL:**

CREATE DATABASE terremoti;
USE terremoti;
CREATE TABLE punti_rilevamento (
 prID bigint(20) NOT NULL AUTO_INCREMENT,
 LOCALITA varchar(70),
 PRIMARY KEY (prID)
);

CREATE TABLE centraline (
 cID bigint(20) NOT NULL AUTO_INCREMENT,
 DESCRIZIONE varchar(200) NOT NULL,
 FK_PR bigint(20) NOT NULL,
 FOREIGN KEY (FK_PR) REFERENCES punti_rilevamento(prID),
 PRIMARY KEY (cID)
);

CREATE TABLE rilevazioni (
 rID bigint(20) NOT NULL AUTO_INCREMENT,
 RICHTER float NOT NULL,
 DATETIME timestamp NOT NULL,
 FK_SISMOGRAFI bigint(20) NOT NULL,
 PRIMARY KEY (rID),
 FOREIGN KEY (FK_SISMOGRAFI) REFERENCES sismografi(sID)
);

CREATE TABLE sismografi (
 sID bigint(20) NOT NULL AUTO_INCREMENT,
 INFO varchar(200) NOT NULL,
 FK_CENTRALINE bigint(20) NOT NULL,
 PRIMARY KEY (sID),
 FOREIGN KEY (FK_CENTRALINE) REFERENCES centraline(sID)
);

CREATE TABLE utenti (
 NOME varchar(50) NOT NULL,
 PASSWORD varchar(50) NOT NULL,
 PRIMARY KEY (NOME)
);
