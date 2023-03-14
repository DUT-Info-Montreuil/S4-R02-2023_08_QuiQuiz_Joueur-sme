package fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.test.mock;

import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.modeles.IServicesJoueur;

import java.util.List;

public class ServiceJoueurImplMockOk implements IServicesJoueur {

    @Override
    public List<JoueurDTO> listerJoueurs() {
        return null;
    }

    @Override
    public JoueurDTO transmettreInfoJoueur(String pseudo) {
        return ;
    }

    @Override
    public boolean supprimerJoueur(String pseudo) {
        return true;
    }

    @Override
    public boolean ajouterJoueur(JoueurDTO j) {
        JoueurDTO joueur = new JoueurDTO("")
        return joueur;
    }
}
