package carObje;

public class Car {

	// değişkenler
	private String caption;
	private int price;
	private String brand;
    private String model;
	private String paint;
	// set methodları
	public void setCaption(String caption) {
		this.caption = caption;
	
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	// get methodları
	public String getCaption() {

		return this.caption;
	}

	public int getPrice() {
		return this.price;
	}

	public String getBrand() {
		return this.brand;
	}	
	
}