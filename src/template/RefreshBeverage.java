package template;

public abstract class RefreshBeverage {
	/**
	 * 制备饮料的模版方法
	 * 封装所有子类共同遵循的算法框架
	 */
	public final void prepareBeverageTemplate() {
		//1、将水煮沸
		boilWater();
		
		//2、泡制饮料
		brewDrink();
		
		//3、将饮料倒置杯中
		pourInCup();
		
		//4、加入调味料
		if(isNeedCondiments()) {
			addCondiments();
		}
	}
	
	private void boilWater() {
		System.out.println("将水煮沸");
		
	}
	
	protected abstract void brewDrink();
	
	/**
	 * 是否需要柠檬、糖等调味料。
	 * @return
	 */
	protected abstract boolean isNeedCondiments();
	

	private void pourInCup() {
		System.out.println("将饮料倒入杯中");
		
	}

	protected abstract void addCondiments();

	
}
