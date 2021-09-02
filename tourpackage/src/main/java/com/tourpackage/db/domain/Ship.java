package com.tourpackage.db.domain;

public class Ship {

	protected Double cost;
	protected Double numberOfCabin;
	protected ShipName name;
	protected Double maxSpeed;

	public Ship() {
		super();
	}

	private Ship(Double cost, Double numberOfCabin, ShipName name, Double maxSpeed) {
		super();
		this.cost = cost;
		this.numberOfCabin = numberOfCabin;
		this.name = name;
		this.maxSpeed = maxSpeed;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(final Double cost) {
		this.cost = cost;
	}

	public Double getNumberOfCabin() {
		return numberOfCabin;
	}

	public void setNumberOfCabin(final Double numberOfCabin) {
		this.numberOfCabin = numberOfCabin;
	}

	public ShipName getName() {
		return name;
	}

	public void setName(final ShipName name) {
		this.name = name;
	}

	public Double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(final Double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


}
