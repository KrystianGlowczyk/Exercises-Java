package Set7.Exercise1;

import java.io.Serializable;
import java.util.Arrays;

public class Order implements Serializable{

	private int maxS;
	private int addedCounter = 0;
	private Position[] tab;

	private double discount;
	private double aferDiscount;

	public Order() {
		maxS = 10;
		tab = new Position[maxS];
	}

	public Order(int maxS) {
		// super();
		this.maxS = maxS;
		tab = new Position[maxS];
	}

	void addPosition(Position p) {
		int add;
		boolean flag = true;
		for (int i = 0; i < addedCounter; i++) {
			if (tab[i].getProductName() == p.getProductName()) {
				add = tab[i].getNumber() + p.getNumber();
				tab[i].setNumber(add);
				flag = false;
				break;
			}
		}
		if (flag) {
			tab[addedCounter] = p;
			addedCounter++;
		}

	}

	double calcValue() {

		double value = 0;
		discount = 0;
		aferDiscount = 0;
		for (int i = 0; i < addedCounter; i++) {
			value += tab[i].calculateValue();
		}

		for (int i = 0; i < addedCounter; i++) {
			aferDiscount += tab[i].discountedValue();
		}

		discount = value - aferDiscount;

		return value;
	}

	@Override
	public String toString() {

		Position[] p = new Position[addedCounter];
		for (int i = 0; i < addedCounter; i++) {
			p[i] = tab[i];
		}

		return String.format("\nZamowienie: \n %s, \nRazem: %.2f zl, Rabat: %.2f zl, Cena po rabacie: %.2f zl",
				Arrays.toString(p), calcValue(), discount, aferDiscount);
	}

	void deletePosition(int i) {
		Position[] tmp = new Position[maxS];
		int k = 0;

		for (int j = 0; j < addedCounter; j++) {
			if (j != i) {
				tmp[k] = tab[j];
				k++;
			}
		}

		tab = tmp;
		addedCounter--;
	}

	void updatePosition(int i, String name, double price, int quantity) {
		for (int j = 0; j < addedCounter; j++) {
			if (j == i) {
				tab[i].setProductName(name);
				tab[i].setPrice(price);
				tab[i].setNumber(quantity);
			}
		}
	}

}
