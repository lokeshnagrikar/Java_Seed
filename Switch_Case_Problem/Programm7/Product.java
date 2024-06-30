package Programm7;



	public class Product {
	    private static int productId = 1; // to generate unique product code
	    private String productCode;
	    private String name;

	    // parameterized constructor
	    public Product(String name) {
	        this.name = name;
	        this.productCode = "P" + productId++;
	    }

	    // getter and setter methods
	    public String getProductCode() {
	        return productCode;
	    }

	    public void setProductCode(String productCode) {
	        this.productCode = productCode;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    
	    @Override
	    public String toString() {
	        return "Product{" +
	                "productCode='" + productCode + '\'' +
	                ", name='" + name + '\'' +
	                '}';
	    }
	}

