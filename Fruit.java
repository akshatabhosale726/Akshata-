package com.app.fruits;

public class Fruit {
	private String name;
	private String color;
	private double weight;
	private boolean isFresh;

	public Fruit(String name, String color, double weight, boolean isFresh) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.isFresh = isFresh;
	}

	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public double getWeight() {
		return weight;
	}
	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", weight=" + weight + ", isFresh=" + isFresh + "]";
	}

	public String taste() {
		return "no specific taste";
	}
}
