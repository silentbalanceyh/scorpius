package com.sco._2nd.oo.classes.constructor;

import java.lang.reflect.Constructor;

class FruitQualities{
	private int weight;
	
	private int color;
	
	private int firmness;
	
	private int ripeness;
	
	private int smell;
	
	public FruitQualities(){
		
	}
	
	public FruitQualities(FruitQualities f){
		weight = f.weight;
		color = f.color;
		firmness = f.firmness;
		ripeness = f.ripeness;
		smell = f.smell;
	}
}

class Seed{
	public Seed(){
		
	}
	public Seed(Seed s){
		
	}
}

class Fruit{
	private FruitQualities fq;
	
	private int seeds;
	
	private Seed[] seeds2;
	
	public Fruit(FruitQualities q,int seedCount){
		fq = q;
		seeds = seedCount;
		seeds2 = new Seed[seeds];
		for( int i = 0; i < seeds; i++ )
			seeds2[i] = new Seed();
	}
	
	public Fruit(Fruit f){
		fq = new FruitQualities(f.fq);
		seeds = f.seeds;
		seeds2 = new Seed[seeds];
		for( int i = 0; i < seeds; i++ )
			seeds2[i] = new Seed(f.seeds2[i]);
	}
	
	protected void addQualities(FruitQualities q){
		fq = q;
	}
	
	protected FruitQualities getQualities(){
		return fq;
	}
}

class Tomato extends Fruit{
	public Tomato(){
		super(new FruitQualities(),100);
	}
	
	public Tomato(Tomato t){
		super(t);
	}
}

class ZebraQualities extends FruitQualities{
	private int stripedness;
	
	public ZebraQualities(){
		super();
	}
	
	public ZebraQualities(ZebraQualities z){
		super(z);
		stripedness = z.stripedness;
	}
}

class GreenZebra extends Tomato{
	public GreenZebra(){
		addQualities(new ZebraQualities());
	}
	
	public GreenZebra(GreenZebra g){
		super(g);
		addQualities(new ZebraQualities());
	}
	
	public void evaluate(){
		@SuppressWarnings("unused")
		ZebraQualities zq = (ZebraQualities)getQualities();
	}
}

public class CopyConstractor {
	public static void ripen(Tomato t){
		t = new Tomato(t);
		System.out.println("In ripes, t is a " + t.getClass().getName());
	}
	
	public static void slice(Fruit t){
		t = new Fruit(t);
		System.out.println("In slice, f is a " + t.getClass().getName());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void ripen2(Tomato t){
		try{
			Class class1 = t.getClass();
			Constructor ct = class1.getConstructor(new Class[]{ class1});
			Object object = ct.newInstance(new Object[]{ t });
			System.out.println("In ripen2, t is a " + object.getClass().getName());
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void slice2(Fruit f){
		try{
			Class c = f.getClass();
			Constructor ct = c.getConstructor(new Class[]{c});
			Object object = ct.newInstance(new Object[]{f});
			System.out.println("In slice2, f is a " + object.getClass().getName());
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	
	public static void main(String args[]){
		Tomato tomato = new Tomato();
		ripen(tomato);
		slice(tomato);
		ripen2(tomato);
		slice2(tomato);
		GreenZebra g = new GreenZebra();
		ripen(g);
		slice(g);
		ripen2(g);
		slice2(g);
		g.evaluate();
	}
}
