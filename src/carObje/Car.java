package carObje;

public class Car {

	// de�i�kenler
	private String caption;
	private int price;
	private String brand;
    private String model;
	private String paint;
	// set methodlar�
	public void setCaption(String caption) {
		this.caption = caption;
	
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	// get methodlar�
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