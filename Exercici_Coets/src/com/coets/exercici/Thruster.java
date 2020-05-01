package com.coets.exercici;

public class Thruster {
	private int maxSpeed;
	private int currentSpeed;

	public Thruster(int maxSpeed) {
		super();
		this.maxSpeed = maxSpeed;
		this.currentSpeed = 0;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	public int getCurrentSpeed() {
		return currentSpeed;
	}

	
	public void acelerate() {
		if (this.currentSpeed < maxSpeed) {
			this.currentSpeed++;
		}
		
	}
	
	public void slowdown() {
		if (this.currentSpeed > 0) {
			this.currentSpeed--;
		}
		
	}

	@Override
	public String toString() {
		return "Current Speed" + currentSpeed +"MaxSpeed:"+maxSpeed;
	}
	
	

}
