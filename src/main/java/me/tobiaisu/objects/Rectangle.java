package me.tobiaisu.objects;

import java.util.Scanner;
import java.lang.Math;

public class Rectangle extends Shape {
	Scanner scanner = new Scanner(System.in);

	private float width;
	private float height;

	public Rectangle(String color, float width, float height) {
		super(color);

		this.width = width;
		this.height = height;

		Count.addCount();
	}

	public Rectangle(float width, float height) {
		super(null);

		this.width = width;
		this.height = height;

		Count.addCount();
	}

	public Rectangle(String color, float length) {
		super(color);

		this.width = length;
		this.height = length;

		Count.addCount();
	}

	public Rectangle(float length) {
		super(null);

		this.width = length;
		this.height = length;

		Count.addCount();
	}

	public Rectangle(String color) {
		super(color);

		this.width = Length.length(scanner, "width");
		this.height = Length.length(scanner, "height");

		Count.addCount();
	}

	public Rectangle() {
		super(null);

		this.width = Length.length(scanner, "width");
		this.height = Length.length(scanner, "height");

		Count.addCount();
	}


	public float getWidth() {
		return this.width;
	}

	public float getHeight() {
		return this.height;
	}

	public void setWidth(float width) {
		this.width = Length.length(scanner, "width");
	}

	public void setHeight(float height) {
		this.height = Length.length(scanner, "height");
	}

	public float getDiagonal() {
		return (float) Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
	}

	public float getPerimeter() {
		return 2 * (this.width + this.height);
	}

	public float getContent() {
		return this.width * this.height;
	}

	@Override
	public int hashCode() {
		return (int) (this.width * this.height) + super.getColor().hashCode();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Rectangle)) {
			return false;
		}

		Rectangle rectangle = (Rectangle) object;

		if (this.width == rectangle.width &&
				this.width == rectangle.width &&
				super.getColor().equals(rectangle.getColor())) {
			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		return "Width: " + this.width +
				"\nHeight: " + this.height +
				"\nColor: " + super.getColor() +
				"\nDiagonal: " + this.getDiagonal() +
				"\nPerimeter: " + this.getPerimeter() +
				"\nContent: " + this.getContent();
	}
}