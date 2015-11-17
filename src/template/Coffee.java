package template;

public class Coffee extends RefreshBeverage{
	@Override
	protected void brewDrink() {
		System.out.println("用水冲泡咖啡");
		
	}

	@Override
	protected void addCondiments() {
		System.out.println("加糖和牛奶");
		
	}

	@Override
	protected boolean isNeedCondiments() {
		return true;
	}
}
