package fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.test.mock;

import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.modeles.IServicesJoueur;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceJoueurDoublonImpossibleMock implements IServicesJoueur {

    private List<JoueurDTO> listeJoueurs = new ArrayList<>();

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
        if(listeJoueurs.stream().filter(x -> x.getPseudo()==pseudo).count()==0) {
            listeJoueurs.add(new JoueurDTO(prenom, pseudo, date, centreInterets, languePrefere));
            return true;
        }
        else
            return false;
    }
}
