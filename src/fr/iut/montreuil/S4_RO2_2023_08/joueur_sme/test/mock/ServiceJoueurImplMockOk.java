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
        lj.add(new JoueurDTO("toto", "tot", new Date(25092015), "jeux", "fr"));
        lj.add(new JoueurDTO("titi", "tit", new Date(25072015), "nourritures", "fr"));
        lj.add(new JoueurDTO("tata", "tat", new Date(12012015), "danse", "en"));
        return lj;
    }

    @Override
    public JoueurDTO transmettreInfoJoueur(String pseudo) {
        JoueurDTO j = new JoueurDTO("jj", pseudo, new Date(15032006), "bla, bla", "fr");
        return j;
    }

    @Override
    public boolean supprimerJoueur(String pseudo) {
        return true;
    }

    @Override
    public boolean ajouterJoueur(String prenom, String pseudo, Date date, String centreInterets, String languePrefere) {
        return true;
    }
}
