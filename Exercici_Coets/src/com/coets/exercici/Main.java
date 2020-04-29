package com.coets.exercici;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//FASE 01 y 02 
		Rocket firstRocket = new Rocket("32WESSDS");
		Rocket secondRocket = new Rocket("LDSFJA32");
		
		ArrayList<Thruster> firstThrusters = new ArrayList<Thruster>();
		firstThrusters.add(new Thruster(10));
		firstThrusters.add(new Thruster(30));
		firstThrusters.add(new Thruster(80));
		firstRocket.setThrusters(firstThrusters);
		
		ArrayList<Thruster> secondThrusters = new ArrayList<Thruster>();
		secondThrusters.add(new Thruster(30));
		secondThrusters.add(new Thruster(40));
		secondThrusters.add(new Thruster(50));
		secondThrusters.add(new Thruster(50));
		secondThrusters.add(new Thruster(30));
		secondThrusters.add(new Thruster(10));
		secondRocket.setThrusters(secondThrusters);
		
		System.out.println(firstRocket + "\n" + secondRocket);
		//FASE 03
		firstRocket.accelerate(40);
	}

}
