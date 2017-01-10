package Controleur;

import Command.*;
import Moteur.Moteur;

public class ControleurImpl implements Controleur {

    private Moteur m;
    private Command marquerMesure;
    private Command marquerTemps;
    private Command demarrerMoteur;
    private Command arretMoteur;

    public ControleurImpl(Moteur m) {
        this.m = m;
    }

    @Override
    public void updateTempo(Moteur m) {

    }

    public void marquerTemps() {
        System.out.println("tic");
    }

    public void marquerMesure() {
        System.out.println("tac");
    }

    /**
     * Modification du moment où l'on marque la mesure
     * @param marquerMesure
     */
    public void setMarquerMesure(MarquerMesure marquerMesure) {
        this.marquerMesure = marquerMesure;
    }

    
    /**
     * Modification de marquerTemps
     * @param marquerTemps
     */
    public void setMarquerTemps(MarquerTemps marquerTemps) {
        this.marquerTemps = marquerTemps;
    }

    
   public void setDemarrerMoteur(Command demarrerMoteur) {
        this.demarrerMoteur = demarrerMoteur;
    }

    /**
     * Demarrage du moteur
     */
    public void startMoteur() {
        System.out.println("Moteur demarre !");
        this.m.marche();
    }

    /**
     * Le moteur est arrêté
     * @param arretMoteur
     */
    public void setArretMoteur(Command arretMoteur) {
        this.arretMoteur = arretMoteur;
    }
}