package com.coets.exercici;

public class Thruster {
	private int maxSpeed;

	public Thruster(int maxSpeed) {
		super();
		this.maxSpeed = maxSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return ""+maxSpeed;
	}
	
	

}
