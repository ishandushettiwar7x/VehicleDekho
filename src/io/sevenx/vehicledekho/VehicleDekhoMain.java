package io.sevenx.vehicledekho;

import java.util.ArrayList;
import java.util.List;

import io.sevenx.vehicledekho.data.*;
import io.sevenx.vehicledekho.ui.DisplayVehicle;
public class VehicleDekhoMain {

	public static void main(String[] args) {
		Car car = new Car();
		car.setModelName("Swift Dzire");
		car.setFuelCapacity(37);
		car.setHorsePower(66);
		car.setColor("Blue");
		car.setTopSpeed(170);
		car.setBootSpace(337);
		car.setMileage(27);
		car.setMaximumTorque(4500);
		car.setNumberOfGears(5);
		car.setTransmissionType("Automatic");
		//////////////////////////////////////
		Bike bike = new Bike();
		bike.setModelName("Hornet");
		bike.setFuelCapacity(12);
		bike.setCc(180);
		bike.setColor("Black");
		bike.setTopSpeed(130);
		bike.setMaximumTorque(6000);
		bike.setBrakeType("Disc");
		bike.setMileage(57);
		bike.setNumberOfGears(5);
		
		List<Vehicle> list = new ArrayList<Vehicle>();
		list.add(car);
		list.add(bike);
		
		
		DisplayVehicle.printVehicleInfo(list);

	}

}














