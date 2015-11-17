package template;

public class Tea extends RefreshBeverage{

	@Override
	protected void brewDrink() {
		System.out.println("用水煮泡茶叶");
		
	}

	@Override
	protected void addCondiments() {
		System.out.println("加柠檬");
		
	}

	@Override
	protected boolean isNeedCondiments() {
		return false;
	}
	
}
