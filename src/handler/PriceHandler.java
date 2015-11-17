package handler;

/**
 * 价格处理人，负责处理客户折扣请求。
 * @author very9527
 *
 */
public abstract class PriceHandler {
	
	/**
	 * 直接后继，用于传递请求
	 */
	protected PriceHandler successor;


	public void setSuccessor(PriceHandler successor) {
		this.successor = successor;
	}
	
	/**
	 * 
	 */
	public abstract void proccessDiscount(float discount);
}
