package handler;

public class PriceHandlerFactory {
	public static PriceHandler createPriceHandler() {
		PriceHandler sales = new Sales();
		PriceHandler CEO = new CEO();
		sales.setSuccessor(CEO);
		return sales;
	}
}
