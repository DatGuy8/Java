package com.johntran.zookeeper;

public class Mammal {
	private int energyLevel;
	private String name; //default name
	
	
	//constructor
	public Mammal() {
		this.energyLevel = 100;   //sets default energy level
		this.name = "Mammal";
	}
	
	public Mammal(String name) {
		this.energyLevel = 100;
		this.setName(name);
	}
	
	public Mammal(String name, int energyLevel) {
		this.energyLevel = energyLevel;   //sets to desired energy Level
		this.setName(name);          //sets name
	}
	
	//method show energy level and return it
	public int dislpayEnergy() {
		System.out.println(this.name +"'s Energy Level : " + energyLevel);
		return energyLevel;
	}
	
	
	
	//getter energy
	public int getEnergyLevel() {    
		return energyLevel;
	}
	
	//Setter energy
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}


	//get name
	public String getName() {
		return name;
	}

	// set name
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
