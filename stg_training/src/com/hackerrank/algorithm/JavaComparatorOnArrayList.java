package com.hackerrank.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



class Playerinfo
{
	int score;
	String name;
	Playerinfo(int score,String name)
	{
		this.score=score;
		this.name=name;
	}
		
}

class SortbyScore implements Comparator<Playerinfo>
{

	@Override
	public int compare(Playerinfo o1, Playerinfo o2) {
		if(o1.score<o2.score)
			return 1;
		if(o1.score > o2.score)
			return -1;
		else
		return o1.name.compareTo(o2.name);
	}
	
	
	
}

public class JavaComparatorOnArrayList {
	
	public static void main(String[] args) {

		ArrayList<Playerinfo> al=new ArrayList<Playerinfo>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			al.add(new Playerinfo(sc.nextInt(),sc.next())); 
			
		}

		Collections.sort(al, new SortbyScore());
        for(Playerinfo p:al){
        	System.out.println(p.name+"\t"+p.score);
        }
	}

}
