package fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.modeles;

import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.entities.dto.JoueurDTO;

import java.util.Date;
import java.util.List;

public interface IServicesJoueur {

    public List<JoueurDTO> listerJoueurs();
    public JoueurDTO transmettreInfoJoueur(String pseudo);
    public boolean supprimerJoueur(String pseudo);
    public boolean ajouterJoueur(String prenom, String pseudo, int date, String centreInterets, String languePrefere);
    public boolean ajouterStats(String pseudo, int idQuestionnaire, int nbBonnesReponses, int nbQuestions, long temps);


}
