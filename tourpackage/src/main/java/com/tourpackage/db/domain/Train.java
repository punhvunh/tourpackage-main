package com.tourpackage.db.domain;

public class Train {

	protected Double cost;
	protected Double numberOWagon;
	protected TrainName name;
	protected Double maxSpeed;

	public Train() {
		super();
	}

	private Train(Double cost, Double numberOWagon, TrainName name, Double maxSpeed) {
		super();
		this.cost = cost;
		this.numberOWagon = numberOWagon;
		this.name = name;
		this.maxSpeed = maxSpeed;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(final Double cost) {
		this.cost = cost;
	}

	public Double getNumberOWagon() {
		return numberOWagon;
	}

	public void setNumberOWagon(final Double numberOWagon) {
		this.numberOWagon = numberOWagon;
	}

	public TrainName getName() {
		return name;
	}

	public void setName(final TrainName name) {
		this.name = name;
	}

	public Double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(final Double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
