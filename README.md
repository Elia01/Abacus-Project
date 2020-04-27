# Abacus-Project (earthquakes)
Ministerial trace of the seismic events

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites
First of all you need to download and install [ParseHub](https://parsehub.com/quickstart) so you can download real-time earthquake data, once registered click on **new project** and then enter the url of [this page](http://terremoti.ingv.it/events?starttime=2020-04-20+00%3A00%3A00&endtime=2020-04-27+23%3A59%3A59&last_nd=7&minmag=2&maxmag=10&mindepth=-10&maxdepth=1000&minlat=-90&maxlat=90&minlon=-180&maxlon=180&minversion=100&limit=30&orderby=ot-desc&tdmt_flag=-1&lat=0&lon=0&maxradiuskm=-1&wheretype=area). 

Then you need to create a **DATABASE called Abacus Project** to make this project useful and in this **DB** you need to insert some different table:

* **Rilevazione**

```
CREATE TABLE Rilevazione{
  rID Long,
  DataOra Timestamp,
  Magnitudo float (15, 15),
  Localita Varchar (70),
  Profondita int,
  PRIMARY KEY (DataOra)
    
};
```

* **Punto di Rilevamento**

```
CREATE TABLE PuntoRilevamento{
  prID Long,
  Localita Varchar (70),
  PRIMARY KEY (prID)
    
};
```

* **Centralina**

```
CREATE TABLE Centralina{
  cID Long,
  Localita Varchar (70),
  PRIMARY KEY (cID)
    
};
```

* **Sismografo**

```
CREATE TABLE Sismografo{
  sID Long,
  PRIMARY KEY (2ID)
    
};
```

* **Utente**

```
CREATE TABLE PuntoRilevamento{
  uID Long,
  Nome Varchar (30),
  Password Varchar(100),
  Salt Varchar (100),
  Img Varchar (200),
  Descrizione Varchar (500),
  Sesso Varchar (10),
  Eta Varchar (20),
  PRIMARY KEY (uID)
    
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
