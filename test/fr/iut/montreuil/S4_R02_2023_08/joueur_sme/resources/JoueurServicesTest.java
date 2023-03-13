package fr.iut.montreuil.S4_R02_2023_08.joueur_sme.resources;

import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.impl.ServiceJoueurImpl;
import org.junit.Test;

import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.impl.ServiceJoueurImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class JoueurServicesTest {

    private ServiceJoueurImpl serviceJoueur;
    private JoueurDTO j1;

    @Before
    public void setup() {
        serviceJoueur = mock(serviceJoueur);
        j1 = new JoueurDTO("Onur", "Onurum", new Date(17072003), "Jeux-Vidéos", "fr");
        serviceJoueur.ajouterJoueur(j1);
    }

    @Test
    public void ajouterJoueurTest() {
        when(serviceJoueur.ajouterJoueur(j1)).thenReturn(true);

        assertTrue(serviceJoueur.ajouterJoueur(j1));
    }

    @Test
    public void supprimerJoueurTest() {
        when(serviceJoueur.supprimerJoueur(j1.getPseudo())).thenReturn(true);

        assertTrue(serviceJoueur.supprimerJoueur(j1.getPseudo()));
    }

    @Test
    public void transmettreInfoJoueur() {
        when(serviceJoueur.transmettreInfoJoueur(j1.getPseudo())).thenReturn(j1);

        assertEquals(serviceJoueur.transmettreInfoJoueur(j1.getPseudo()), j1);
    }
}

