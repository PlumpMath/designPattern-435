package handler;

public class Sales extends PriceHandler{

	@Override
	public void proccessDiscount(float discount) {
		if (discount <= 0.05) {
			System.out.println(this.getClass().getName() + "批准了折扣");
		} else {
			successor.proccessDiscount(discount);
		}
	}

}
