package com.sco._2nd.oo.classes.override;

import java.util.Random;

class Shape{
	void draw(){}
	void erase(){}
}

class Circle extends Shape{
	void draw(){
		System.out.println("Circle.draw()");
	}
	void erase(){
		System.out.println("Circle.erase()");
	}
}

class Square extends Shape{
	void draw(){
		System.out.println("Square.draw()");
	}
	void erase(){
		System.out.println("Square.erase()");
	}
}

class Triangle extends Shape{
	void draw(){
		System.out.println("Triangle.draw()");
	}
	void erase(){
		System.out.println("triagnle.erase()");
	}
}

class RandomShapeGenerator{
	private Random random = new Random();
	
	public Shape next(){
		switch (random.nextInt(3)) {
			default:
			case 0:return new Circle();
			case 1:return new Square();
			case 2:return new Triangle();
		}
	}
}

public class ShapesDemo {
	private static RandomShapeGenerator generator = new RandomShapeGenerator();
	
	public static void main(String args[]){
		Shape[] shapes = new Shape[9];
		for(int i = 0; i < shapes.length; i++ ){
			shapes[i] = generator.next();
		}
		
		for( int i = 0; i < shapes.length; i++ ){
			shapes[i].draw();
		}
	}
}
