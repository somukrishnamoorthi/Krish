package com.java.basic;

public class Bus {
	String color;
	int noOfPassanger;
	String busCompany;
	String busNo;
	String distination;
	String travel;
	String toCity;
	
	public Bus(String Distination,String busNo){
		System.out.println("Distination is "+ Distination);
		 toCity = Distination;
		
	}

	public static void main(String[] args) {
		Bus driver=new Bus("Koyambadu","D70");
		Bus conductor=new Bus("Tambaram","T51");
		driver.travel();
		conductor.travel();
		conductor.travel("Night shift");
				
		}
	
	private void travel(String shift) {
		System.out.println("Conductor is in "+shift);
	}

	private void travel(){
		
		System.out.println("Travel upto " +toCity );
	}

}
