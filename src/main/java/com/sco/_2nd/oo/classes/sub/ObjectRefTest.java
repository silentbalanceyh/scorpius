package com.sco._2nd.oo.classes.sub;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectRefTest {
	@SuppressWarnings("resource")
	public static void main(String args[]){
		try{
			Employee[] staff = new Employee[3];
			Employee harry = new Employee("Harry Sample",35000);
			staff[0] = harry;
			staff[1] = new Manager("Carl Java",75000,harry);
			staff[2] = new Manager("Tony Java2s",38000,harry);
			
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employee.dat"));
			outputStream.writeObject(staff);
			outputStream.close();
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.dat"));
			Employee[] newStaff = (Employee[])in.readObject();
			for( int i = 0; i < newStaff.length; i++)
				newStaff[i].raiseSalary(100);
			for( int i = 0; i < newStaff.length; i++)
				newStaff[i].print();
		}catch(Exception ex){
			ex.printStackTrace();
			System.exit(1);
		}
	}
}

@SuppressWarnings("serial")
class Manager extends Employee{
	private Employee secretary;
	
	public Manager(String n,double s,Employee e){
		super(n,s);
		secretary = e;
	}
	
	public Manager(){
		
	}
	
	public void raiseSalary(double byPercent){
		super.raiseSalary(byPercent);
	}
	
	public void print(){
		super.print();
		System.out.println("Secretary:");
		if( secretary != null )
			secretary.print();
	}
}

@SuppressWarnings("serial")
class Employee implements Serializable{
	public Employee(String n,double s){
		this.name = n;
		this.salary = s;
	}
	
	public Employee(){
		
	}
	
	public void raiseSalary(double byPercent){
		salary *= 1 + byPercent / 100;
	}
	
	public void print(){
		System.out.println(name + " " + salary);
	}
	
	private String name;
	
	private double salary;
}
