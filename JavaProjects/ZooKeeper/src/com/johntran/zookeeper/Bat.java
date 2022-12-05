package com.johntran.zookeeper;

public class Bat extends Mammal {
	
	public Bat() {
		super("A Big Bat",300);
	}
	
	//constructor gives bat 300 energy
	public Bat(String name) {
		super(name,300);
	}

	
	//methods
	//fly() decrease energy by 50
	public Bat fly() {
		if(getEnergyLevel() < 25) {
			System.out.println(getName() + " fell to the ground from exahustion");
			return this;
		}
		System.out.println("Whosh Whosh");
		this.setEnergyLevel(getEnergyLevel()-50);
		return this;
	}
	
	//eatHuman() increase energy by 25
	public Bat eatHuman() {
		System.out.println("Slurp Slurp");
		this.setEnergyLevel(getEnergyLevel()+25);
		return this;
	}
	
	
	//attackTown()   decrease energy by 100
	public Bat attackTown() {
		if(getEnergyLevel() < 100) {
			System.out.println(getName() + " is too tired to attack");
			return this;
		}
		System.out.println("Children Screaming and People running");
		this.setEnergyLevel(getEnergyLevel()-100);
		return this;
	}
}
