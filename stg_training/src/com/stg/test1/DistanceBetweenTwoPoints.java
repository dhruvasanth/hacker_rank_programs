package com.stg.test1;

import java.util.Scanner;

class Point2d
{
	protected int x,y;
	
	Point2d(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public double dist2D(Point2d p)
	{
		double distance=0;		
		distance=Math.sqrt(Math.pow(p.x-this.x,2)+Math.pow(p.y-this.y, 2));		
		return distance;				
	}
	public void printDisatnce(double d)
	{
		System.out.println("2D distance is "+(int) Math.ceil(d));
	}
	 
}
 
class Point3d extends Point2d
{
	int z;
	Point3d(int x,int y,int z)
	{
		super(x,y);
		this.z=z;		
	}
	
	public double dist3D(Point3d p)
	{
		double distance=Math.sqrt(Math.pow(p.x-x,2)+Math.pow(p.y-y,2)+Math.pow(p.z-z,2));
		return distance;
		
	}
	
	public void printDisatnce(double d)
	{
		System.out.println("3D distance is "+ (int)Math.ceil(d));
	}
	
}


public class DistanceBetweenTwoPoints {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int z1=sc.nextInt();
		
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int z2=sc.nextInt();
		
		Point3d p1=new Point3d(x1,y1,z1);
		Point3d p2=new Point3d(x2,y2,z2);
		
		double d2=p1.dist2D(p2);
		double d3=p1.dist3D(p2);
		
		Point2d p=new Point2d(0,0);
		p.printDisatnce(d2);
		p=p1;
		p.printDisatnce(d3);

	}

}
