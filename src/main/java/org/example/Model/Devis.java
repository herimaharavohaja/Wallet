package org.example.Model;

import java.util.Objects;

public class Devis {
    private int id;
    private String nomDevise;
    private String symboleDevise;
    private double tauxChange;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Devis devis)) return false;
        return id == devis.id && Double.compare(devis.tauxChange, tauxChange) == 0 && Objects.equals(nomDevise, devis.nomDevise) && Objects.equals(symboleDevise, devis.symboleDevise) && Objects.equals(compte, devis.compte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomDevise, symboleDevise, tauxChange, compte);
    }

    private Compte compte;

    @Override
    public String toString() {
        return "Devis{" +
                "id=" + id +
                ", nomDevise='" + nomDevise + '\'' +
                ", symboleDevise='" + symboleDevise + '\'' +
                ", tauxChange=" + tauxChange +
                ", compte=" + compte +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDevise() {
        return nomDevise;
    }

    public void setNomDevise(String nomDevise) {
        this.nomDevise = nomDevise;
    }

    public String getSymboleDevise() {
        return symboleDevise;
    }

    public void setSymboleDevise(String symboleDevise) {
        this.symboleDevise = symboleDevise;
    }

    public double getTauxChange() {
        return tauxChange;
    }

    public void setTauxChange(double tauxChange) {
        this.tauxChange = tauxChange;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }
}
