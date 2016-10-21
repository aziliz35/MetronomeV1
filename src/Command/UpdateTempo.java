package Command;

import Invoker.Moteur;
import Receiver.Controleur;

public class UpdateTempo implements Command{
	 public Controleur ctl;
	 public Moteur m;
	 
	 public void execute(){
		 ctl.updateTempo(m);
	 }
}
