package fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.impl;

import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.entities.dto.StatsDTO;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.modeles.IServicesJoueur;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceJoueurImpl implements IServicesJoueur {
    private List<JoueurDTO> listeJoueurs;

    public ServiceJoueurImpl(){
        this.listeJoueurs = new ArrayList<JoueurDTO>();
    }

    @Override
    public List<JoueurDTO> listerJoueurs() {
        return this.listeJoueurs;
    }

    @Override
    public JoueurDTO transmettreInfoJoueur(String pseudo) {
        JoueurDTO joueurR = null;
        for(JoueurDTO joueur : this.listeJoueurs){
            if(joueur.getPseudo().equals(pseudo)){
                joueurR = joueur;
            }
        }
        return joueurR;
    }

    @Override
    public boolean supprimerJoueur(String pseudo) {
        JoueurDTO joueurASupprimer = null;

        for (JoueurDTO joueur : listeJoueurs) {
            if (joueur.getPseudo().equals(pseudo)) {
                joueurASupprimer = joueur;
                break;
            }
        }
        if (joueurASupprimer != null) {
            listeJoueurs.remove(joueurASupprimer);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean ajouterJoueur(String prenom, String pseudo, int date, String centreInterets, String languePrefere) {
        JoueurDTO joueur = new JoueurDTO(prenom, pseudo, date, centreInterets, languePrefere);
        if (listeJoueurs.stream().filter(x -> x.getPseudo()==pseudo).count()==0 && pseudo!=null && (date>=1960 && date<=2023) && languePrefere!=null) {
            listeJoueurs.add(joueur);
            return true;
        }
        return false;
    }

    @Override
    public boolean ajouterStats(String pseudo, int idQuestionnaire, int nbBonnesReponses, int nbQuestions, long temps) {
//        listeJoueurs.stream().filter(x -> x.getPseudo()==pseudo).
//        if(joueur.getPseudo()==pseudo) {
//            joueur.getStatsParties().add(new StatsDTO(idQuestionnaire, nbBonnesReponses, nbQuestions, temps));
//            return true;
//        }

        return false;

    }


}
