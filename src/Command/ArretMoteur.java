package Command;

import Moteur.Moteur;
/**
 * Created by Inés on 04/01/2017.
 */
public class ArretMoteur implements Command {
    private Moteur moteur;

    public ArretMoteur(Moteur moteur) {
        this.moteur = moteur;
    }

    @Override
    public void execute() {
        this.moteur.marche();
    }
}
