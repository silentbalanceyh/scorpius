package com.sco._2nd.oo.classes.objects;

public class CreateObjectDemo {
	public static void main(String args[]){
		Point origin_one = new Point(23,94);
		Rectangle rect_one = new Rectangle(origin_one,100,200);
		Rectangle rect_two = new Rectangle(50,100);
		
		System.out.println("Width of rect_one:" + rect_one.width);
		System.out.println("Height of rect_one:" + rect_one.height);
		System.out.println("Area of rect_one:" + rect_one.area());
		
		rect_two.origin = origin_one;
		
		System.out.println("X Position of rect_two:" + rect_two.origin.x);
		System.out.println("Y Position of rect_two:" + rect_two.origin.y);
		
		rect_two.move(40,72);
		System.out.println("X Position of rect_two:" + rect_two.origin.x);
		System.out.println("Y Position of rect_two:" + rect_two.origin.y);
	}
}

class Point{
	public int x = 0;
	public int y = 0;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Rectangle{
	public int width = 0;
	public int height = 0;
	
	public Point origin;
	
	public Rectangle(){
		this.origin = new Point(0,0);
	}
	
	public Rectangle(Point p){
		this.origin = p;
	}
	
	public Rectangle(int w,int h){
		this(new Point(0,0),w,h);
	}
	
	public Rectangle(Point p, int w, int h){
		this.origin = p;
		this.width = w;
		this.height = h;
	}
	
	public void move(int x,int y){
		origin.x = x;
		origin.y = y;
	}
	
	public int area(){
		return width * height;
	}
}
