package com.stg.test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


abstract class Shape
{
	abstract public void drawShape();
}

class Circle extends Shape
{

	@Override
	public void drawShape() {
		System.out.println("drawing circle");	
	}
	
}

class Rectangle extends Shape
{

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("drawing Rectangle");	
	}
	
}

class Square extends Shape
{

	@Override
	public void drawShape() {
		System.out.println("drawing Square");	
		
	}
	
}

class ShapeFactory
{
	public void drawShape(String s)
	{
		if(s.equalsIgnoreCase("circle"))
		new Circle().drawShape();
		else if(s.equalsIgnoreCase("Rectangle"))
			new Rectangle().drawShape();
		else if(s.equalsIgnoreCase("square"))
			new Square().drawShape();
		else
			System.out.println("can't draw the shape"+s);
		
	}
	
}

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
