package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		Car car = new Car();
		InvocationHandler h = new LogHandler(car);
		Class<?> cls = car.getClass();
		Vehicle vehicle = (Vehicle)Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
		vehicle.move();
	}
}
