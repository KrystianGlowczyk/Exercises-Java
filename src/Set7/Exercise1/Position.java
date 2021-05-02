package Set7.Exercise1;

import java.io.Serializable;

public class Position implements Serializable{

	private String productName;
	private int number;
	private double price;

	public Position(String productName, int number, double price) {
		super();
		this.productName = productName;
		this.number = number;
		this.price = price;
	}

	double calculateValue() {
		double value;
		value = number * price;

		return value;
	}

	@Override
	public String toString() {

		return String.format("%s %.2f zl/szt, %d szt, %.2f zl", productName, price, number, calculateValue());
	}

	double discountedValue() {
		double value = this.calculateValue();
		if (number >= 5 && number < 10) {
			value -= value * 0.05;
		} else if (number >= 10 && number < 20) {
			value -= value * 0.1;
		} else if (number >= 20) {
			value -= value * 0.15;

		}

		return value;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
