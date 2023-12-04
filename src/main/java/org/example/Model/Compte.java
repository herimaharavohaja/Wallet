package org.example.Model;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class Compte {
    private int id;
    private double solde;
    private String synchronisation;
    private Date dateTransaction;
    private byte[] documentImporte;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Compte compte)) return false;
        return id == compte.id && Double.compare(compte.solde, solde) == 0 && Objects.equals(synchronisation, compte.synchronisation) && Objects.equals(dateTransaction, compte.dateTransaction) && Arrays.equals(documentImporte, compte.documentImporte);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, solde, synchronisation, dateTransaction);
        result = 31 * result + Arrays.hashCode(documentImporte);
        return result;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", solde=" + solde +
                ", synchronisation='" + synchronisation + '\'' +
                ", dateTransaction=" + dateTransaction +
                ", documentImporte=" + Arrays.toString(documentImporte) +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getSynchronisation() {
        return synchronisation;
    }

    public void setSynchronisation(String synchronisation) {
        this.synchronisation = synchronisation;
    }

    public Date getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(Date dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public byte[] getDocumentImporte() {
        return documentImporte;
    }

    public void setDocumentImporte(byte[] documentImporte) {
        this.documentImporte = documentImporte;
    }
}
