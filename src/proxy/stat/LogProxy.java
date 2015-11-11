package proxy.stat;

public class LogProxy implements Vehicle{
	private Car car;
	public LogProxy(Car car) {
		this.car = car;
	}
	
	
	@Override
	public void move() {
		System.out.println("��������");
		car.move();
		System.out.println("����Ŀ�ĵ�");
	}
	
	
}
