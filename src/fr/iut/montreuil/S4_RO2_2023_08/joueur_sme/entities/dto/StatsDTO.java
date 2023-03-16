package fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.entities.dto;

public class StatsDTO {

    private int idQuestionnaire;
    private int nbBonnesReponses;
    private int nbQuestions;
    private long temps;

    public StatsDTO(int idQuestionnaire, int nbBonnesReponses, int nbQuestions, long temps) {
        this.idQuestionnaire = idQuestionnaire;
        this.nbBonnesReponses = nbBonnesReponses;
        this.nbQuestions = nbQuestions;
        this.temps = temps;
    }

    public int getIdQuestionnaire() {
        return idQuestionnaire;
    }

    public void setIdQuestionnaire(int idQuestionnaire) {
        this.idQuestionnaire = idQuestionnaire;
    }

    public int getNbBonnesReponses() {
        return nbBonnesReponses;
    }

    public void setNbBonnesReponses(int nbBonnesReponses) {
        this.nbBonnesReponses = nbBonnesReponses;
    }

    public int getNbQuestions() {
        return nbQuestions;
    }

    public void setNbQuestions(int nbQuestions) {
        this.nbQuestions = nbQuestions;
    }

    public long getTemps() {
        return temps;
    }

    public void setTemps(long temps) {
        this.temps = temps;
    }
}
