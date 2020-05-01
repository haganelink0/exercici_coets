package com.coets.exercici;

import java.util.ArrayList;

public class Rocket {
	private String code;
	private ArrayList<Thruster> thrusters;
	private double currentSpeed;

	
	public Rocket(String code) {
		super();
		this.code = code;
		this.thrusters = new ArrayList<Thruster>();
		this.currentSpeed = 0.0;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public ArrayList<Thruster> getThrusters() {
		return thrusters;
	}

	public void setThrusters(ArrayList<Thruster> thrusters) {
		this.thrusters = thrusters;
	}
	
	
	
	public double getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed() {
		double ThrustersSpeed = 0;
		for(Thruster t: thrusters) {
			ThrustersSpeed += t.getCurrentSpeed();
		}
		this.currentSpeed = this.currentSpeed + 100 * Math.sqrt(ThrustersSpeed);
	}

	public void accelerate(int speedObjective) throws InterruptedException {
		ArrayList<Thread> threads = new ArrayList<Thread>();
		for(Thruster t : thrusters) {
			Thread thrusterThread = new ThrusterUp(t,speedObjective,thrusters.indexOf(t));
			thrusterThread.start();
			threads.add(thrusterThread);
		}
		for(int i = 0; i < threads.size(); i++) {
			threads.get(i).join();
		}	
	}
	
	public void slowDown(int speedObjective) throws InterruptedException {
		ArrayList<Thread> threads = new ArrayList<Thread>();
		for (Thruster t : thrusters) {
				Thread thrusterThread = new ThrusterDown(t,speedObjective,thrusters.indexOf(t));
				thrusterThread.start();
				threads.add(thrusterThread);
		}
		for(int i = 0; i < threads.size(); i++) {
			threads.get(i).join();
		}

	}

	@Override
	public String toString() {
		String thrustersSpeed = "";
		for (int i = 0; i < thrusters.size();i++) {
			thrustersSpeed += thrusters.get(i) + ", ";
		}
		return code + ": Has " + thrusters.size() +" thrusters at this speeds "+ thrustersSpeed;
	}
	
	
	
	

}
