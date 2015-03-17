package com.sco._2nd.oo.classes.objects;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

class MyObject{
	protected void finalize() throws Throwable{
		System.out.println("In finalize method for this object: " + this);
	}
}

public class ReferenceUsage {
	
	public static void main(String args[]){
		hold();
		release();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void hold(){
		System.out.println("Exampl of incorrectly holding a strong reference");
		MyObject obj = new MyObject();
		System.out.println("object is " + obj);
		ReferenceQueue rq = new ReferenceQueue();
		
		WeakReference wr = new WeakReference(obj,rq);
		System.out.println("The weak reference is " + wr);
		
		System.out.println("Polling the reference queue returns " + rq.poll());
		
		System.out.println("Getting the referent from the weak reference returns " + wr.get());
		
		System.out.println("Calling GC");
		System.gc();
		System.out.println("Polling the reference queue returns " + rq.poll());
		System.out.println("Getting the referent from the weak reference returns " + wr.get());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void release(){
		System.out.println("");
		System.out.println("Example of correctly releasing a strong reference");
		
		MyObject object = new MyObject();
		System.out.println("object is" + object);
		
		ReferenceQueue rq = new ReferenceQueue();
		
		WeakReference wr = new WeakReference(object,rq);
		System.out.println("The weak reference is " + wr);
		
		System.out.println("Polling the reference queue returns " + rq.poll());
		
		System.out.println("Getting the referent from the weak references returns " + wr.get());
		
		System.out.println("Set the obj reference to null and call GC");
		object = null;
		System.gc();
		System.out.println("Polling the reference queue returns " + rq.poll());
		
		System.out.println("Getting the referent from the weak reference returns " + wr.get());
	}
}
