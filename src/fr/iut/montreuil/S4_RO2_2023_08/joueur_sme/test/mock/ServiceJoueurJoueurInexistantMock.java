package fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.test.mock;

import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.modeles.IServicesJoueur;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceJoueurJoueurInexistantMock implements IServicesJoueur {

    private List<JoueurDTO> listeJoueurs = new ArrayList<JoueurDTO>();
    @Override
    public List<JoueurDTO> listerJoueurs() {
        return null;
    }

    @Override
    public JoueurDTO transmettreInfoJoueur(String pseudo) {
        if(listeJoueurs.stream().filter(x -> x.getPseudo()==pseudo).count()==0) {
            System.out.println("Joueur Inexistant");
            return null;
        }
        return listeJoueurs.stream().filter(x -> x.getPseudo()==pseudo).findAny().get();
    }

    @Override
    public boolean supprimerJoueur(String pseudo) {
        if(listeJoueurs.stream().filter(x -> x.getPseudo()==pseudo).count()==0) {
            System.out.println("Joueur Inexistant");
            return false;
        }
        return true;
    }

    @Override
    public boolean ajouterJoueur(String prenom, String pseudo, int date, String centreInterets, String languePrefere) {
        listeJoueurs.add(new JoueurDTO(prenom, pseudo, date, centreInterets, languePrefere));
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
