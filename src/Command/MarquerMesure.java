package Command;

import Controleur.*;

/**
 * @author Aziliz
 *
 */
public class MarquerMesure implements Command {
	
	private Controleur ctl;

	/**
	 * Constructeur
	 * @param ctl
	 */
	public MarquerMesure(Controleur ctl) {
		this.ctl = ctl;
	}

	
	public void execute(){
		 ctl.marquerMesure();
	 }
	
}
