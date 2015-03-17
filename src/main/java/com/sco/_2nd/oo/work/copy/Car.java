package com.sco._2nd.oo.work.copy;

public class Car {
	public Engine engine = new Engine();
	public Wheel[] wheels = new Wheel[2];
	public Door leftDoor = new Door();
	public Door rightDoor = new Door();
	public Window window = new Window();
	public Car(){
		for(int i = 0; i < 2; i++){
			wheels[i] = new Wheel();
		}
	}
	
	public static void main(String args[]){
		Car car = new Car();
		for(int i = 0; i < 2; i++){
			car.wheels[i].inflate("yes");
		}
		car.leftDoor.open();
		car.engine.start();
		car.wheels[0].turnLeft();
		car.engine.rev();
		car.wheels[0].turnRight();
		car.engine.rev();
		
		car.window.roodown();
		car.engine.rev();
		
		car.engine.stop();
		car.leftDoor.close();
		
		
		
	}
}

class Engine{
	public void start(){
		System.out.println("Start Engine. 1. 2. 3. Ready!");
	}
	
	public void rev(){
		System.out.println("Engine rev.");
	}
	
	public void stop(){
		System.out.println("Stop Engine.");
	}
}

class Wheel{
	public void inflate(String sign){
		if(sign.equals("yes")){
			System.out.println("inflating...");
			System.out.println("1.. 2.. 3.. Ready.");
		}else{
			System.out.println("the wheels is not full enough, please be careful!");
		}	
	}
	
	public void turnLeft(){
		System.out.println("Turn left successfully.");
	}
	public void turnRight(){
		System.out.println("Turn right successfully.");
	}
}

class Window{
	public void rollup(){
		System.out.println("The window is already close");
	}
	
	public void roodown(){
		System.out.println("The window is already open");
	}
}

class Door{
	public Window window = new Window();
	public void open(){
		System.out.println("The door is open.");
	}
	
	public void close(){
		window.rollup();
		System.out.println("Both door and window is close");
	}
}





