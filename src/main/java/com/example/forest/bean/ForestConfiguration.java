package com.example.forest.bean;

public class ForestConfiguration {

	private int maximum;
	private int minimum;
	
	protected ForestConfiguration() {
		
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	
	public ForestConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	
}
