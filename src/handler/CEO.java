package handler;

public class CEO extends PriceHandler{
	@Override
	public void proccessDiscount(float discount) {
		if (discount <= 0.55) {
			System.out.println(this.getClass().getName() + "批准了折扣");
		} else {
			System.out.println("CEO 拒绝了 折扣");
		}
	}
}
