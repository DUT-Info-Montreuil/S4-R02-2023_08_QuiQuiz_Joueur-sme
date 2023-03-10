package fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.entities.dto;

import java.util.Date;
import java.util.Objects;

public class JoueurDTO {

    private String prenom;
    private String pseudo;
    private Date date;
    private String centreInterets;
    private String languePrefere;

    public JoueurDTO(String prenom, String pseudo, Date date, String centreInterets, String languePrefere) {
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.date = date;
        this.centreInterets = centreInterets;
        this.languePrefere = languePrefere;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JoueurDTO joueurDTO = (JoueurDTO) o;
        return Objects.equals(prenom, joueurDTO.prenom) && Objects.equals(pseudo, joueurDTO.pseudo) && Objects.equals(date, joueurDTO.date) && Objects.equals(centreInterets, joueurDTO.centreInterets) && Objects.equals(languePrefere, joueurDTO.languePrefere);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prenom, pseudo, date, centreInterets, languePrefere);
    }

    @Override
    public String toString() {
        return "JoueurDTO{" +
                "prenom='" + prenom + '\'' +
                ", pseudo='" + pseudo + '\'' +
                ", date=" + date +
                ", centreInterets='" + centreInterets + '\'' +
                ", languePrefere='" + languePrefere + '\'' +
                '}';
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCentreInterets(String centreInterets) {
        this.centreInterets = centreInterets;
    }

    public void setLanguePrefere(String languePrefere) {
        this.languePrefere = languePrefere;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getPseudo() {
        return pseudo;
    }

    public Date getDate() {
        return date;
    }

    public String getCentreInterets() {
        return centreInterets;
    }

    public String getLanguePrefere() {
        return languePrefere;
    }

}
