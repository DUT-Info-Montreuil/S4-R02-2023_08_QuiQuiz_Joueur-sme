package fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.test.services;

import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.impl.ServiceJoueurImpl;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.modeles.IServicesJoueur;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.test.mock.ServiceJoueurImplMockOk;

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

    @Test
    public void ajouterStatsOktest(){
    serviceJoueurImplBeanTest = new ServiceJoueurMockAjoutStatsOk();

    String pseudo = "pseudoTest";
    int idQuestionnaire = 1;
    int nbBonnesReponses = 8;
    int nbQuestions = 10;
    long temps = 12000;

    when(serviceJoueurImplBeanTest.ajouterStats(pseudo, idQuestionnaire, nbBonnesReponses, nbQuestions, temps))
            .thenReturn(true);

    boolean result = serviceJoueurImplBeanTest.ajouterStats(pseudo, idQuestionnaire, nbBonnesReponses, nbQuestions, temps);

    assertTrue(result);
    }

    @Test
    public void ajouterStatsKoTest() {
    serviceJoueurImplBeanTest = new ServiceJoueurMockAjoutStatsOK();

    String pseudo = "pseudoTest";
    int idQuestionnaire = 1;
    int nbBonnesReponses = 8;
    int nbQuestions = 10;
    long temps = 12000;

    when(serviceJoueurImplBeanTest.ajouterStats(pseudo, idQuestionnaire, nbBonnesReponses, nbQuestions, temps))
            .thenReturn(false);

    boolean result = serviceJoueurImplBeanTest.ajouterStats(pseudo, idQuestionnaire, nbBonnesReponses, nbQuestions, temps);

    assertFalse(result);
    }


    @Test
    public void supprimerStatsOkTest() {
    serviceJoueurImplBeanTest = new ServiceJoueurMockSupprimerStatsOk();

    String pseudo = "pseudoTest";
    int idQuestionnaire = 1;

    // On simule la suppression avec un return true
    when(serviceJoueurImplBeanTest.supprimerStats(pseudo, idQuestionnaire)).thenReturn(true);

    boolean result = serviceJoueurImplBeanTest.supprimerStats(pseudo, idQuestionnaire);

    assertTrue(result);
    }


    @Test
    public void supprimerStatsKoTest() {
    serviceJoueurImplBeanTest = new ServiceJoueurMockSupprimerStatsOK();

    String pseudo = "pseudoTest";
    int idQuestionnaire = 1;

    when(serviceJoueurImplBeanTest.supprimerStats(pseudo, idQuestionnaire))
            .thenReturn(false);

    boolean result = serviceJoueurImplBeanTest.supprimerStats(pseudo, idQuestionnaire);

    assertFalse(result);
}




}

