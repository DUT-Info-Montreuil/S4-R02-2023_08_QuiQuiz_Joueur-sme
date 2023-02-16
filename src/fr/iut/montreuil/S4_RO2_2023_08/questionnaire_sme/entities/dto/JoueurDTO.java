package fr.iut.montreuil.S4_RO2_2023_08.questionnaire_sme.entities.dto;

import java.util.Date;
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
}