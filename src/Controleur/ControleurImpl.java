package Controleur;

import Command.*;
import IHM.Ihm;
import Moteur.Moteur;

public class ControleurImpl implements Controleur {

    private Moteur m;
    private Ihm h;
    private Command marquerMesure;
    private Command marquerTemps;
    private Command demarrerMoteur;
    private Command arretMoteur;

    public ControleurImpl(Moteur m, Ihm h) {
        this.m = m;
        this.h = h;
    }

    @Override
    public void updateTempo(Moteur m) {

    }

    public void marquerTemps() {
        System.out.println("tic");
        this.h.eteindreLed(1);
        this.h.allumerLed(1);
        this.h.emettreSonTemps();
    }

    public void marquerMesure() {
        System.out.println("tac");
        this.h.allumerLed(2);
        this.h.eteindreLed(2);
        this.h.emettreSonMesure();
    }

    /**
     * Modification du moment o? l'on marque la mesure
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
     * Le moteur est arr?t?
     * @param arretMoteur
     */
    public void setArretMoteur(Command arretMoteur) {
        this.arretMoteur = arretMoteur;
    }
}