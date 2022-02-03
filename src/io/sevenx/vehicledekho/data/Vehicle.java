package io.sevenx.vehicledekho.data;

public abstract class Vehicle {

	private String modelName;
	private int topSpeed;
	private String colour;
	private int mileage;
	private int fuelCapacity;
	private int maximumTorque;
	private int numberOfGears;
	
	public Vehicle() {}
	
	public String getColor() {
		return colour; 
		}
	public void setColor(String colour) {
		this.colour = colour; }
	
	public String getModelName() {
		return modelName; 
		}
	public void setModelName(String modelName) {
		this.modelName = modelName; }
	
	public int getTopSpeed() {
		return topSpeed; 
		}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed; }
	
	public int getMileage() {
		return mileage; 
		}
	public void setMileage(int mileage) {
		this.mileage = mileage; }
	
	public int getFuelCapacity() {
		return fuelCapacity; 
		}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity; }
	
	public int getMaximumTorque() {
		return maximumTorque; 
		}
	public void setMaximumTorque(int maximumTorque) {
		this.maximumTorque = maximumTorque; }
	
	public int getNumberOfGears() {
		return numberOfGears; 
		}
	public void setNumberOfGears(int numberOfGears) {
		this.numberOfGears = numberOfGears; }
	

}

