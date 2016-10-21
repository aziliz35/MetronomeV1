package Receiver;
import Invoker.Moteur;

public interface Controleur {
	
	void updateTempo(Moteur m);
	void marquerTemps();
	void marquerMesure();
}
