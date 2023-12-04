package org.example.Model;

import java.security.Timestamp;
import java.util.Objects;

public class Transaction {
    private int id;
    private boolean fluxEntree;
    private String description;
    private Timestamp dateTransaction;
    private String typeTransaction;
    private Compte compte;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction that)) return false;
        return id == that.id && fluxEntree == that.fluxEntree && Objects.equals(description, that.description) && Objects.equals(dateTransaction, that.dateTransaction) && Objects.equals(typeTransaction, that.typeTransaction) && Objects.equals(compte, that.compte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fluxEntree, description, dateTransaction, typeTransaction, compte);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", fluxEntree=" + fluxEntree +
                ", description='" + description + '\'' +
                ", dateTransaction=" + dateTransaction +
                ", typeTransaction='" + typeTransaction + '\'' +
                ", compte=" + compte +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFluxEntree() {
        return fluxEntree;
    }

    public void setFluxEntree(boolean fluxEntree) {
        this.fluxEntree = fluxEntree;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(Timestamp dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public String getTypeTransaction() {
        return typeTransaction;
    }

    public void setTypeTransaction(String typeTransaction) {
        this.typeTransaction = typeTransaction;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }
}
