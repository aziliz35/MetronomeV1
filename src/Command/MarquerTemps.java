package Command;
import Invoker.Moteur;
import Receiver.Controleur;


public abstract class MarquerTemps  implements Command{

	 public Controleur ctl;
	 public Moteur m;
	 
	 public MarquerTemps(Controleur ctl) {

		this.ctl = ctl;
	}

	
	 
	 public void execute(){
		 ctl.marquerTemps();
	 }
	
}

	        