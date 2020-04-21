# Abacus-Project
Ministerial trace of the seismic events

You need to create some **a DATABASE called Abacus Project** to make this project useful and in this **DB** you need to insert some different table:

|**Nome Tabella**|**Dati**|**Primary Key**|
| --- | --- | --- |
| PuntoRilevamentto | LOCALITA | prID |
| Centralina | DESCRIZIONE, LOCALITA | cID |
| Rilevazione | RICHTER, DATETIME | rID |
| Sismografo | INFO | sID |
| Utente | PASSWORD(hashing), SALT, IMG, DESCRIZIONE, SESSO, DATADINASCITA | NOME |
