# Abacus-Project (earthquakes)
Ministerial trace of the seismic events

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites
You need to create a **DATABASE called Abacus Project** to make this project useful and in this **DB** you need to insert some different table:

* **Monitoraggio**

```
CREATE TABLE Monitoraggio{
  DataTime Varchar (15),
  Hour Varchar (15),
  Magnitudo Varchar (10),
  Localita Varchar (70),
  Profondita int,
  PRIMARY KEY (DataTime,Hour)
    
};
```

* **Punto di Rilevamento**

```
CREATE TABLE PuntoRilevamento{
  prID int,
  Localita Varchar (70),
  PRIMARY KEY (prID)
    
};
```

* **Centralina**

```
CREATE TABLE Centralina{
  cID int,
  Descrizione Varchar (500),
  Localita Varchar (70),
  PRIMARY KEY (cID)
    
};
```

* **Rilevazione**

```
CREATE TABLE Rilevazione{
  rID int,
  RICHTER float (15, 15),
  DateTime Varchar (20),
  PRIMARY KEY (rID)
    
};
```

* **Sismografo**

```
CREATE TABLE Sismografo{
  sID int
  Info Varchar (500),
  PRIMARY KEY (2ID)
    
};
```

* **Utente**

```
CREATE TABLE PuntoRilevamento{
  Nome Varchar (30),
  Password Varchar(100),
  Salt Varchar (100),
  Img Varchar (200),
  Descrizione Varchar (500),
  Sesso Varchar (10),
  DataDiNascita Varchar (20),
  PRIMARY KEY (Nome)
    
};
```

---
### Built With
* [Netbeans](https://netbeans.org/)
* [Maven](https://maven.apache.org/)

---
### Contributing
Please read [CONTRIBUTING.md](https://github.com/Elia01/Abacus-Project/blob/master/CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

---
### Authors
* **Elia Gaole** - *Team Manager* - [Elia01](https://github.com/Elia01)
* **David Brazzarola** - [01brazz](https://github.com/01brazz)
* **Jennifer Emiliani** - [jennyemi](https://github.com/jennyemi)
See also the list of [contributors](https://github.com/Elia01/Abacus-Project/graphs/contributors) who participated in this project

---
### License
This project is unlicensed - see the [LICENSE.md](https://github.com/Elia01/Abacus-Project/blob/master/LICENSE) file for details

---
### Acknowledgments
* Hat tip to anyone whose code was used
* Inspiration
* etc
