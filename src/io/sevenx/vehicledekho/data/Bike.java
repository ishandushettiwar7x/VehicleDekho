package io.sevenx.vehicledekho.data;

public class Bike extends Vehicle {
	private int cc;
	private String brakeType;
	
	public Bike() {}
	
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public String getBrakeType() {
		return brakeType;
	}
	public void setBrakeType(String brakeType) {
		this.brakeType = brakeType;
	}


}
