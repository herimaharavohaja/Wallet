INSERT INTO compte (solde, synchronisation, date_transaction, document_importe, carte_number)
VALUES (1000.00, 'Sync A', '2023-01-15', E'\\x5354415254', '1234567890123456');

INSERT INTO compte (solde, synchronisation, date_transaction, document_importe, carte_number)
VALUES (2500.50, 'Sync B', '2023-02-28', E'\\x444f43554d454e54', '9876543210987654');

INSERT INTO compte (solde, synchronisation, date_transaction, document_importe, carte_number)
VALUES (500.75, 'Sync C', '2023-03-10', E'\\x4652414e4345', '5678901234567890');

INSERT INTO compte (solde, synchronisation, date_transaction, document_importe, carte_number)
VALUES (800.20, 'Sync D', '2023-04-05', E'\\x4558545241', '3456789012345678');

INSERT INTO compte (solde, synchronisation, date_transaction, document_importe, carte_number)
VALUES (3000.80, 'Sync E', '2023-05-20', E'\\x4652554953', '7890123456789012');




INSERT INTO devis (nom_devise, symbole_devise, taux_change, compte_id)
VALUES ('Ariary', 'MGA', 1.2, 1);

INSERT INTO devis (nom_devise, symbole_devise, taux_change, compte_id)
VALUES ('Ariary', 'MGA', 1.0, 2);

INSERT INTO devis (nom_devise, symbole_devise, taux_change, compte_id)
VALUES ('Ariary', 'MGA', 1.4, 3);

INSERT INTO devis (nom_devise, symbole_devise, taux_change, compte_id)
VALUES ('Ariary', 'MGA', 0.009, 4);

INSERT INTO devis (nom_devise, symbole_devise, taux_change, compte_id)
VALUES ('Ariary', 'MGA', 0.8, 5);




INSERT INTO transactions (montant, devise, date_transaction, type_transaction, compte_id, flux_entree, description)
VALUES (100.50, 'MGA', '2023-01-20 08:30:00', 'Purchase', 1, true, 'Grocery shopping');

INSERT INTO transactions (montant, devise, date_transaction, type_transaction, compte_id, flux_entree, description)
VALUES (250.75, 'MGA', '2023-02-10 12:45:00', 'Sale', 2, false, 'Product sold');

INSERT INTO transactions (montant, devise, date_transaction, type_transaction, compte_id, flux_entree, description)
VALUES (500.20, 'MGA', '2023-03-05 10:00:00', 'Purchase', 3, true, 'Online purchase');

INSERT INTO transactions (montant, devise, date_transaction, type_transaction, compte_id, flux_entree, description)
VALUES (150.30, 'MGA', '2023-04-15 15:20:00', 'Sale', 4, false, 'Item sold');

INSERT INTO transactions (montant, devise, date_transaction, type_transaction, compte_id, flux_entree, description)
VALUES (300.80, 'MGA', '2023-05-02 09:00:00', 'Purchase', 5, true, 'Service purchase');

