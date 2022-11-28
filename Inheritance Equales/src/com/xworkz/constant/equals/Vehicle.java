package com.xworkz.constant.equals;

public class Vehicle {
	
	String name;
	int mileage;
	String fuelType;
	String engineDisplacement;
	int cylinder;
	String maxPower;
	String maxTorque;
	int seatCapacity;
	String transimissionType;
	int bootSapce;
	int fuelTankCapacity;
	String bodyType;
	
	
	public Vehicle(String name, int mileage, String fuelType, String engineDisplacement, int cylinder, String maxPower,
			String maxTorque, int seatCapacity, String transimissionType, int bootSapce, int fuelTankCapacity,
			String bodyType) {
		super();
		this.name = name;
		this.mileage = mileage;
		this.fuelType = fuelType;
		this.engineDisplacement = engineDisplacement;
		this.cylinder = cylinder;
		this.maxPower = maxPower;
		this.maxTorque = maxTorque;
		this.seatCapacity = seatCapacity;
		this.transimissionType = transimissionType;
		this.bootSapce = bootSapce;
		this.fuelTankCapacity = fuelTankCapacity;
		this.bodyType = bodyType;
	}
	
	@Override
	public boolean equals(Object others) {
		System.out.println("running equals method in paint");
		if(others instanceof Vehicle) {
			System.out.println("============");
			Vehicle vehicle=(Vehicle) others;
			if(this.name.equals(vehicle.name)) {
			System.out.println("name is same");
			return true;
			}
		}else {
			System.err.println("=========");
			
		}
		return false;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getEngineDisplacement() {
		return engineDisplacement;
	}
	public void setEngineDisplacement(String engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}
	public int getCylinder() {
		return cylinder;
	}
	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}
	public String getMaxPower() {
		return maxPower;
	}
	public void setMaxPower(String maxPower) {
		this.maxPower = maxPower;
	}
	public String getMaxTorque() {
		return maxTorque;
	}
	public void setMaxTorque(String maxTorque) {
		this.maxTorque = maxTorque;
	}
	public int getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	public String getTransimissionType() {
		return transimissionType;
	}
	public void setTransimissionType(String transimissionType) {
		this.transimissionType = transimissionType;
	}
	public int getBootSapce() {
		return bootSapce;
	}
	public void setBootSapce(int bootSapce) {
		this.bootSapce = bootSapce;
	}
	public int getFuelTankCapacity() {
		return fuelTankCapacity;
	}
	public void setFuelTankCapacity(int fuelTankCapacity) {
		this.fuelTankCapacity = fuelTankCapacity;
	}
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", mileage=" + mileage + ", fuelType=" + fuelType + ", engineDisplacement="
				+ engineDisplacement + ", cylinder=" + cylinder + ", maxPower=" + maxPower + ", maxTorque=" + maxTorque
				+ ", seatCapacity=" + seatCapacity + ", transimissionType=" + transimissionType + ", bootSapce="
				+ bootSapce + ", fuelTankCapacity=" + fuelTankCapacity + ", bodyType=" + bodyType + "]";
	}
	
	
	

}
