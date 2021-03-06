package com.oops.abtraction;

public class Rectangle extends Shape {
	protected double width = 1.0;
	protected double length = 1.0;
	public Rectangle(double width, double length, double radius, String color, boolean filled) {
		super();
		this.width = width;
		this.length = length;
		
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", isFilled()=" + isFilled() + ", getColor()="
				+ getColor() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
