package com.stg.test3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Shape
{
	
	abstract void drawShape();		
}

class Circle extends Shape
{

	@Override
	void drawShape() {
		System.out.println(" drwaing circle");
		
	}
	
}

class Rectangle extends Shape
{

	@Override
	void drawShape() {
		System.out.println(" drwaing Rectangle");
		
	}
	
}

class Square extends Shape
{
	@Override
	void drawShape() {
		System.out.println(" drwaing Square");		
	}
	
}


class ShapeFactory
{
	void drawShape(String shape)
	{
		 if(shape.equalsIgnoreCase("circle"))
		{
			new Circle().drawShape();
		}
		else if(shape.equalsIgnoreCase("rectangle"))
		{
			new Rectangle().drawShape();
		}
		else if(shape.equalsIgnoreCase("square"))
		{
			new Square().drawShape();
		}		
		else
		{
			System.out.println("cant draw"+shape);
		} 
		
	}
	
	
}
public class ShapesTest {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<String> al=new ArrayList<String>();
		
		for(int i=0;i<n;i++)
		{
			al.add(sc.next());
			//factory.drawShape(s1);
		}

		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Square s=new Square();
		ShapeFactory factory=new ShapeFactory();
		((Shape)c).drawShape();
		((Shape)r).drawShape();
		((Shape)s).drawShape();
		System.out.println();

		for(int i=0;i<al.size();i++)
		{
			factory.drawShape(al.get(i));
		}

	}

}
