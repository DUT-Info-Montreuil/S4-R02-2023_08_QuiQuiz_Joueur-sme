package fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.test.mock;

import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.impl.ServiceJoueurImpl;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.modeles.IServicesJoueur;

import java.util.List;

public class ServiceJoueurImplMockKO implements IServicesJoueur {
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
        return null;
    }

    @Override
    public boolean ajouterJoueur(JoueurDTO j) {
        return null;
    }
}
