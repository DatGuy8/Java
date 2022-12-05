package com.johntran.zookeeper;

public class Gorilla extends Mammal{
	
	
	public Gorilla() {
		super();
		this.setName("A Gorilla");
	}
	
	public Gorilla(String name) {
		super(name);
	}
	
	
	
	
	//throws poop and loses 5 energy
	public Gorilla throwPoop() {  
		if(getEnergyLevel() < 5) {
			System.out.println(getName() + " is too tired to throw poop.");
			return this;
		}
		System.out.println(getName()+" threw it's poop.");
		this.setEnergyLevel(getEnergyLevel() - 5);
		return this;
	}
	
	// eats a banana and gains 10 energy
	public Gorilla eatBananas() {    
		System.out.println(getName()+" happily ate a banana.");
		this.setEnergyLevel(getEnergyLevel() + 10);
		return this;
	}
	
	// climbs and loses 10 energy
	public Gorilla climbSomething() {
		if(getEnergyLevel() < 10) {
			System.out.println(getName() + " is too tired, and can't climb.");
			return this;
		}
		System.out.println(getName()+" is Climbing");
		this.setEnergyLevel(getEnergyLevel() - 10);
		return this;
		
	}
	
}
