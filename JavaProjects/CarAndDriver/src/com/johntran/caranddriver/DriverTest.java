package com.johntran.caranddriver;

public class DriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver1 = new Driver();
		Driver driver2 = new Driver();
		
		
		driver1.driveCar();
		driver1.driveCar();
		driver1.driveCar();
		
		
		driver1.useBoosters();
		driver1.useBoosters();
		
		driver1.refuelCar();
		driver1.refuelCar();
		driver1.refuelCar();
		
		driver2.showGas();
	}

}
