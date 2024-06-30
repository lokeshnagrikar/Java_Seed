package Day2_1;

public class mobile {

	private int mobPrice;
	private String mobName;
	private int Qty;
	
	
	public void setMobPrice(int a)
	{
		mobPrice = a;
	}

	public int getMobPrice()
	{
		return mobPrice;
	}

	public void setMobName(String s)
	{
		mobName =  s;
	}

	public String getMobName()
	{
		return mobName;
	}
	public void setQty(int b)
	{
		Qty = b;
	}

	public int getQty()
	{
		return Qty;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		mobile b= new mobile();
		
		
		
		
		//for mobile price
		b.setMobPrice(34000);
	  System.out.println("Mob Price :"+ b.getMobPrice());
	  
	  //for mobile name
	  b.setMobName("IPhone 14");
	  System.out.println("Mobile Name :"+ b.getMobName());
	  
		//for quantity
	  b.setQty(14);
	  System.out.println("Quantity:"+ b.getQty());
		
		
	}//end main

}//end class
