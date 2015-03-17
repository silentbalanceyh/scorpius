package com.sco._2nd.oo.classes.override;

class ShapeOne{
	void draw(){
		System.out.println(this + ".draw()");
	}
}

class CircleOne extends ShapeOne{
	public String toString(){
		return "Circle";
	}
}

class SquareOne extends ShapeOne{
	public String toString(){
		return "Square";
	}
}

class TriangleOne extends ShapeOne{
	public String toString(){
		return "Triangle";
	}
}

public class Shapes {
	public static void main(String args[]){
		Object[] shapeList = { new CircleOne(),new SquareOne(), new TriangleOne()};
		for(int i = 0; i < shapeList.length; i++ )
			((ShapeOne)shapeList[i]).draw();
	}
}
