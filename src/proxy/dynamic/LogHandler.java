package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler{
	
	private Object target;
	
	public LogHandler (Object target) {
		super();
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("启动汽车");
		method.invoke(target);
		System.out.println("到达目的地");
		return null;
	}

}
