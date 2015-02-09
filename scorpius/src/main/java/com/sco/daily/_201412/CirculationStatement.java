package com.sco.daily._201412;

public class CirculationStatement {
	public static void main(String args[]){
		
		System.out.println("\n------------- While --------------");
		int i = 0;
		while(i < 5){
			System.out.println("i = " + i++);
		}
		System.out.println("while循环结束，i = " + i);
		
		System.out.println("\n------------- do-While --------------");
		i = 0;
		do{
			System.out.println("i = " + i++);
		}while(i < 5);
		System.out.println("do-while循环结束，i = " + i);
		
		System.out.println("\n------------- for --------------");
		for(i = 0; i < 5; i++)
		{
			System.out.println("i = " + i);
		}
		System.out.println("for循环结束，i = " + i);
		
		System.out.println("\n------------- for --------------");
		for(i = 0; i < 5; i++)
		{
			System.out.println("i = " + i++);
		}
		System.out.println("for循环结束，i = " + i);
		
		System.out.println("\n------------- foreach --------------");
		int[] arrA = {1,2,3,4,5};
		i = 0;
		for(int iNum : arrA){
			System.out.println("arr[" + i + "] = " + iNum);
			i++;
		}
		System.out.println("foreach循环结束，i = " + i);
		
		System.out.println("\n------------- nested --------------");
		i = 0;
		for(; i < arrA.length; i++){
			while(arrA[i] < 3){
				System.out.println("arr[" + i + "] = " + arrA[i]);
				break;
			}
		}
		System.out.println("for-while嵌套循环结束，i = " + i);
	}

}
