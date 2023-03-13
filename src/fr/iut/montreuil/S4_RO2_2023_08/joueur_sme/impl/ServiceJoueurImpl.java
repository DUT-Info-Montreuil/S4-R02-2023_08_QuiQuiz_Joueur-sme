package fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.impl;

import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.modeles.IServicesJoueur;

import java.util.ArrayList;
import java.util.List;

public class ServiceJoueurImpl implements IServicesJoueur {
    private List<JoueurDTO> listeJoeurs;

    public ServiceJoueurImpl(){
        this.listeJoeurs = new ArrayList<JoueurDTO>();
    }

    @Override
    public List<JoueurDTO> listerJoueurs() {
        return this.listeJoeurs;
    }

    @Override
    public JoueurDTO transmettreInfoJoueur(String pseudo) {
        JoueurDTO joueurR = null;
        for(JoueurDTO joueur : this.listeJoeurs){
            if(joueur.getPseudo().equals(pseudo)){
                joueurR = joueur;
            }
        }
        return joueurR;
    }

    @Override
    public void supprimerJoueur(String pseudo) {
        JoueurDTO joueurASupprimer = null;
        for(JoueurDTO joueur : this.listeJoeurs){
            if(joueur.getPseudo().equals(pseudo)){
                joueurASupprimer = joueur;
            }
        }
        if(joueurASupprimer != null) {
            this.listeJoeurs.remove(joueurASupprimer);
            return true;
        }
    }

    @Override
    public void ajouterJoueur(JoueurDTO j) {
        this.listeJoeurs.add(j);




    
}
