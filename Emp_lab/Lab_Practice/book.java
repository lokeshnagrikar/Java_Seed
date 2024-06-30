package Employability_lab;

public class book {

	String bname;
	int bprice;
	String authorname;
	public book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public book(String bname, int bprice, String authorname) {
		super();
		this.bname = bname;
		this.bprice = bprice;
		this.authorname = authorname;
	}
	
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	
	
	public int getBprice() {
		return bprice;
	}
	public void setBprice(int bprice) {
		this.bprice = bprice;
	}
	
	
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	
	
	@Override
	public String toString() {
		return "book [bname=" + bname + ", bprice=" + bprice + ", authorname=" + authorname + "]";
	}


	
	
	
}
