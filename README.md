# Abacus-Project
Ministerial trace of the seismic events

You need to create some **a DATABASE called Abacus Project** to make this project useful and in this **DB** you need to insert some different table:

|**Nome Tabella**|**Dati**|**Primary Key**|
| --- | --- | --- |
| PuntoRilevamentto | LOCALITA | prID -> PK |
| Centralina | DESCRIZIONE, LOCALITA | cID -> PK |
| Rilevazione | RICHTER, DATETIME | rID -> PK |
| Sismografo | INFO | sID -> PK |
| Utente | PASSWORD(hashing), SALT, IMG | NOME -> PK |
