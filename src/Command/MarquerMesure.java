package Command;

import Controleur.*;

public class MarquerMesure implements Command {
	
	private Controleur ctl;

	public MarquerMesure(Controleur ctl) {
		this.ctl = ctl;
	}

	public void execute(){
		 ctl.marquerMesure();
	 }
	
}
