package com.principle.liskovSubstitution.after;

public class Main {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println(rectangle.computeArea());
		
		Square square = new Square(10);
		System.out.println(square.computeArea());
		useShape(rectangle);
		useShape(square);

	}

	private static void useShape(Shape shape) {
		shape.computeArea();
	}
}
