package com.stg.haritest;

import java.util.Scanner;

class Point2d
{
	int x,y;
	Point2d(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public double dist2d(Point2d p)
	{
		double d1=Math.sqrt((Math.pow(p.x-x,2)+Math.pow(p.y-y,2)));
		System.out.println(d1);
		return d1;
	}
	public void showDistance(double d1)
	{
		System.out.println("2-d distance"+(int)Math.ceil(d1));
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
		double d1=Math.sqrt((Math.pow(p.x-x,2)+Math.pow(p.y-y,2)+Math.pow(p.z-z,2)));
		//System.out.println(d1);
		return d1;
	}
	public void showDistance(double d1)
	{
		System.out.println("3-d distance"+(int)Math.ceil(d1));
	}	
}


public class DistanceBetweenPoints {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int z1=sc.nextInt();
		
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int z2=sc.nextInt();
		
		Point3d dist1=new Point3d(x1,y1,z1);
		Point3d dist2=new Point3d(x2,y2,z2);
		
		double d2=dist1.dist2d(dist2);
		double d3=dist1.dist3D(dist2);
		
		Point2d p=new Point2d(0,0);
		p.showDistance(d2);
		p=dist1;
		p.showDistance(d3);
		
				
		
	}

}
