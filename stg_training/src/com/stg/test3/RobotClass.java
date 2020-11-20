package com.stg.test3;


class Robot
{
	int currentX;
	int currentY;
	int previousX;
	int previousY;
	
	public Robot()
	{
		currentX=0;
		currentY=5;
		previousX=0;
		previousY=5;
	}
	public Robot(int x,int y)
	{
		this.currentX=x;
		this.currentY=y;
		this.previousX=0;
		this.previousY=5;			
	}
	
	public void moveX(int dx)
	{
		previousX=currentX;
		currentX=currentX+dx;
	}
	public void moveY(int dy)
	{
		previousY=currentY;
		currentY=currentY+dy;		
	}
	
	public void printCurrentcordinates()
	{
		System.out.println(currentX+" "+currentY);
	}
	
	public void printPreviouscordinates()
	{
		
		System.out.println(currentX+" "+previousY);
	}
	
	public void lastPosition()
	{
		int dx=currentX-previousX;
		int dy=currentY-previousY;
		if(dx!=0)
			System.out.println("x"+" "+dx);
			else
				System.out.println("y "+dy);
	}
	
	
}

// select id,first_name,last_name from customer where length(first_name)+length(last_name)<12
// order by length(first_name)+length(last_name), first_name,last_name,id;


/*
SELECT id, CONCAT(FIRST_NAME, “ “, LAST_NAME) AS full_name FROM customer
WHERE LENGTH(CONCAT(FIRST_NAME, LAST_NAME)) < 12

ORDER BY LENGTH(CONCAT(FIRST_NAME, LAST_NAME)) ASC,

CONCAT(FIRST_NAME, “ “, LAST_NAME) ASC, ID ASC;

*/


/*
SELECT id, CONCAT(TRIM(FIRST_NAME), “ “, TRIM(LAST_NAME)) AS full_name
FROM customer
WHERE LENGTH(CONCAT(TRIM(FIRST_NAME), TRIM(LAST_NAME))) < 12
ORDER BY LENGTH(CONCAT(TRIM(FIRST_NAME), TRIM(LAST_NAME))) ,
CONCAT(UPPER(TRIM(FIRST_NAME)), “ “, UPPER(TRIM(LAST_NAME))) ,
ID; */


/*
  
select STUDENT.ID, STUDENT.NAME from STUDENT where STUDENT.SCORE > (select
avg(STUDENT.SCORE)from STUDENT) order by ID;

 */

// select count(*) from orders where status != "DELIVERED"; 

//select name from superhero where length(name)  <=6 order by Id asc;


public class RobotClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
