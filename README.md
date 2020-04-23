# Abacus-Project
Ministerial trace of the seismic events

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites
You need to create some **a DATABASE called Abacus Project** to make this project useful and in this **DB** you need to insert some different table:

```
|**Table Name**|**Data**|**Primary Key**|
| --- | --- | --- |
| PuntoRilevamentto | LOCALITA | prID |
| Centralina | DESCRIZIONE, LOCALITA | cID |
| Rilevazione | RICHTER, DATETIME | rID |
| Sismografo | INFO | sID |
| Utente | PASSWORD(hashing), SALT, IMG, DESCRIZIONE, SESSO, DATADINASCITA | NOME |
```
### Built With
* [Netbeans](https://netbeans.org/)

### Contributing
Please read [CONTRIBUTING.md](https://github.com/Elia01/Abacus-Project/blob/master/CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

### Authors
* **Elia Gaole** - *Team Manager* - [Elia01](https://github.com/Elia01)
* **David Brazzarola** - [01brazz](https://github.com/01brazz)
* **Jennifer Emiliani** - [jennyemi](https://github.com/jennyemi)
See also the list of [contributors](https://github.com/Elia01/Abacus-Project/graphs/contributors) who participated in this project

## License
This project is unlicensed - see the [LICENSE.md](https://github.com/Elia01/Abacus-Project/blob/master/LICENSE) file for details

# Acknowledgments
* Hat tip to anyone whose code was used
* Inspiration
* etc
