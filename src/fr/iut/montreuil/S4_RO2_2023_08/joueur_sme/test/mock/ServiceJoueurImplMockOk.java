package fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.test.mock;

import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.modeles.IServicesJoueur;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceJoueurImplMockOk implements IServicesJoueur {

    @Override
    public List<JoueurDTO> listerJoueurs() {
        List<JoueurDTO> lj = new ArrayList<JoueurDTO>();
        lj.add(new JoueurDTO("toto", "tot", 2015, "jeux", "fr"));
        lj.add(new JoueurDTO("titi", "tit", 2015, "nourritures", "fr"));
        lj.add(new JoueurDTO("tata", "tat", 2015, "danse", "en"));
        return lj;
    }

    @Override
    public JoueurDTO transmettreInfoJoueur(String pseudo) {
        JoueurDTO j = new JoueurDTO("Onur", pseudo, 2003, "langues, manger", "fr");
        return j;
    }

    @Override
    public boolean supprimerJoueur(String pseudo) {
        return true;
    }

    @Override
    public boolean ajouterJoueur(String prenom, String pseudo, int date, String centreInterets, String languePrefere) {
        return true;
    }

    @Override
    public boolean ajouterStats(String pseudo, int idQuestionnaire, int nbBonnesReponses, int nbQuestions, long temps) {
        return false;
    }

    @Override
    public boolean supprimerStats(String pseudo, int idQuestionnaire) {
        return false;
    }
}
