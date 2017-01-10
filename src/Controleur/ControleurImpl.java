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

    public void setMarquerMesure(MarquerMesure marquerMesure) {
        this.marquerMesure = marquerMesure;
    }

    public void setMarquerTemps(MarquerTemps marquerTemps) {
        this.marquerTemps = marquerTemps;
    }

    public void setDemarrerMoteur(Command demarrerMoteur) {
        this.demarrerMoteur = demarrerMoteur;
    }

    public void startMoteur() {
        System.out.println("Moteur demarre !");
        this.m.marche();
    }

    public void setArretMoteur(Command arretMoteur) {
        this.arretMoteur = arretMoteur;
    }
}