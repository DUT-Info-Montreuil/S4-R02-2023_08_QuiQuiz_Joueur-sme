package fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.test.services;

import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.impl.ServiceJoueurImpl;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.modeles.IServicesJoueur;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.test.mock.ServiceJoueurImplMockKO;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.test.mock.ServiceJoueurImplMockOk;
import org.junit.Test;

import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.entities.dto.JoueurDTO;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;

import java.util.Date;

import static org.junit.Assert.*;

public class JoueurServicesTest {

    private IServicesJoueur serviceJoueurImplBeanTest;

    @BeforeEach
    public void setup() {
        serviceJoueurImplBeanTest =  new ServiceJoueurImpl();
    }

    @Test
    public void ajouterJoueurTest() {
        serviceJoueurImplBeanTest = new ServiceJoueurImplMockOk();
        assertTrue(serviceJoueurImplBeanTest.ajouterJoueur("joueurSimple", "pseudoSimple",
                new Date(17072003), "Animaux, nourritures", "fr"));

        serviceJoueurImplBeanTest = new ServiceJoueurImplMockKO();
        assertFalse(serviceJoueurImplBeanTest.ajouterJoueur("joueurSimple", "pseudoSimple",
                new Date(17072003), "Animaux, nourritures", "fr"));
    }

    @Test
    public void supprimerJoueurTest() {
        serviceJoueurImplBeanTest = new ServiceJoueurImplMockOk();
        assertTrue(serviceJoueurImplBeanTest.supprimerJoueur("pseudoTest"));

        serviceJoueurImplBeanTest = new ServiceJoueurImplMockKO();
        assertFalse(serviceJoueurImplBeanTest.supprimerJoueur("pseudoTest"));
    }

    @Test
    public void transmettreInfoJoueur() {

        serviceJoueurImplBeanTest = new ServiceJoueurImplMockOk();

        JoueurDTO j1 = new JoueurDTO("Onur", "Onurum", new Date(17072003), "langues, manger", "fr");
        assertEquals(j1, serviceJoueurImplBeanTest.transmettreInfoJoueur(j1.getPseudo()));

        serviceJoueurImplBeanTest = new ServiceJoueurImplMockKO();
        assertNull(serviceJoueurImplBeanTest.transmettreInfoJoueur(j1.getPseudo()));
    }
}

