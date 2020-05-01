package com.coets.exercici;

public class ThrusterDown extends Thread {
	private int thrusterID;
	private Thruster thruster;
	private int speedObjective;
	
	public ThrusterDown(Thruster thruster, int speedObjective, int id) {
		this.thruster = thruster;
		this.speedObjective = speedObjective;
		this.thrusterID = id+1;
	}

	@Override
	public void run() {
		
		for(int i = thruster.getCurrentSpeed(); i > speedObjective;i--) {
				thruster.slowdown();
				System.out.println("Thruster " + thrusterID + " current speed: " 
									+ thruster.getCurrentSpeed() + " in thread: " + getName());
		}
	}

}