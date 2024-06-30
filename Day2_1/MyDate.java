package Day2_1;

public class MyDate {
	
	int day,month,year; //declare the variables
	
	public void initDate() //initialize the variables
	{
		day= 20;
		month = 6;
		year =2024;
		
	}
	public void printDate()  //print 
	{
		System.out.println("Date is : "+ day+"/"+month+"/"+year);
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		MyDate d;
		 d= new MyDate();
		
		 
		 // method invocation
		 
		 d.initDate();
		 d.printDate();
		 
	}//end main

}//end class
