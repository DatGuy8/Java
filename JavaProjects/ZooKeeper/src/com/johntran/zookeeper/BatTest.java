package com.johntran.zookeeper;

public class BatTest {
	public static void main(String[] args) {
		
		Bat bat1 = new Bat("Dracula");
		
		bat1.attackTown().attackTown().attackTown();
		bat1.eatHuman().eatHuman();
		bat1.fly().fly();
		bat1.dislpayEnergy();
		
		Bat bat2 = new Bat();
		bat2.dislpayEnergy();
	}
}
