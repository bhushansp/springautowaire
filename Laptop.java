package com.te.springautowaire;

public class Laptop {
	
	Battery battery;
	Screen screen;
	HardDisk hd1;
	HardDisk hd2;
	
	
	
//public Laptop(Battery battery, Screen screen, HardDisk hd1, HardDisk hd2) {
//		super();
//		this.battery = battery;
//		this.screen = screen;
//		this.hd1 = hd1;
//		this.hd2 = hd2;
//	}



	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	public void setHd1(HardDisk hd1) {
		this.hd1 = hd1;
	}
	public void setHd2(HardDisk hd2) {
		this.hd2 = hd2;
	}
	@Override
	public String toString() {
		return "Laptop [battery=" + battery + ", screen=" + screen + ", hd1=" + hd1 + ", hd2=" + hd2 + "]";
	}
	
	
	
	
	
	
}
