package com.ict.day14;

public class Shape_Main {
	public static void drawShapes(Shape shape) {
		shape.draw();
	}
	public static void main(String[] args) {
		Shape line = new Line();
		Shape ellipse = new Ellipse();
		Shape rectangle = new Rectangle();
		drawShapes(line);
		drawShapes(ellipse);
		drawShapes(rectangle);
	}


	
}
