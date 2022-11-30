public class VehicleTest{
    public static void main(String[] args){
        
        Vehicle bike = new Vehicle();
        Vehicle car = new Vehicle();

        Vehicle redCar = new Vehicle("red");
        String color = redCar.getColor();
        System.out.println("The color of this car is " + color);

        bike.setNumberOfWheels(2);
        bike.setColor("red");


        int bikeWheels = bike.getNumberOfWheels();
        String bikeColor = bike.getColor();
        
        car.setNumberOfWheels(4);
        car.setColor("green");
        
        int carWheels = car.getNumberOfWheels();
        String carColor = car.getColor();
        
        System.out.println("Bike object - Wheels: " + bikeWheels + ", Color: " + bikeColor);
        System.out.println("Car object - Wheels: " + carWheels + ", Color: " + carColor);


    }
}