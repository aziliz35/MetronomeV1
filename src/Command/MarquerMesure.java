package Command;
import Invoker.Moteur;
import Receiver.Controleur;
import Receiver.ControleurImpl;

public class MarquerMesure {
	
	 public Controleur ctl;
	 public Moteur m;
		 
	 public MarquerMesure(ControleurImpl controleurImpl) {
		this.ctl = controleurImpl;
	}

	public void execute(){
		 ctl.marquerMesure();
	 }
	
}
