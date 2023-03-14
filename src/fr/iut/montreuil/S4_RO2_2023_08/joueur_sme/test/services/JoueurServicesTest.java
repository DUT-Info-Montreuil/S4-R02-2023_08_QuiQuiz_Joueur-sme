package fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.test.services;

import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.impl.ServiceJoueurImpl;
import org.junit.Test;

import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.entities.dto.JoueurDTO;
import org.junit.Before;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class JoueurServicesTest {

    private ServiceJoueurImpl serviceJoueurImplBeanTest;
    private Servic

    @Before
    public void setup() {
        serviceJoueurImplBeanTest = mock(serviceJoueurImplBeanTest);
    }

    @Test
    public void ajouterJoueurTest() {
        when(serviceJoueurImplBeanTest.ajouterJoueur(j1)).thenReturn(true);

        serviceJoueurImplBeanTest.ajouterJoueur(j1);


        assertTrue(serviceJoueurImplBeanTest.ajouterJoueur(j1));
    }

    @Test
    public void supprimerJoueurTest() {
        when(serviceJoueurImplBeanTest.supprimerJoueur(j1.getPseudo())).thenReturn(true);

        assertTrue(serviceJoueurImplBeanTest.supprimerJoueur(j1.getPseudo()));
    }

    @Test
    public void transmettreInfoJoueur() {
        when(serviceJoueurImplBeanTest.transmettreInfoJoueur(j1.getPseudo())).thenReturn(j1);

        assertEquals(serviceJoueurImplBeanTest.transmettreInfoJoueur(j1.getPseudo()), j1);
    }
}

