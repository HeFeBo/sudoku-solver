# Sudoku Solver API

API REST costruita con **Spring Boot** per gestire e risolvere una griglia Sudoku salvata su database.

## Tecnologie

- Java 21
- Spring Boot 4
- Spring Web MVC
- Spring Data JPA
- MySQL
- Maven Wrapper (`./mvnw`)

## Struttura del progetto

- `controller/CellController`: endpoint REST della griglia.
- `service/CellServiceImpl`: logica di inizializzazione e risoluzione.
- `repository/CellRepository`: accesso ai dati con JPA.
- `model/Cell`: entità di una cella Sudoku.
- `Dto/*`: modelli di input/output dell'API.

## Modello dati

Ogni cella è salvata come entità `Cell` con:

- `row`: riga (1..9)
- `column`: colonna (1..9)
- `value`: valore della cella (1..9) o `null` se vuota

## Configurazione

Compila `src/main/resources/application.properties` con i tuoi dati di connessione:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/sudoku
spring.datasource.username=tuo_utente
spring.datasource.password=tua_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
```

> Nota: attualmente nel repository questi campi sono vuoti.

## Avvio del progetto

```bash
./mvnw spring-boot:run
```

Puoi anche eseguire i test con:

```bash
./mvnw test
```

## Endpoint

Base URL: `http://localhost:8080/api/cells`

### 1) Inizializzare la griglia base

Inizializza tutte le celle e carica una griglia predefinita.

- **POST** `/initialize`

```bash
curl -X POST http://localhost:8080/api/cells/initialize
```

### 2) Risolvere il Sudoku

Esegue la logica di risoluzione sulla griglia attuale.

- **POST** `/solve`

```bash
curl -X POST http://localhost:8080/api/cells/solve
```

### 3) Salvare/aggiornare una cella

- **POST** `/`
- Body JSON:

```json
{
  "row": 1,
  "column": 1,
  "value": 9
}
```

```bash
curl -X POST http://localhost:8080/api/cells \
  -H "Content-Type: application/json" \
  -d '{"row":1,"column":1,"value":9}'
```

### 4) Ottenere una cella completa

- **GET** `/{row}/{column}`

```bash
curl http://localhost:8080/api/cells/1/1
```

### 5) Ottenere solo il valore di una cella

- **GET** `/value/{row}/{column}`

```bash
curl http://localhost:8080/api/cells/value/1/1
```

## Validazioni

In creazione/aggiornamento celle:

- `row` tra 1 e 9
- `column` tra 1 e 9
- `value` tra 1 e 9

## Flusso consigliato di utilizzo

1. Inizializzare la griglia: `POST /initialize`
2. Risolvere la griglia: `POST /solve`
3. Consultare le celle con `GET /{row}/{column}` o `GET /value/{row}/{column}`

## Migliorie consigliate

- Aggiungere uno script SQL iniziale per creare automaticamente tutte le 81 celle.
- Migliorare la gestione degli errori (eccezioni personalizzate e risposte HTTP coerenti).
- Aggiungere test di integrazione per endpoint e algoritmo di risoluzione.
