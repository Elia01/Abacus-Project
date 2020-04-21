**Componenti: Classe: 5ei**

- **Gaole Elia**
- **Brazzarola David**
- **Jennifer Emiliani**

# **Informatica Sprint 2**

![](RackMultipart20200421-4-y8fmah_html_79245ea09a1623b3.png)

**SCHEMA CONCETTUALE**

Le informazioni fondamentali che devono essere memorizzate nella base di dati sono le rilevazioni (onda sismica in scala Richter) che vengono effettuate dai sismografi associati a centraline distribuite nei luoghi di rilevazione.

Dall&#39;analisi dei dati proponiamo quindi un&#39;organizzazione in 4 entità:

- Rilevazione
- Sismografo
- Centralina
- Punto di rilevamento

Le entità sono in relazione fra loro facendo riferimento alle seguenti ipotesi:

- Ogni rilevazione è relativa ad un solo sismografo
- Ogni sismografo è collegato ad una sola centralina
- Ogni centralina è posizionata in un solo punto di rilevamento.

Oltre ai dati relativi ai rilevamenti dei sismografi nel database devono essere memorizzate anche le informazioni che permetteranno l&#39;accesso ai soli utenti autorizzati.

Per questo motivo introduciamo l&#39;entità utenti in cui memorizzare username e password di accesso.

![](RackMultipart20200421-4-y8fmah_html_1f9691ed9b359585.gif)

**ENTIT**** À**

- Punto di rilevamento con due attributi:
  - ID chiave primaria
  - Ulteriori informazioni (luogo ecc.)

- Centralina con due attributi:
  - Id della centralina come chiave primaria
  - la sua località

- Sismografo con due attributi:
  - Id del sismografo
  - Ulteriori informazioni

- Rilevazione con due attributi:
  - Data e ora della rilevazione
  - Grado in scala Richter del rilevamento

- Utenti con due attributi
  - Nome utente
  - Password

Per semplificare la trattazione non abbiamo approfondito le &quot;ulteriori informazioni&quot; che potrebbero essere associate alle varie entità in quanto non sembrano particolarmente rilevanti per la proposta di soluzione.

**ASSOCIAZIONI**

Abbiamo tre associazioni fra le entità:

- L&#39;associazione **1:N** tra le entità Punto di rilevamento e Centralina
- L&#39;associazione **1:N** tra le entità Centralina e Sismografo
- L&#39;associazione **1:N** tra le entità Sismografo e Rilevazione

L&#39;entità Utente serve per registrare gli utenti che possono avere l&#39;accesso alla pagina Web per eseguire alcune operazioni.

**LETTURA DELLO SCHEMA**

- Un punto di rilevamento ha collegate più centraline, mentre una centralina ha un solo punto di rilevamento
- Una centralina è dotata di più sismografi, un sismografo invece è collegato a una sola centralina
- Un sismografo effettua più rilevazioni, mentre una rilevazione viene effettuata da un solo sismografo

**TRADUZIONE DIAGRAMMA ER IN ORM**

Qui di seguito lo schema precedentemente visto tradotto in ORM, per approfondirlo al meglio.

![](RackMultipart20200421-4-y8fmah_html_c085d3fb4db5a656.gif)