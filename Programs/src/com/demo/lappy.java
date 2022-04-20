package com.demo;

public class lappy implements Comparable<lappy>
{
	private int id;
	private String name;
	private int ram;
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
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "lappy [id=" + id + ", name=" + name + ", ram=" + ram + "]";
	}
	public lappy(int id, String name, int ram) {
		super();
		this.id = id;
		this.name = name;
		this.ram = ram;
	}
	public lappy() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(lappy o) {
		if(this.id>o.id)
			return 1;
		else if(this.id<o.id)
			return -1;
		else
			return 0;
		
	}
	
	

}
