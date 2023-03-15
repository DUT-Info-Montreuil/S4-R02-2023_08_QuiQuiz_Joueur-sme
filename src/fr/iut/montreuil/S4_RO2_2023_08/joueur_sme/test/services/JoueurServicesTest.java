package fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.test.services;

import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.impl.ServiceJoueurImpl;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.modeles.IServicesJoueur;
import org.junit.Test;

import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.entities.dto.JoueurDTO;
import org.junit.jupiter.api.BeforeEach;

import java.util.Date;

import static org.junit.Assert.*;

public class JoueurServicesTest {

    private IServicesJoueur serviceJoueurImplBeanTest = new ServiceJoueurImpl() ;

    @BeforeEach
    public void setup() {
        serviceJoueurImplBeanTest =  new ServiceJoueurImpl();
    }

    @Test
    public void ajouterJoueurOkTest() {
        //serviceJoueurImplBeanTest = new ServiceJoueurImplMockOk();
        assertTrue(serviceJoueurImplBeanTest.ajouterJoueur("joueurSimple", "pseudoSimple",
                2003, "Animaux, nourritures", "fr"));
    }
    @Test
    public void ajouterJoueurDoublonKoTest() {
       // serviceJoueurImplBeanTest = new ServiceJoueurDoublonImpossibleMock();
        serviceJoueurImplBeanTest.ajouterJoueur("joueur1", "pseudoSimple",
                2001, "Danse, Guitare", "fr");

        assertFalse(serviceJoueurImplBeanTest.ajouterJoueur("joueur2", "pseudoSimple",
                2002, " Foot, cuisine, voitures", "fr"));

    }

    @Test
    public void ajouterJoueurFieldsNullKoTest() {
        //serviceJoueurImplBeanTest = new ServiceJoueurFieldNullKoMock();

        assertFalse(serviceJoueurImplBeanTest.ajouterJoueur("joueurSimple", "pseudoSimple",
                2003, "Animaux, nourritures", null));
        assertFalse(serviceJoueurImplBeanTest.ajouterJoueur("joueurSimple", null,
                2003, "Animaux, nourritures", "fr"));
        assertFalse(serviceJoueurImplBeanTest.ajouterJoueur("joueurSimple", "pseudoSimple",
                -3625, "Animaux, nourritures", "fr"));
    }

    @Test
    public void supprimerJoueurKoTest() {
        //serviceJoueurImplBeanTest = new ServiceJoueurJoueurInexistantMock();

        assertFalse(serviceJoueurImplBeanTest.supprimerJoueur("pseudoTest"));
    }
    @Test
    public void supprimerJoueurOkTest() {
       //serviceJoueurImplBeanTest = new ServiceJoueurImplMockOk();
        serviceJoueurImplBeanTest.ajouterJoueur("prenomTest", "pseudoTest", 2003,
                "nourritures, dessin", "en");
        assertTrue(serviceJoueurImplBeanTest.supprimerJoueur("pseudoTest"));
    }
    @Test
    public void transmettreInfoJoueurOkTest() {

        //serviceJoueurImplBeanTest = new ServiceJoueurImplMockOk();

        JoueurDTO j1 = new JoueurDTO("Onur", "Onurum", 2003,
                "langues, manger", "fr");

        serviceJoueurImplBeanTest.ajouterJoueur(j1.getPrenom(), j1.getPseudo(), j1.getAnneeNaissance(), j1.getCentreInterets(),
                j1.getLanguePrefere());

        assertEquals(j1, serviceJoueurImplBeanTest.transmettreInfoJoueur(j1.getPseudo()));
    }

    @Test
    public void transmettreInfoJoueurKoTest() {
        //serviceJoueurImplBeanTest = new ServiceJoueurJoueurInexistantMock();

        assertNull(serviceJoueurImplBeanTest.transmettreInfoJoueur("Onurum"));
    }
}

