package Moteur;

import Command.Command;

import java.rmi.activation.ActivationGroupDesc;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Aziliz
 *
 */
public class MoteurImpl implements Moteur {

	private boolean enMarche = false ;
	private int tempo;
	private int nbTpm;
	private Timer timer;
	private TimerTask metronome;
	private Command marquerTemps;
	private Command marquerMesure;

	int compteur = 0 ;
	int minTempo = 30;
	int maxTempo = 300;

	public void setMarquerTemps(Command marquerTemps) {
		this.marquerTemps = marquerTemps;
	}

	public void setMarquerMesure(Command marquerMesure) {
		this.marquerMesure = marquerMesure;
	}

	/**
	 * Constructeur du moteur avec initialisation
	 * de nbTpm (nombre de temps par minute)
	 *de tempo
	 *et lancement du TimerTask
	 */
	public MoteurImpl() {
		this.nbTpm = 2;
		this.tempo = 100;
		this.timer = new Timer() ;
		this.metronome = new TimerTask() {
			@Override
			public void run() {
				metronome();
			}
		};
	}

	public boolean isEnMarche() {
		return enMarche;
	}

	@Override
	public boolean getEnMarche() {
		return false;
	}

	public void setEnMarche(boolean enMarche) {
		this.enMarche = enMarche;
	}

	public int getTempo() {
		return tempo;
	}


	/**
	 * Modifie le tempo
	 *si le tempo selectionné est inferieur au tempo minimal, on affecte le tempo minimal
	 *idem pour le tempo maximal
	 * @param tempo
	 */
	public void setTempo(int tempo) {
		if (tempo < minTempo) {
			this.tempo = minTempo;
		} else if (tempo > maxTempo) {
			this.tempo = maxTempo;
		} else {
			this.tempo = tempo;
		}
	}

	public int getNbTpm() {
		return nbTpm;
	}

	public void setNbTpm(int nbTpm) {
		this.nbTpm = nbTpm;

	}

	private void metronome() {
		if (this.compteur < this.nbTpm) {
			marquerTemps.execute();
			this.compteur++;
		} else {
			this.compteur = 0;
			marquerMesure.execute();
		}
	}

	public void marche()
	{
		timer.scheduleAtFixedRate(metronome , (long)(60f/tempo*1000) ,(long)(60f/tempo*1000) );
		enMarche = true ;
	}

	public void stop()
	{
		timer.cancel();
		timer.purge();
		enMarche = false;
	}

}
