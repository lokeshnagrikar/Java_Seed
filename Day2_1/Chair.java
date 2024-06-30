package Day2_1;

public class Chair {

	private int price, qty;
	int rating;
	private String brand;


	public void setPrice(int n) {
		price = n;
	}

	public int getPrice() {
		return price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chair ch = new Chair();
		ch.setPrice(15000);
		System.out.println("price is : " + ch.getPrice());
	}// end main

}// end class
