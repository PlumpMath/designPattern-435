package graphic;

import java.util.ArrayList;
import java.util.List;

/**
 *  目标对象， 它知道观察它的观察者，并提供注册（添加）和删除观察者的接口。
 * @author very9527
 *
 */
public class Subject {
	// 用来保存注册的观察者对象。
	private List<Observer> observerList = new ArrayList<Observer>();
	
	// attach detach notifyObservers
	public void attach(Observer observer) {
		observerList.add(observer);
	}
	
	// delete notifyObserver
	public void detach(Observer observer) {
		observerList.remove(observer);
	}
	
	/**
	 * 通知所有注册的观察者对象。
	 */
	protected void notifyObservers() {
		for (Observer observer : observerList) {
			observer.update(this);
		}
	}
}
