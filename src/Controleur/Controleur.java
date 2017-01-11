package Controleur;
import Command.Command;
import Moteur.Moteur;

public interface Controleur {
	
	void updateTempo(Moteur m);
	void marquerTemps();
	void marquerMesure();

    void setDemarrerMoteur(Command startCommand);
	void setArretMoteur(Command stopCommand);
	void startMoteur();
}
