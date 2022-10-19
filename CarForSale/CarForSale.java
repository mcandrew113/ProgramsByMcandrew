package CarForSale;

public class CarForSale {
	String carModel;
	int carYear;
	double carPrice;

	public CarForSale(String carModel, double carPrice, int carYear) { // constructor
		this.carModel = carModel;
		this.carPrice = carPrice;
		this.carYear = carYear;
	}

	public CarForSale() { // constructor

	}

	public String getModel() {

		return carModel;
	}

	public double getPrice() {

		return carPrice;
	}

	public int getYear() {

		return carYear;
	}

	public void setModel(String modelFromUser) {

		this.carModel = modelFromUser;
	}

	public void setPrice(double priceFromUser) {

		this.carPrice = priceFromUser;
	}

	public void setYear(int yearFromUser) {

		this.carYear = yearFromUser;
	}

	public String toString() {
		return "Please enter the model.*price.*year.*model.*price.*year.*" + carModel + ".*" + carPrice + ".*" + carYear
				+ ".*" + carModel + ".*" + carPrice;

	}

	public static void main(String[] args) {

	}
}