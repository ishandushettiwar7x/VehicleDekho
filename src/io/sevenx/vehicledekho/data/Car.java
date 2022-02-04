package io.sevenx.vehicledekho.data;

public class Car extends Vehicle {
	
	private int horsePower;
	private String transmissionType;
	private int bootSpace;
	
	public Car() {}
	
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	public String getTransmissionType() {
		return transmissionType;
	}
	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}
	
	public int getBootSpace() {
		return bootSpace;
	}
	public void setBootSpace(int bootSpace) {
		this.bootSpace = bootSpace;
	}
	

}
