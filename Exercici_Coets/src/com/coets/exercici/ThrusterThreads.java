package com.coets.exercici;

public class ThrusterThreads implements Runnable {
	private int thrusterID;
	private Thruster thruster;
	private int speedObjective;
	
	public ThrusterThreads(Thruster thruster, int speedObjective, int id) {
		this.thruster = thruster;
		this.speedObjective = speedObjective;
		this.thrusterID = id+1;
	}

	@Override
	public void run() {
		if (thruster.getCurrentSpeed() < speedObjective) {
			for(int i = thruster.getCurrentSpeed(); i < speedObjective;i++) {
				thruster.acelerate();
				System.out.println("Thruster " + thrusterID + " current speed: " 
									+ thruster.getCurrentSpeed());
			}
		}  else {
			for(int i = thruster.getCurrentSpeed(); i < speedObjective; i++) {
				thruster.slowdown();
				System.out.println("Thruster " + thrusterID + " current speed: " 
									+ thruster.getCurrentSpeed());
			}
		}
		
	}

}
