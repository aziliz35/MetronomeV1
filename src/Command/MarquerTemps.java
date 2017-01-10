package Command;
import Moteur.Moteur;
import Controleur.*;

public class MarquerTemps  implements Command{

	 public Controleur ctl;
	 public Moteur m;
	 
	 public MarquerTemps(Controleur ctl) {
		this.ctl = ctl;
	}

	
	 
	 public void execute(){
		 ctl.marquerTemps();
	 }
	
}

	        