package Invoker;

/**
 * @author Aziliz
 *
 */
public class MoteurImpl implements Moteur{

	private boolean enMarche;
	private int tempo;
	private int nbTpm;
	
	int minTempo = 30;
	int maxTempo = 300;
	
	int minTpm = 2;
	int maxTpm = 7;
	

	@Override
	public boolean getEnMarche() {
		// TODO Auto-generated method stub
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
	
	/**
	 * Modifie le nombre de temps par minute
	 * @param nbTpm
	 */
	public void setNbTpm(int nbTpm) {
		if(nbTpm < minTpm){
			this.nbTpm = minTpm;
		}else if(nbTpm > maxTpm){
			this.nbTpm = maxTpm;
		}else{
			this.nbTpm = nbTpm;
		}
		
	}


}
