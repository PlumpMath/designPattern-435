package weatherObserver;

public class Client {
	public static void main(String[] args) {
		ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
		
		
		ConcreteObserver observerGirl = new ConcreteObserver();
		observerGirl.setObserverName("女朋友");
		observerGirl.setRemindThing("可以约会");
		
		ConcreteObserver observerMather = new ConcreteObserver();
		observerMather.setObserverName("老妈");
		observerMather.setRemindThing("可以购物");
		
		weather.attach(observerGirl);
		weather.attach(observerMather);
		
		//4.发布目标天气
		weather.setWeatherContent("天气晴朗，温度27度");
	}
}
