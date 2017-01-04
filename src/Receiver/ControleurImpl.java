package Receiver;

import Command.*;
import Invoker.Moteur;
import Invoker.MoteurImpl;

public class ControleurImpl implements Controleur {

	private Moteur m;
	private MarquerMesure marquerMesure;
	private MarquerTemps marquerTemps;
	
	public ControleurImpl() {

		this.m = new MoteurImpl();
		this.marquerMesure = new MarquerMesure(this);
		this.marquerTemps = new MarquerTemps(this);
		
		
	}

	@Override
	public void updateTempo(Moteur m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void marquerTemps() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void marquerMesure() {
		// TODO Auto-generated method stub
		
	}
	
}
