package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator1 {
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1, "Prashnth", 10000);
		Employee e2 = new Employee(2, "chinnu", 20000);
		Employee e3 = new Employee(3, "shubham", 9000);
		Employee e4 = new Employee(4, "afthab", 25000);
		Employee e5 = new Employee(5, "giri", 50000);
		ArrayList<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
		System.out.println();
		Collections.sort(list, new CompareById());
		Collections.sort(list, new CompareByName());
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
//		System.out.println();
//		for (Employee employee : list) {
//			System.out.println(employee);
//		}
//		Collections.sort(list, new CompareByName());
//		System.out.println();
//		for (Employee employee : list) {
//			System.out.println(employee);
//		}
		
	}

}

class CompareById implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getSalary()-o2.getSalary();

	}


}
class CompareByName implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1,Employee e2)
	{
		return e1.getName().compareToIgnoreCase(e2.getName());		
	}
}


class Employee
{
	private int id;
	private String name;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
}
