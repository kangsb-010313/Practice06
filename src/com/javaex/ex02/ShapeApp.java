package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		/*
		 Shape(2)
		 
		 Shape(0)
		 Triangle(0)
		 
	 	 Shape(2)
		 Triangle(2)
		 
		 Shape(2)
		 Triangle(4)
		 */
		
		
		Shape s1 = new Shape("파랑", "파랑");
		System.out.println("================");
		
		Triangle t1 = new Triangle();
		System.out.println("================");
		
		Triangle t2 = new Triangle(3, 4);
		System.out.println("================");
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
		System.out.println("================");
		
	}

}

