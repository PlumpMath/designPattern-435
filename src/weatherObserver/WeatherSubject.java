package weatherObserver;

import java.util.ArrayList;
import java.util.List;

/**
 *  目标对象， 它知道观察它的观察者，并提供注册（添加）和删除观察者的接口。
 * @author very9527
 *
 */
public class WeatherSubject {
	// 用来保存注册的观察者对象。
	private List<Observer> observerList = new ArrayList<Observer>();
	
	// 把订阅天气的人添加到订阅者列表中。
	public void attach(Observer observer) {
		observerList.add(observer);
	}
	
	// 删除集合中的指定订阅天气的人
	public void detach(Observer observer) {
		observerList.remove(observer);
	}
	
	/**
	 * 通知已经订阅天气的人。
	 */
	protected void notifyObservers() {
		for (Observer observer : observerList) {
			observer.update(this);
		}
	}
}
