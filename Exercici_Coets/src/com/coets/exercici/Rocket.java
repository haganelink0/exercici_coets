package com.coets.exercici;

import java.util.ArrayList;

public class Rocket {
	private String code;
	private ArrayList<Thruster> thrusters;
	
	public Rocket(String code) {
		super();
		this.code = code;
		this.thrusters = new ArrayList<Thruster>();
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

	@Override
	public String toString() {
		String thrustersSpeed = "";
		for (int i = 0; i < thrusters.size();i++) {
			thrustersSpeed += thrusters.get(i) + ", ";
		}
		return code + ": Has " + thrusters.size() +" thrusters at this speeds "+ thrustersSpeed;
	}
	
	
	
	

}
