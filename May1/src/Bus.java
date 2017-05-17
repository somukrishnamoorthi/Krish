
public class Bus {
	String color;
	int noOfPassanger;
	String busCompany;
	String busRegNo;

	public Bus(){
		color="Red Bus";
		noOfPassanger=50;
		busCompany="Sona";
		busRegNo="TN20-1234";
				}
	public static void main(String[] args) {
		Bus steering=new Bus();
		Bus driver=new Bus();
		Bus conductor=new Bus();
		System.out.println("Drive is running the bus with no   "  +driver.busRegNo);
		System.out.println("Bus Company is   " +driver.busCompany);
		System.out.println("No of passanger is  "+conductor.noOfPassanger);
		System.out.println("Bus company with capasity of bus is "+conductor.busCompany + conductor.noOfPassanger);
		
	}

}
