package proxy.stat;

public class LogProxy implements Vehicle{
	private Car car;
	public LogProxy(Car car) {
		this.car = car;
	}
	
	
	@Override
	public void move() {
		System.out.println("启动汽车");
		car.move();
		System.out.println("到达目的地");
	}
	
	
}
