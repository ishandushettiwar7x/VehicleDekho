package io.sevenx.vehicledekho.ui;

import java.util.List;

import io.sevenx.vehicledekho.data.*;

public class DisplayVehicle {
	public static void printVehicleInfo(List<Vehicle> vehicles) {
		for (Vehicle vehicle : vehicles) {
			System.out.println("/////////////////////////////////");
			System.out.println("Model Name: " + vehicle.getModelName());
			System.out.println("Top Speed: " + vehicle.getTopSpeed()+"kmph");
			System.out.println("Mileage: " + vehicle.getMileage()+"km");
			System.out.println("Fuel Capacity: " + vehicle.getFuelCapacity()+"L");
			System.out.println("Max Torque: " + vehicle.getMaximumTorque()+"rpm");
			System.out.println("Model Colour: " + vehicle.getColor());
			System.out.println("Number of Gears: " + vehicle.getNumberOfGears());
			if(vehicle instanceof Car) {
				Car car = (Car)vehicle;
				System.out.println("Horse Power: " + car.getHorsePower()+"hp");
				System.out.println("Transmission Type: " + car.getTransmissionType());
				System.out.println("Boot Space: " + car.getBootSpace()+"L");
			}else if(vehicle instanceof Bike) {
				Bike bike = (Bike)vehicle;
				System.out.println("Displacement: " + bike.getCc()+"cc");
				System.out.println("Brake Type: " + bike.getBrakeType());
			}
			System.out.println("/////////////////////////////////");
		}
		
		
	}

}
