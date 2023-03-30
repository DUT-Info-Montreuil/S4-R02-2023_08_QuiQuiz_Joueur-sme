package fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.test.mock;

import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.modeles.IServicesJoueur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ServiceJoueurFieldNullKoMock implements IServicesJoueur {

    private List<JoueurDTO> listeJoueurs = new ArrayList<JoueurDTO>();
    @Override
    public List<JoueurDTO> listerJoueurs() {
        return null;
    }

    @Override
    public JoueurDTO transmettreInfoJoueur(String pseudo) {
        return null;
    }

    @Override
    public boolean supprimerJoueur(String pseudo) {
        return false;
    }

    @Override
    public boolean ajouterJoueur(String prenom, String pseudo, int date, String centreInterets, String languePrefere) {
        if(pseudo!=null && (date>=1960 && date<=2023) && languePrefere!=null) {
            listeJoueurs.add(new JoueurDTO(prenom, pseudo, date, centreInterets, languePrefere));
            return true;
        }
        else
            return false;
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
