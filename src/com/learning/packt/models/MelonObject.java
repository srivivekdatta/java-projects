package com.learning.packt.models;

public class MelonObject {
	private final String type;
	private final int weight;

	public MelonObject(String type, int weight) {
		this.type = type;
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public int getWeight() {
		return weight;
	}
}
