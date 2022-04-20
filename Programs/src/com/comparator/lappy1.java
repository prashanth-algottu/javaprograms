package com.comparator;

public class lappy1 {
	
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
		public lappy1(int id, String name, int ram) {
			super();
			this.id = id;
			this.name = name;
			this.ram = ram;
		}
		public lappy1() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "lappy1 [id=" + id + ", name=" + name + ", ram=" + ram + "]";
		}
		
		

	}

