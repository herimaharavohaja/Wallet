package org.example.Repository;

import org.example.Connection.ConnectionDatabase;
import org.example.Model.Compte;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CompteRepository {
    private static final String SELECT_ALL_QUERY = "SELECT * FROM compte";
    private static final String SELECT_BY_ID_QUERY = "SELECT * FROM compte WHERE id = ?";
    private static final String UPDATE_QUERY = "UPDATE compte SET solde = ?, synchronisation = ?, date_transaction = ?, document_importe = ?, carte_number = ? WHERE id = ?";
    private static final String CREATE_QUERY = "INSERT INTO compte (solde, synchronisation, date_transaction, document_importe, carte_number) VALUES (?, ?, ?, ?, ?)";

    public List<Compte> selectAllComptes() {
        List<Compte> comptes = new ArrayList<>();

        try (Connection connection = ConnectionDatabase.createConnection();
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(SELECT_ALL_QUERY);

            while (resultSet.next()) {
                Compte compte = new Compte();
                compte.setId(resultSet.getInt("id"));
                compte.setName(resultSet.getString("Name"));
                compte.setSolde(resultSet.getDouble("solde"));
                compte.setSynchronisation(resultSet.getString("synchronisation"));
                compte.setDateTransaction(resultSet.getDate("date_transaction"));
                compte.setDocumentImporte(resultSet.getBytes("document_importe"));

                comptes.add(compte);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return comptes;
    }

    public Compte getById(int id) {
        Compte compte = new Compte();

        try (Connection connection = ConnectionDatabase.createConnection();
             PreparedStatement statement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {

            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                compte.setId(resultSet.getInt("id"));
                compte.setName(resultSet.getString("Name"));
                compte.setSolde(resultSet.getDouble("solde"));
                compte.setSynchronisation(resultSet.getString("synchronisation"));
                compte.setDateTransaction(resultSet.getDate("date_transaction"));
                compte.setDocumentImporte(resultSet.getBytes("document_importe"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return compte;
    }

    public void updateCompte(Compte compte) {
        try (Connection connection = ConnectionDatabase.createConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_QUERY)) {

            statement.setDouble(1, compte.getSolde());
            statement.setString(2, compte.getSynchronisation());
            statement.setDate(3, new java.sql.Date(compte.getDateTransaction().getTime()));
            statement.setBytes(4, compte.getDocumentImporte());
            statement.setInt(5, compte.getId());

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Compte mis à jour avec succès !");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void ajouteCompte(Compte compte) {
        try (Connection connection = ConnectionDatabase.createConnection();
             PreparedStatement statement = connection.prepareStatement(CREATE_QUERY, Statement.RETURN_GENERATED_KEYS)) {

            statement.setDouble(1, compte.getSolde());
            statement.setString(2, compte.getSynchronisation());
            statement.setDate(3, new java.sql.Date(compte.getDateTransaction().getTime()));
            statement.setBytes(4, compte.getDocumentImporte());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int generatedId = generatedKeys.getInt(1);
                    compte.setId(generatedId);
                    System.out.println("Nouveau compte créé avec l'ID: " + generatedId);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
