import Controleur.*;
import Command.*;
import Moteur.*;
import Controleur.*;
/**
 * Created by Inés on 04/01/2017.
 */
public class Application {

    private static Moteur moteur;
    private static ControleurImpl controleur;
    private static Command marquerMesure;
    private static Command marquerTemps;
    private static Command startCommand;
    private static Command stopCommand;

    public static void main( String[] args )
    {
        moteur = new MoteurImpl();
        controleur = new ControleurImpl(moteur);
        marquerMesure = new MarquerMesure(controleur);
        moteur.setMarquerMesure(marquerMesure);
        marquerTemps = new MarquerTemps(controleur);
        moteur.setMarquerTemps(marquerTemps);
        startCommand = new DemarrerMoteur(moteur);
        controleur.setDemarrerMoteur(startCommand);
        stopCommand = new ArretMoteur(moteur);
        controleur.setArretMoteur(stopCommand);
        controleur.startMoteur();
    }

}
