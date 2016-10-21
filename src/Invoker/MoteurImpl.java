package Invoker;

/**
 * @author Aziliz
 *
 */
public class MoteurImpl {

	private boolean enMarche;
	private int tempo;
	private int nbTpm;
	
	int minTempo = 30;
	int maxTempo = 300;
	

	public boolean isEnMarche() {
		return enMarche;
	}
	
	public void setEnMarche(boolean enMarche) {
		this.enMarche = enMarche;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	
	/**
	 * Modifie le tempo
	 * @param tempo
	 */
	public void setTempo(int tempo) {
		if(tempo < minTempo){
			this.tempo = minTempo;
		}else if(tempo > maxTempo){
			this.tempo = maxTempo;
		}else{
			this.tempo = tempo;
		}
	}
	
	public int getNbTpm() {
		return nbTpm;
	}
	
	public void setNbTpm(int nbTpm) {
		this.nbTpm = nbTpm;
		
	}
}
