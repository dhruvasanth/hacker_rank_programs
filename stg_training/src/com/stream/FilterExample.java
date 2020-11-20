package com.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterExample {

	public static void main(String[] args) {

		Employee e1=new Employee(1,5000,"dhruva","a");
		Employee e2=new Employee(2,6000,"tirmla","b");
		Employee e3=new Employee(3,7000,"ganesh","c");
		Employee e4=new Employee(4,5000,"ajay","a");
		Employee e5=new Employee(5,5000,"kousar","a");
		Employee e6=new Employee(6,10000,"prasanna","b");
		
		List<Employee> al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
		//System.out.println(al);
		//List<Employee> el=al.stream().filter(i -> i.getSalary() > 7000).collect(Collectors.toList());
		//List<Employee>el=al.stream().filter(i -> i.getName()=="dhruva").collect(Collectors.toList());

		
		int sum=al.stream().filter(p->p.getGrade().equals("a")).mapToInt(m -> m.getSalary()).sum();
		System.out.println(sum);
	//	al.stream().map(e->e.getName().toUpperCase()).collect(Collectors.toList());
		
		/*al.stream().map(new Function<Employee, Integer>() {

			@Override
			public Integer apply(Employee t) {
				// TODO Auto-generated method stub
				return t.getSalary();
			}
		}).forEach(System.out::println); */
	//	System.out.print(st);

		/* al.stream().filter(new Predicate<Employee>() {

			@Override
			public boolean test(Employee t) {
				return t.getSalary()>7000;
			}
		}).forEach(new Consumer<Employee>(){

			@Override
			public void accept(Employee t) {
				System.out.println(t);
				
			}
			
		}); */
		
		
/*	al.stream()
		.filter(i -> i.getSalary() > 7000)
		.sorted((o1,o2)-> o1.getGrade().compareTo(o2.getGrade())).forEach(System.out::println); */ 
	
	
	/*		List<Employee> el2=al.stream().filter(i -> i.getSalary() > 7000)
		.sorted((o1,o2)-> o1.getGrade().compareTo(o2.getGrade()))
		.collect(Collectors.toList());
		System.out.println(el2); */

	}

}
