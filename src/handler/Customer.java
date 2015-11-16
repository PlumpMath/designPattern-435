package handler;

public class Customer {
	private PriceHandler priceHandler;
	

	public void setPriceHandler(PriceHandler priceHandler) {
		this.priceHandler = priceHandler;
	}
	
	public void requestDiscount(float discount){
		priceHandler.proccessDiscount(discount);
	}



	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());
		customer.requestDiscount((float) 0.04);
	}
}
