# Abacus-Project
Ministerial trace of the seismic events

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites
You need to create some **a DATABASE called Abacus Project** to make this project useful and in this **DB** you need to insert some different table:

|**Table Name**|**Data**|**Primary Key**|
| --- | --- | --- |
| PuntoRilevamentto | LOCALITA | prID |
| Centralina | DESCRIZIONE, LOCALITA | cID |
| Rilevazione | RICHTER, DATETIME | rID |
| Sismografo | INFO | sID |
| Utente | PASSWORD(hashing), SALT, IMG, DESCRIZIONE, SESSO, DATADINASCITA | NOME |
