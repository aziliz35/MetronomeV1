package Command;

import Moteur.Moteur;

/**
 * Created by Ines on 04/01/2017.
 */
public class DemarrerMoteur implements Command {
    private Moteur moteur;

    /**
     * Constructeur de la classe
     * @param moteur
     */
    public DemarrerMoteur(Moteur moteur) {
        this.moteur = moteur;
    }

    @Override
    public void execute() {
        this.moteur.stop();
    }
}
