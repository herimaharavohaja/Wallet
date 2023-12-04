create database wallet;

CREATE TABLE compte (
    id SERIAL PRIMARY KEY,
    Nom VARCHAR(100);
    solde DECIMAL(15, 2),
    synchronisation VARCHAR(50),
    date_transaction DATE,
    document_importe BYTEA,
    carte_number VARCHAR(34)
);


CREATE TABLE devis (
    id SERIAL PRIMARY KEY,
    nom_devise VARCHAR(50),
    symbole_devise VARCHAR(10),
    taux_change DECIMAL(10, 4),
    compte_id INT REFERENCES compte(id)
);

CREATE TABLE transactions (
    id SERIAL PRIMARY KEY,
    montant DECIMAL(10, 2),
    devise VARCHAR(10),
    date_transaction TIMESTAMP,
    type_transaction VARCHAR(50),
    compte_id INT REFERENCES compte(id),
    flux_entree BOOLEAN DEFAULT false, -- Indique si c'est un flux entrant (true) ou sortant (false)
    description TEXT -- Description de la transaction (facultatif)
);
