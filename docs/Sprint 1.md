**Componenti: Classe: 5ei**

- **Gaole Elia**
- **Brazzarola David**
- **Jennifer Emiliani**

# **Informatics sprint 2**


**Conceptual scheme**

The fundamental information that must be stored in the database are the surveys (Richter scale seismic wave) that are carried out by seismographs associated with the seismographs distributed in the survey locations.

From the data analysis we propose an organization into 4 entities:

- Detection
- Seismograph
- Control unit
- Detection point

Entities are related to each other under the following assumptions:

- Each survey is related to only one seismograph
- Each seismograph is connected to a single control unit.
- Each control unit is located at a single point of detection.

In addition to the data related to the seismograph readings in the database must also be stored information that will allow access only to authorized users.

For this reason we introduce l&#39;user entities in which to store username and password access.

**ENTITY**

- Detection point with two attributes:
  - Primary key ID
  - Further information (location etc.)

- Control unit with two attributes:
  - Control unit id as primary key
  - its location

- Seismograph with two attributes:
  - Seismograph Id
  - More information

- Detection with two attributes:
  - Date and time of detection
  - Richter scale degree of detection

- Users with two attributes
  - Username
  - Password

In order to simplify the discussion, we did not go into detail on the &quot; further information which could be associated with the various entities as they do not seem particularly relevant to the proposed solution.

**ASSOCIATIONS**

We have three associations between the entities:

- association **1:N** between the entities Detection Point and Control Unit
- association **1:N** between the Central Unit and Seismograph entities
- association **1:N** between Seismograph and Detection entities

User entity is used to register users who can have access to the Web page to perform some operations.

**READING THE SCHEMA**

- A detection point has several controllers connected, while a controller has only one detection point
- One control unit is equipped with several seismographs, one seismograph is connected to a single control unit.
- A seismograph makes several surveys, while one survey is made by a single seismograph

**TRANSLATING ER IN ORM **

Below is the scheme previously seen translated into ORM, to better understand it.
