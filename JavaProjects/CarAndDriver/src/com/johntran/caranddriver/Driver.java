package com.johntran.caranddriver;

public class Driver extends Car{
	
	public void driveCar() {
		System.out.println("You drive the car");
		gas-=1;
		showGas();
	}
	
	public void useBoosters(){
		System.out.println("BOOSTER USED! ZOOM ZOOM");
		gas-=3;
		showGas();
		
	}
	
	public void refuelCar() {
		System.out.println("Fill Gas");
		gas+=2;
		showGas();
	}
}
