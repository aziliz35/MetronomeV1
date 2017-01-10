package Command;
import Moteur.Moteur;
import Controleur.*;

/**
 * @author Aziliz
 *
 */
public class MarquerTemps  implements Command{

	 public Controleur ctl;
	 public Moteur m;
	 
	 /**
	  * Constructeur
	 * @param ctl
	 */
	public MarquerTemps(Controleur ctl) {
		this.ctl = ctl;
	}

	
	 
	 public void execute(){
		 ctl.marquerTemps();
	 }
	
}

	        