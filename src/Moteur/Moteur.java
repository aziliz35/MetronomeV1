package Moteur;

import Command.Command;

public interface Moteur {

	boolean getEnMarche();
	void setEnMarche(boolean m);
	int getTempo();
	void setTempo(int tempo);
	int getNbTpm();
	void setNbTpm(int nbTpm);
	void setMarquerTemps(Command marquerTemps);
	void setMarquerMesure(Command marquerMesure);
	void marche();
	void stop();
	
	
}
